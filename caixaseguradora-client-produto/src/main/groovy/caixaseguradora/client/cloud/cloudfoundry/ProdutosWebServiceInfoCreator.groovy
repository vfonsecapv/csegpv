package caixaseguradora.client.cloud.cloudfoundry

import java.util.Map

import org.springframework.cloud.cloudfoundry.CloudFoundryServiceInfoCreator
import org.springframework.cloud.cloudfoundry.Tags

import caixaseguradora.client.cloud.WebServiceInfo

class ProdutosWebServiceInfoCreator extends CloudFoundryServiceInfoCreator<WebServiceInfo> {

    static final String PRODUTO_TAG = "produto"

    ProdutosWebServiceInfoCreator() {
        super(new Tags(PRODUTO_TAG), "")
    }

    @Override
    boolean accept(Map<String, Object> serviceData) {
        Map<String, Object> credentials = getCredentials(serviceData)
        String tag = (String) credentials.get("tag")
        super.accept(serviceData) || PRODUTO_TAG.equals(tag)
    }

    @Override
    WebServiceInfo createServiceInfo(Map<String, Object> serviceData) {
        String id = (String) serviceData.get("name")

        Map<String, Object> credentials = getCredentials(serviceData);
        String uri = getStringFromCredentials(credentials, "uri", "url")

        new WebServiceInfo(id, uri)
    }

    @SuppressWarnings("unchecked")
    Map<String, Object> getCredentials(Map<String, Object> serviceData) {
        (Map<String, Object>) serviceData.get("credentials")
    }
}



