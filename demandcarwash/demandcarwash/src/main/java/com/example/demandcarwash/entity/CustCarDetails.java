package com.example.demandcarwash.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "custCarDetails")
public class CustCarDetails {
	String _id;
	String userName;
	String carName;
	String paymentDetails;
	String packAge;
	String date;
	String time;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public String getPackAge() {
		return packAge;
	}
	public void setPackAge(String packAge) {
		this.packAge = packAge;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}