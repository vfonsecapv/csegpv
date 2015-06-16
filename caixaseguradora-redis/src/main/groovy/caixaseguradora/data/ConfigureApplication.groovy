package br.com.teste.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ConfigureApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigureApplication.class, args);
	}
}