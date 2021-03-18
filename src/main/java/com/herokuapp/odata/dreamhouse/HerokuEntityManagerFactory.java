package com.herokuapp.odata.dreamhouse;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.HashMap;

public class HerokuEntityManagerFactory {

	public static final String PUNIT_NAME = "dreamhousePersistenceUnit";
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