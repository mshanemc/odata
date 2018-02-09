package com.herokuapp.odata.sap.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name="inventory")
public class Inventory {

	@Id
	private Integer id;

	private String serialnumber;

	private String partnumber;

	private String description;

}
