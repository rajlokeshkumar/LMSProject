package com.LMS.jpaconnectivity;

import java.io.Serializable;


public class Employee {
/*	*//**
		 * 
		 *//*
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
<!-- <persistence version="2.1" xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
	<persistence-unit name="LMSProject" transaction-type="RESOURCE_LOCAL">
	<class>com.LMS.jpaconnectivity.Employee</class>
			<properties>
			<property name="hibernate.hbm2ddl.auto" value="create-drop" />
			<property name="hibernate.show_sql" value="true" />
			<property name="hibernate.transaction.flush_before_completion" value="true" />
			
			<property name="javax.persistence.jdbc.url" value="jdbc:mysql://db4free.net:3307/lmsproject"/>
			<property name="javax.persistence.jdbc.user" value="lmsproject"/>
			<property name="javax.persistence.jdbc.password" value="lmsproject"/>
			<property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>

		</properties>
	</persistence-unit>
</persistence> -->

*/
}
