package caixaseguradora.client

import feign.RequestLine

import org.springframework.stereotype.*

@Component
interface ProdutoRepository {
    @RequestLine("GET /produto/produtos")
    def getProdutos()

}

