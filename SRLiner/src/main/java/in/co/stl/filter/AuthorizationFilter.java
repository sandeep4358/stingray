package in.co.stl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * 
 * @author sandeep.kumar
 *
 */
@WebFilter(filterName = "AuthFilter", urlPatterns = { "*.xhtml" })
public class AuthorizationFilter implements Filter {

	public void destroy() {
		System.out.print("authenticaiton destroy :: ");
		
	}

	public void doFilter(ServletRequest request, ServletResponse Response,
			FilterChain filter) throws IOException, ServletException {
		System.out.println("AuthorizationFilter :: start :: ");
		
		System.out.println("AuthorizationFilter :: end :: ");
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		
		System.out.print("authenticaiton initilize :: ");
	}

}
