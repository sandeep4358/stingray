package in.co.stl;

import java.sql.SQLException;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import oracle.jdbc.pool.OracleDataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan
@Configuration //persistence layer of application
@EnableTransactionManagement
@EnableJpaRepositories
public class SpringConfiguration {
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactory.setDataSource(dataSource);
		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.hbm2ddl.auto", "create-drop");
		jpaProperties.put("hibernate.show_sql", "true");		
		jpaProperties.put("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");		
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		entityManagerFactory.setJpaProperties(jpaProperties);		
		entityManagerFactory.setPackagesToScan("in.co.stl.entity");
		entityManagerFactory.setPersistenceProvider(new HibernatePersistenceProvider());		
		return entityManagerFactory;
	}

	@Bean
	public JpaTransactionManager transactionManager(DataSource dataSource,EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager(entityManagerFactory);
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}

	@Bean
	public DataSource dataSource() throws SQLException {		
		OracleDataSource dataSource =  new OracleDataSource();
		dataSource.setUser("EMESDEV");
		dataSource.setPassword("EMESDEV");
		dataSource.setURL("jdbc:oracle:thin:@10.32.11.245:1521:EMESDEV");		
		return dataSource;
	}
}