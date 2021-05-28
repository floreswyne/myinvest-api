package br.com.viniciusflores.myinvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("file:/etc/my-invest/application.properties")
@SpringBootApplication
public class MyInvestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyInvestApplication.class, args);
	}

}
