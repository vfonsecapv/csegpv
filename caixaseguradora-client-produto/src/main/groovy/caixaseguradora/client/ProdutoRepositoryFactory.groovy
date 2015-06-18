package caixaseguradora.client

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.hateoas.hal.Jackson2HalModule

import feign.Feign
import feign.jackson.JacksonDecoder
import caixaseguradora.client.ProdutoRepository

class ProdutoRepositoryFactory {
	ProdutoRepository create(String url) {	
		ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(new Jackson2HalModule())
		
		Feign.builder()
        	.decoder(new JacksonDecoder(mapper))
			.target(ProdutoRepository.class, url)
	}

	ProdutoRepository create(URL url) {
	    create(url.toString())
	}
}