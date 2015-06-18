package caixaseguradora.controller

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.*

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

import caixaseguradora.client.ProdutoRepository

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.cloud.netflix.hystrix.EnableHystrix

@Configuration
@EnableAutoConfiguration
@EnableHystrix
@RestController
@RequestMapping("/produtos")
class ProdutoController {

	@Autowired
	ProdutoRepository repository

	ProdutoController() {}

	ProdutoController(ProdutoRepository repository) {
		this.repository = repository
	}

	@HystrixCommand
	@RequestMapping("/listar")	
	def listarProdutos() {
		repository.getProdutos()
	}
}