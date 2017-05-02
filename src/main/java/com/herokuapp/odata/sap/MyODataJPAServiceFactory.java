package com.herokuapp.odata.sap;

import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;

public class MyODataJPAServiceFactory extends ODataJPAServiceFactory {

	@Override
	public ODataJPAContext initializeODataJPAContext() throws ODataJPARuntimeException {
		ODataJPAContext context = getODataJPAContext();
		context.setEntityManagerFactory(HerokuEntityManagerFactory.getInstance());
		context.setPersistenceUnitName("sapPersistenceUnit");
		return context;
	}

}