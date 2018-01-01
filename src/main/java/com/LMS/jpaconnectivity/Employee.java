package com.LMS.jpaconnectivity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee extends BaseJpadao implements Serializable {
	/**
		 * 
		 */
	
	  @Id
	  @Column(name = "id")
	  private int id;
	private static final long serialVersionUID = 1L;
	@Column(name = "name", nullable = true, length = 100)
	private String name;
	@Column(name = "address", nullable = true, length = 100)
	private String address;
	@Column(name = "mobileNumber", nullable = true, length = 100)
	private String mobileNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



}
