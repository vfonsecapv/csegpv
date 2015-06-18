package caixaseguradora.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.*

import caixaseguradora.client.*

@Profile("default")
class DefaultConfiguration {

	private String url = "http://192.168.100.7:9090";
	
	@Bean
	ProdutoRepository cityRepository() {
		new ProdutoRepositoryFactory().create(url)
	}
}