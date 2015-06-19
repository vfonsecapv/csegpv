package caixaseguradora.controller

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.*

import caixaseguradora.client.ProdutoRepository

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand

@RestController
@RequestMapping("/produtos")
class ProdutoController {

	ProdutoRepository repository

	@Autowired
	ProdutoController(ProdutoRepository repository) {
		this.repository = repository
	}

	@HystrixCommand(fallbackMethod = "defaultlistarProdutos")
	@RequestMapping("/lista")	
	@ResponseBody
	def listarProdutos() {
		repository.getProdutos()
	}

	def defaultlistarProdutos() {
		"Serviço OFF!"
	}
}