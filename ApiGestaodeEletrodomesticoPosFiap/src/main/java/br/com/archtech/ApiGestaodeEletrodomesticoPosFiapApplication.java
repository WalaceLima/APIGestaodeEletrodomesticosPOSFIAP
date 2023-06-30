package br.com.archtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"com.beta.replyservice", "com.beta.ruleService"})
@SpringBootApplication
public class ApiGestaodeEletrodomesticoPosFiapApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGestaodeEletrodomesticoPosFiapApplication.class, args);
	}

}
