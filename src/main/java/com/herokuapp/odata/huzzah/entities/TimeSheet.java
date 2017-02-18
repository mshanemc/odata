package com.herokuapp.odata.huzzah.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Data;

@Entity
@Data
@Table(name="time_sheets")
public class TimeSheet {

	@Id
	private Integer id;

	private String employee_id;

	private String status;

	private String time_sheet_type;

	private Date in;

	private Date out;

	private String out_reason;

	private String waived_meal_break;

	private String comments;

}
