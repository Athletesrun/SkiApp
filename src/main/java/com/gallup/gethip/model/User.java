package com.gallup.gethip.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@XmlRootElement
@DatabaseTable(tableName="Users")

public class User {
	
	@DatabaseField(generatedId = true, columnName = "user_id")
	private int userId;
	
	@DatabaseField(columnName = "first_name")
	private String firstName;
	
	@DatabaseField(columnName = "middle_initial")
	private String middleInitial;
	
	@DatabaseField(columnName = "last_name")
	private String lastName;
	
	@DatabaseField(columnName = "address")
	private String address;
	
	@DatabaseField(columnName = "birth_date")
	private Date birthDate;
	
	public User() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleInitial() {
		return middleInitial;
	}
	
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}