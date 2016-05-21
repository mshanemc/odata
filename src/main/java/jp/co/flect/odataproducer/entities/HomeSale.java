package jp.co.flect.odataproducer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Data;
import org.apache.olingo.odata2.api.edm.Edm;
import org.apache.olingo.odata2.core.edm.EdmDouble;

@Entity
@Data
@Table(name="home_sales")
public class HomeSale {

	@Id
	private Integer id;

	private String address;

	private String city;

	private String state;

	private EdmDouble longitude;

	private EdmDouble latitude;

	private Integer price;

}
