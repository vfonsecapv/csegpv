package caixaseguradora.config

import org.springframework.cloud.config.java.AbstractCloudConfig
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

import caixaseguradora.client.ProdutoRepository

@Configuration
@Profile("cloud")
class CloudConfiguration extends AbstractCloudConfig {	

    @Bean
    ProdutoRepository produtoRepository() {
        connectionFactory().service(ProdutoRepository.class)
    }
}