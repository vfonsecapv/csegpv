package caixaseguradora.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

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