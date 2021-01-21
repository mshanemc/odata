package com.herokuapp.odata.sap.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name="sap.vehicleparts")
public class VehiclePart {

    @Id
	private String serialnumber;

	private String partnumber;

	private String description;

	private String category;

	private String vehicleid;

    private Boolean installed;

}
