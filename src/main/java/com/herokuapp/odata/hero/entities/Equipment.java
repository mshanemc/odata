package com.herokuapp.odata.hero.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="hero.equipments")
public class Equipment {

	@Id
	private Integer id;

	private String name;

	private Integer available_quantity;

	private String description;

	private String type;

	private String image;

}
