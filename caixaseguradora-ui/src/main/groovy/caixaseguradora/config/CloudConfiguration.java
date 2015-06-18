package caixaseguradora.config;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import caixaseguradora.client.ProdutoRepository;


@Configuration
@Profile("cloud")
public class CloudConfiguration extends AbstractCloudConfig {	

    @Bean
    public ProdutoRepository cityRepository() {
        return connectionFactory().service(ProdutoRepository.class);
    }

}

