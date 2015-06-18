package caixaseguradora.hystrix

import org.springframework.web.bind.annotation.*
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*

import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard

@SpringBootApplication
@EnableHystrixDashboard
class CaixaSeguradoraApplication {
	@RequestMapping("/")
	def home() {
		 "forward:/hystrix"
	}

	static void main(String... args) {
        SpringApplication.run(CaixaSeguradoraApplication, args)
    }
}