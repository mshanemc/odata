package com.herokuapp.odata.huzzah.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Data;

@Entity
@Data
@Table(name="jobs")
public class Job {

	@Id
	private Integer id;

	private String job_code;

	private String job_title;

	private String job_description;

	private String job_category;

	private String standard_hours;

	private String standard_work_period;

	private String grade_level;

	private String employee_type;

	private String minimum_salary;

	private String mid_point_salary;

	private String maximum_salary;

	private String compensation_frequency;

	private String currency;

	private String job_status;

	private String job_family;

}
