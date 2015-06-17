package caixaseguradora;

import feign.Feign
import feign.jackson.JacksonDecoder

/**
 * 
 * @author TER01074
 *
 */
public class ProdutoRepositoryFactory {

	/**
	 * 
	 * @param url
	 * @return
	 */
	public ProdutoRepository create(String url) {	
		ProdutoRepository produtoRepository = Feign.builder()
				.decoder(new JacksonDecoder())
				.target(ProdutoRepository.class, url);
		produtoRepository.getProdutos();
	}

	/**
	 * 
	 * @param url
	 * @return
	 */
	public ProdutoRepository create(URL url) {
		return create(url.toString());
	}

}


