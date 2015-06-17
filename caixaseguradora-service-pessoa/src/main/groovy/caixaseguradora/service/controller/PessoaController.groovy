package caixaseguradora.service.controller

import caixaseguradora.service.model.Pessoa

import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.*

import caixaseguradora.data.RedisConfig

@RestController
@RequestMapping("/pessoa")
class ProdutoController {
	@Autowired
	RedisConfig redis

	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	newPessoa(@RequestBody Pessoa pessoa) {
		redis.setEntity("pes:" + pessoa.id, pessoa)
	}

	@RequestMapping("/pessoa/{key}")
	@ResponseBody
	getPessoaByID(@PathVariable("key") String key) {
		redis.getEntity(Pessoa.class, "pes:" + key)
	}

	@RequestMapping("/pessoas")
	@ResponseBody
	getAllPessoas() {
		def prdKeys = redis.getTemplate().keys("pes:*")
		def pessoas = []

		prdKeys.eachWithIndex { value, i ->
		  pessoas += redis.getEntity(Pessoa.class, value)
		}

		pessoas
	}
}