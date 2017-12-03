package com.example.domain;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Emplyee implements Serializable{
	
	
	private static final long serialVersionUID = -5386237805850347816L;

	@Column(name="dept_id")
	private long deptId;

	@Id
	private long id;

	private String name;

	private double salary;

}
