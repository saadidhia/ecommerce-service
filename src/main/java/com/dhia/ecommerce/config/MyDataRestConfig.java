package com.dhia.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.dhia.ecommerce.entities.Product;
import com.dhia.ecommerce.entities.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		
		HttpMethod[] theUnsupportedActions= {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
		config.getExposureConfiguration()
		
	    .forDomainType(Product.class)
	    .withItemExposure((metadata,httpmethods)->httpmethods.disable(theUnsupportedActions))
	    .withCollectionExposure((metadata,httpmethods)->httpmethods.disable(theUnsupportedActions));
		
		
config.getExposureConfiguration()
		
	    .forDomainType(ProductCategory.class)
	    .withItemExposure((metadata,httpmethods)->httpmethods.disable(theUnsupportedActions))
	    .withCollectionExposure((metadata,httpmethods)->httpmethods.disable(theUnsupportedActions));
		
	}

}
