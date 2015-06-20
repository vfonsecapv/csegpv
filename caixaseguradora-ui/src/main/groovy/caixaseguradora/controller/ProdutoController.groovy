package caixaseguradora.controller

import org.springframework.web.bind.annotation.*

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.cloud.context.config.annotation.RefreshScope

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand

import org.springframework.web.bind.annotation.*

import caixaseguradora.client.ProdutoRepository

@RestController
@RefreshScope
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