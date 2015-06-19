package caixaseguradora

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker

@EnableCircuitBreaker
@SpringBootApplication
class CaixaSeguradoraApplication {
	static void main(String... args) {
        SpringApplication.run(CaixaSeguradoraApplication, args)
    }
}