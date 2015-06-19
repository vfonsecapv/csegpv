package caixaseguradora.service.controller

import caixaseguradora.service.model.Produto

import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.*

import caixaseguradora.data.RedisConfig

@RestController
@RequestMapping("/produto")
class ProdutoController {
	@Autowired
	RedisConfig redis

	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	newProduto(@RequestBody Produto produto) {
		redis.setEntity("prd:" + produto.id, produto)
	}

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

	@RequestMapping("/prd/{key}")
	@ResponseBody
	getProdutoByKey(@PathVariable("key") String key) {
		redis.getEntity(Produto.class, "prd:" + key)
	}

	@RequestMapping("/del/{key}")
	@ResponseBody
	deleteProdutoByKey(@PathVariable("key") String key) {
		redis.getTemplate().delete("prd:" + key)
	}
}