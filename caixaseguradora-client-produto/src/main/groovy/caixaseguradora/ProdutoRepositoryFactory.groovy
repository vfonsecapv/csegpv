package caixaseguradora

import feign.Feign
import feign.jackson.JacksonDecoder

class ProdutoRepositoryFactory {
	static def create(String url) {	
		ProdutoRepository produtoRepository = Feign.builder()
				.decoder(new JacksonDecoder())
				.target(ProdutoRepository.class, url)
		produtoRepository
	}
}


