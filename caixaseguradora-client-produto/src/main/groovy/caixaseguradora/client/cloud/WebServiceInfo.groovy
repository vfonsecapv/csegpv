package caixaseguradora.client.cloud

import org.springframework.cloud.service.UriBasedServiceInfo

class WebServiceInfo extends UriBasedServiceInfo {
	
    WebServiceInfo(String id, String url) {
        super(id, url)
    }

}
