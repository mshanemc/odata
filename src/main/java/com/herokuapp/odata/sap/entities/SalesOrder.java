package com.herokuapp.odata.sap.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name="salesorders")
public class SalesOrder {

	@Id
	private Integer orderid;

	private String businesspartnerid;

	private String companyname;

	private String status;

	private String currency;

	private BigDecimal netsum;

	private BigDecimal tax;

	private BigDecimal totalsum;

}
