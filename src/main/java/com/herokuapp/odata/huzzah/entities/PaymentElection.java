package com.herokuapp.odata.huzzah.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Data;

@Entity
@Data
@Table(name="payment_elections")
public class PaymentElection {

	@Id
	private Integer id;

	private String worker_id;

	private String default_country;

	private String default_currency;

	private String status;

	private String pay_type;

	private String payment_method;

	private String payment_account_type;

	private String payment_account_number;

	private String distribution;

}
