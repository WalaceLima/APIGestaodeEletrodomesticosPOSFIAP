package br.com.archtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"br.com.archtech"} )
public class ApiGestaodeEletrodomesticoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run
		(ApiGestaodeEletrodomesticoApplication.class, args);
	}
	private static Class<ApiGestaodeEletrodomesticoApplication>
	applicationClass = ApiGestaodeEletrodomesticoApplication.class;
	@Override
	protected SpringApplicationBuilder configure
	(SpringApplicationBuilder builder) {
	return builder.sources(applicationClass);
	}

}
