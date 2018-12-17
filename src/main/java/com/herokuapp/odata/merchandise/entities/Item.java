package com.herokuapp.odata.merchandise.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name="items")
public class Item {

	@Id
	private Integer id;

	private String SKU;

	private String Name;

	private String Category;

	private String Description;

	private BigDecimal Cost;

	private BigDecimal MinimumPrice;

}
