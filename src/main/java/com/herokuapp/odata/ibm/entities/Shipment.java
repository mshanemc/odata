package com.herokuapp.odata.ibm.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name="shipments")
public class Shipment {

	@Id
	private Integer id;

	private String bill_of_lading;

	private String carrier;

	private String po_number;

	private String shipment_status;

	private String shiptoaddress;

	private String shiptocity;

	private String shiptoname;

	private String shiptostate;

	private String shiptozip;

}
