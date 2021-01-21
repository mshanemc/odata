package com.herokuapp.odata.workday.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Data;

@Entity
@Data
@Table(name="workday.time_off")
public class TimeOff {

	@Id
	private Integer id;

	private String employee_id;

	private Date date_time_off;

	private String day_of_the_week;

	private String type;

	private String requested;

	private String unit_of_time;

	private String comments;

	private String status;

}
