package caixaseguradora.data

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import groovy.transform.CompileStatic

@CompileStatic
@SpringBootApplication
class ConfigureApplication {
	static void main(String... args) {
		SpringApplication.run(ConfigureApplication, args);
	}
}