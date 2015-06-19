package caixaseguradora.client.cloud.connector

import org.springframework.cloud.service.AbstractServiceConnectorCreator
import org.springframework.cloud.service.ServiceConnectorConfig

import caixaseguradora.client.ProdutoRepository
import caixaseguradora.client.ProdutoRepositoryFactory
import caixaseguradora.client.cloud.WebServiceInfo

class ProdutosRepositoryConnectionCreator extends AbstractServiceConnectorCreator<ProdutoRepository, WebServiceInfo> {
    @Override
    ProdutoRepository create(WebServiceInfo serviceInfo, ServiceConnectorConfig serviceConnectorConfig) {
        new ProdutoRepositoryFactory().create(serviceInfo.getUri())
    }

}
