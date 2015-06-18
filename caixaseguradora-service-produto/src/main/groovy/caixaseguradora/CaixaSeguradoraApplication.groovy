package caixaseguradora

import org.springframework.web.bind.annotation.*
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*

@SpringBootApplication
class CaixaSeguradoraApplication {
	@RequestMapping("/")
	public String home() {
		"forward:/hystrix";
	}

	static void main(String... args) {
        SpringApplication.run(CaixaSeguradoraApplication, args)
    }
}