package com.gallup.gethip.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@XmlRootElement
@DatabaseTable(tableName="Orders")

public class Order {
	
	@DatabaseField(generatedId = true, columnName = "order_id")
	private int orderId;
	
	@DatabaseField(columnName = "first_name")
	private String firstName;
	
	@DatabaseField(columnName = "last_name")
	private String lastName;
	
	@DatabaseField(columnName = "gender")
	private String gender;
	
	@DatabaseField(columnName = "weight")
	private int weight;
	
	@DatabaseField(columnName = "height")
	private Double height;
	
	@DatabaseField(columnName = "age")
	private int age;
	
	@DatabaseField(columnName = "shoe_size")
	private Double shoeSize;
	
	// Skier type is the skill level of the skier.  It is usually defined as beginner, intermediate, or advanced
	@DatabaseField(columnName = "skier_type")
	private String skierType;
	
	@DatabaseField(columnName = "date_out")
	private Date dateOut;
	
	@DatabaseField(columnName = "date_due")
	private Date dateDue;
	
	@DatabaseField(columnName = "date_in")
	private Date dateIn;
	
	@DatabaseField(columnName = "price")
	private Double price;
	
	@DatabaseField(columnName = "boot_size")
	private Double bootSize;
	
	@DatabaseField(columnName = "boot_id")
	private int bootId;
	
	@DatabaseField(columnName = "ski_size")
	private Double skiSize;
	
	@DatabaseField(columnName = "ski_id")
	private int skiId;
	
	//Ski Type is the type of ski used ex: downhill ski, crosscountry ski, ect
	@DatabaseField(columnName = "ski_type")
	private String skiType;
	
	@DatabaseField(columnName = "tech_name") //Tech is short for technician
	private String techName;
	
	public Order() {
		
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Double getHeight() {
		return height;
	}
	
	public void setHeight(Double height) {
		this.height = height;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Double getShoeSize() {
		return shoeSize;
	}
	
	public void setShoeSize(Double shoeSize) {
		this.shoeSize = shoeSize;
	}
	
	public String getSkierType() {
		return skierType;
	}
	
	public void setSkierType(String skierType) {
		this.skierType = skierType;
	}
	
	public Date getDateOut() {
		return dateOut;
	}
	
	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}
	
	public Date getDateDue() {
		return dateDue;
	}
	
	public void setDateDue(Date dateDue) {
		this.dateDue = dateDue;
	}
	
	public Date getDateIn() {
		return dateIn;
	}
	
	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getBootSize() {
		return bootSize;
	}
	
	public void setBootSize(Double bootSize) {
		this.bootSize = bootSize;
	}
	
	public int getbootId() {
		return bootId;
	}
	
	public void setBootId(int bootId) {
		this.bootId = bootId;
	}
	
	public Double getSkiSize() {
		return skiSize;
	}
	
	public void setSkiSize(Double skiSize) {
		this.skiSize = skiSize;
	}
	
	public int getSkiId() {
		return skiId;
	}
	
	public void setSkiId(int skiId) {
		this.skiId = skiId;
	}
	
	public String getSkiType() {
		return skiType;
	}
	
	public void setSkiType(String skiType) {
		this.skiType = skiType;
	}
	
	public String getTechName() {
		return techName;
	}
	
	public void setTechName(String techName) {
		this.techName = techName;
	}
}