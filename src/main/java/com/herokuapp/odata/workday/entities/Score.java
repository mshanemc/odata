package com.herokuapp.odata.workday.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="workday.scores")
public class Score {

	@Id
	private Integer id;

	private Integer candidate;

	private String attribute;

	private Integer score;

}
