package caixaseguradora.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.*

import caixaseguradora.client.*

@Profile("default")
class DefaultConfiguration {

	private String url = "http://192.168.100.7:9090";
	
	@Bean
<<<<<<< HEAD
	ProdutoRepository cityRepository() {
		new ProdutoRepositoryFactory().create(url)
=======
	ProdutoRepository produtoRepository() {
		new ProdutoRepositoryFactory().create("http://localhost:8989")
>>>>>>> 0bfa94eed77fe4013d99d29693fab07a236fb6f1
	}
}