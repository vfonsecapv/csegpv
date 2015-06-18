package caixaseguradora.service.controller

import caixaseguradora.service.model.Produto

import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.*
import org.springframework.context.annotation.*
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand

import org.springframework.cloud.netflix.hystrix.EnableHystrix

import caixaseguradora.data.RedisConfig

@Configuration
@EnableAutoConfiguration
@EnableHystrix
@RestController
@RequestMapping("/produto")
class ProdutoController {
	@Autowired
	RedisConfig redis

	@HystrixCommand
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	newProduto(@RequestBody Produto produto) {
		redis.setEntity("prd:" + produto.id, produto)
	}

	@HystrixCommand
	@RequestMapping("/produtos")
	@ResponseBody
	getAllProdutos() {
		def prdKeys = redis.getTemplate().keys("prd:*")
		def produtos = []

		prdKeys.eachWithIndex { value, i ->
		  produtos << redis.getEntity(Produto.class, value)
		}

		produtos
	}

	@HystrixCommand
	@RequestMapping("/prd/{key}")
	@ResponseBody
	getProdutoByKey(@PathVariable("key") String key) {
		redis.getEntity(Produto.class, "prd:" + key)
	}

	@HystrixCommand
	@RequestMapping("/del/{key}")
	@ResponseBody
	deleteProdutoByKey(@PathVariable("key") String key) {
		redis.getTemplate().delete("prd:" + key)
	}
}