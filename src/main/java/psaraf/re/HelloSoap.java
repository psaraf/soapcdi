package psaraf.re;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.xml.ws.WebEndpoint;

@WebService

public class HelloSoap {

	@Inject
	SampleService sampleService;
	@WebEndpoint
	public String sayHello(String name){
		System.out.println("I got the Object "+ sampleService);
		sampleService.someMethod();
		return "Hello "+name;
		
	}
}
