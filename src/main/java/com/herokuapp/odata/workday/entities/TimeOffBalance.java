package com.herokuapp.odata.workday.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Data;

@Entity
@Data
@Table(name="time_off_balance")
public class TimeOffBalance {

	@Id
	private Integer id;

	private String employee_id;

	private String time_off_plan;

	private String unit_of_time;

	private String balance;

	private String carry_over_allowed;

}
