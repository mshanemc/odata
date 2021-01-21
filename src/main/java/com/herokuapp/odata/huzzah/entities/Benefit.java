package com.herokuapp.odata.huzzah.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Data;

@Entity
@Data
@Table(name="huzzah.benefits")
public class Benefit {

	@Id
	private Integer id;

	private String employee_id;

	private String benefit_plan;

	private String coverage;

	private String enroll_dependents;

	private Date submitted_on;

	private String monthly_employee_cost;

	private String status;

}
