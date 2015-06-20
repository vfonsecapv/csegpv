package caixaseguradora.client

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.*

@FeignClient("produto-service")
interface ProdutoRepository {
    @RequestMapping(value = "/produto/produtos", method = RequestMethod.GET)
    def getProdutos()
}