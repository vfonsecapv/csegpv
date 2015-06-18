package caixaseguradora.client.cloudfoundry;

import java.util.Map;

import org.springframework.cloud.cloudfoundry.CloudFoundryServiceInfoCreator;
import org.springframework.cloud.cloudfoundry.Tags;

import caixaseguradora.client.cloud.WebServiceInfo;

public class ProdutosWebServiceInfoCreator extends CloudFoundryServiceInfoCreator<WebServiceInfo> {

    public static final String PRODUTOS_PREFIX = "produtos";

    public ProdutosWebServiceInfoCreator() {
        super(new Tags(), PRODUTOS_PREFIX);
    }

    @Override
    public WebServiceInfo createServiceInfo(Map<String, Object> serviceData) {
        String id = (String) serviceData.get("name");

        Map<String, Object> credentials = getCredentials(serviceData);
        String uri = getUriFromCredentials(credentials);

        return new WebServiceInfo(id, uri);
    }
}


