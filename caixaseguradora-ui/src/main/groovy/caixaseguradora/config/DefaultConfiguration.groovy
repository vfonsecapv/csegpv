package caixaseguradora.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.*

import caixaseguradora.client.*

@Configuration
@Profile("default")
class DefaultConfiguration {

	@Bean
	ProdutoRepository cityRepository() {
		new ProdutoRepositoryFactory().create("http://192.168.100.7:9090")
	}
}