package caixaseguradora.controller

import org.springframework.web.bind.annotation.*

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.cloud.context.config.annotation.RefreshScope

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand

import caixaseguradora.client.PessoaRepository

@RestController
@RefreshScope
@RequestMapping("/pessoas")
class PessoaController {

	PessoaRepository repository

	@Autowired
	PessoaController(PessoaRepository repository) {
		this.repository = repository
	}

	@HystrixCommand(fallbackMethod = "defaultlistarPessoas")
	@RequestMapping("/lista")	
	@ResponseBody
	def listarPessoas() {
		repository.getPessoas()
	}

	def defaultlistarPessoas() {
		"Serviço OFF!"
	}
}