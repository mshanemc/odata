package com.herokuapp.odata.huzzah.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name="home_sales")
public class HomeSale {

	@Id
	private Integer id;

	private String address;

	private String city;

	private String state;

	private Double longitude;

	private Double latitude;

	private Integer price;

}
