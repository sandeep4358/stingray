package in.co.stl.service;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {

	public String sayHello() {
		System.out.println("------------------->");
		return "Hello from Spring service";
	}

}