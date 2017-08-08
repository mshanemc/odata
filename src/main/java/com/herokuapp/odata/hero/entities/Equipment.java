package com.herokuapp.odata.hero.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="equipments")
public class Equipment {

	@Id
	private Integer id;

	private String Name;

	private Integer AvailableQuantity;

	private String Description;

	private String Type;

	private String Image;

}
