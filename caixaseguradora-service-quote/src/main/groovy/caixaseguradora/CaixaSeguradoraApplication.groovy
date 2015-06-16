package caixaseguradora

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import groovy.transform.CompileStatic

@CompileStatic
@SpringBootApplication
class CaixaSeguradoraApplication {
	static void main(String... args) {
        SpringApplication.run(CaixaSeguradoraApplication, args)
    }
}