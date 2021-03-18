package com.herokuapp.odata.grocery;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

public class HerokuEntityManagerFactory {

	public static final String PUNIT_NAME = "groceryPersistenceUnit";
	private static final EntityManagerFactory INSTANCE;

	static {
		String jdbcUrl = System.getenv("JDBC_DATABASE_URL");
		if (jdbcUrl == null) {
			throw new IllegalStateException("JDBC_DATABASE_URL not found");
		}
		jdbcUrl = jdbcUrl + "&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
		Map<String, String> properties = new HashMap<>();
		properties.put("javax.persistence.jdbc.url", jdbcUrl);
		INSTANCE = Persistence.createEntityManagerFactory(PUNIT_NAME, properties);
	}

	public static EntityManagerFactory getInstance() {
		return INSTANCE;
	}
}