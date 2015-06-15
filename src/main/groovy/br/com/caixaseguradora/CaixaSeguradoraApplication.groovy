package br.com.caixaseguradora

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@CompileStatic
@SpringBootApplication
class CaixaSeguradoraApplication {
    static void main(String... args) {
        SpringApplication.run(CaixaSeguradoraApplication, args)
    }
}