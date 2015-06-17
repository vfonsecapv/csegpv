package caixaseguradora.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import caixaseguradora.client.ProdutoRepository

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	private ProdutoRepository repository

	@Autowired
	ProdutoController(ProdutoRepository repository) {
		this.repository = repository
	}

	@RequestMapping(method = RequestMethod.GET)	
	def listarProdutos() {
		repository.getProdutos()
	}

}


