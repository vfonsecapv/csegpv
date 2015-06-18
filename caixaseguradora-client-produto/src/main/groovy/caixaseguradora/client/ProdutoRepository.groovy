package caixaseguradora.client

import org.springframework.stereotype.Repository

import feign.RequestLine

@Repository
interface ProdutoRepository {

    @RequestLine("GET /produto/produtos")
    def getProdutos()

}

