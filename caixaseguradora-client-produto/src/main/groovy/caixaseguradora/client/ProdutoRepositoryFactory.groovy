package caixaseguradora.client

import feign.Feign
import feign.jackson.JacksonDecoder

class ProdutoRepositoryFactory {
	ProdutoRepository create(String url) {	
		ProdutoRepository produtoRepository = Feign.builder()
				.decoder(new JacksonDecoder())
				.target(ProdutoRepository.class, url)
		produtoRepository
	}
}