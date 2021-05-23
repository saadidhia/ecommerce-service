package com.dhia.ecommerce.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.dhia.ecommerce.entities.Product;
import com.dhia.ecommerce.entities.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	
	@Autowired 
	private EntityManager entityManager;
	

	MyDataRestConfig(EntityManager theentityManager){
		
		this.entityManager=theentityManager;
	}
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
exposeIds(config);
	}
	private void exposeIds(RepositoryRestConfiguration config) {
		// TODO Auto-generated method stub
		
		Set<EntityType<?>> entities =entityManager.getMetamodel().getEntities();
		System.out.println(entities);
		
		List<Class> entityClasses=new ArrayList<>();
		//System.out.println(entityClasses);
		
		
		for(EntityType tempEntityType:entities) {
			entityClasses.add(tempEntityType.getJavaType());
		}
		//System.out.println(entityClasses);
		Class[] domainTypes=entityClasses.toArray(new Class[0]);
		
		
		config.exposeIdsFor(domainTypes);
		
	}

	
	
}
