package caixaseguradora

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker

import org.springframework.web.bind.annotation.*

import org.springframework.boot.CommandLineRunner

import org.springframework.cloud.netflix.feign.EnableFeignClients

@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
class CaixaSeguradoraApplication {
	static void main(String... args) {
        SpringApplication.run(CaixaSeguradoraApplication, args)
    }
}