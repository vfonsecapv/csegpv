package caixaseguradora.config

import org.springframework.context.annotation.*

import caixaseguradora.client.*

@Configuration
@Profile("default")
class DefaultConfiguration {

	@Bean
	ProdutoRepository produtoRepository() {
		new ProdutoRepositoryFactory().create("http://localhost:8989")
	}
}