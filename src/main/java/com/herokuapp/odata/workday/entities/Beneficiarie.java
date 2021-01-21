package com.herokuapp.odata.workday.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Data;

@Entity
@Data
@Table(name="workday.beneficiaries")
public class Beneficiarie {

	@Id
	private Integer id;

	private String employee_id;

	private String beneficiary_name;

	private String beneficiary_relationship;

	private String benefit_elections;

	private Integer percent;
}
