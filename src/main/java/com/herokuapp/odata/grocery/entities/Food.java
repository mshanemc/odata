package com.herokuapp.odata.grocery.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name="groceries")
public class Grocery {

	@Id
	private Integer id;

	private Integer SKU;

	private String Category;

	private String Description;

	private String Supplier;

	private String SupplierLocation;

	private Boolean Organic;

	private Boolean ContainsGluten;

	private BigDecimal SustainabilityRating;

}
