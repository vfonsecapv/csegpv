package caixaseguradora.client

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.*

@FeignClient("pessoa-service")
interface PessoaRepository {
    @RequestMapping(value = "/pessoa/pessoas", method = RequestMethod.GET)
    def getPessoas()
}