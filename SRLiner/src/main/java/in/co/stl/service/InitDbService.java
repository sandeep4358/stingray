package in.co.stl.service;

import in.co.stl.entity.CT12112;
import in.co.stl.repository.CheckRepository;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitDbService {

	@Autowired
	private CheckRepository checkRepository;
	
/*	@PostConstruct
*/	public void init() {
		CT12112 check = new CT12112();
		check.setName("example");
		check.setUrl("http://www.example.com");
		checkRepository.save(check);
	}
	
}