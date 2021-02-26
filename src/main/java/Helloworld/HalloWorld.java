package Helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={
		"Helloworld"})
public class HalloWorld{
	public static void main(String [] argus) {
		
		
		System.out.println("********************* Starting ********************************");
		SpringApplication.run(HalloWorld.class, argus);
		System.out.println("********************* Started ********************************");
	
	}

	
}