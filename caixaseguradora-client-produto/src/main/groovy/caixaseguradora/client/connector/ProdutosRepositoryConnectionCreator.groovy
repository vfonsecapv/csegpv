package caixaseguradora.client.connector;

import org.springframework.cloud.service.AbstractServiceConnectorCreator;
import org.springframework.cloud.service.ServiceConnectorConfig;

import caixaseguradora.client.ProdutoRepository;
import caixaseguradora.client.ProdutoRepositoryFactory;
import caixaseguradora.client.cloud.WebServiceInfo;

public class ProdutosRepositoryConnectionCreator extends AbstractServiceConnectorCreator<ProdutoRepository, WebServiceInfo> {

    @Override
    public ProdutoRepository create(WebServiceInfo serviceInfo, ServiceConnectorConfig serviceConnectorConfig) {
        return new ProdutoRepositoryFactory().create(serviceInfo.getUri());
    }

}
