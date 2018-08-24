package in.co.stl.controller;

import in.co.stl.service.HelloService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class HelloController {

	@ManagedProperty("#{helloService}")
	HelloService helloService;

	public String showHello() {
		return helloService.sayHello();
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
t
}