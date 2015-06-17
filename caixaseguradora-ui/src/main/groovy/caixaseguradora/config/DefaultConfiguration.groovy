package caixaseguradora.config;

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

import caixaseguradora.client.ProdutoRepository
import caixaseguradora.client.ProdutoRepositoryFactory

@Configuration
@Profile("default")
public class DefaultConfiguration {

	@Bean
	public ProdutoRepository cityRepository() {
		return new ProdutoRepositoryFactory().create("http://192.168.100.7:9090");
	}

}