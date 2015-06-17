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
		redis.setEntity(produto.id, produto)
		redis.getEntity(Produto.class, produto.id)
	}
}