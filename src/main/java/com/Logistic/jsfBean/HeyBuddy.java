package com.Logistic.jsfBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.LMS.jpaconnectivity.EmployeeJpadaoimpl;

@RequestScoped
@ManagedBean
public class HeyBuddy {

private String name="lk";

public HeyBuddy() {
	name="Lokeshkumar";
	EmployeeJpadaoimpl a=new EmployeeJpadaoimpl();
	a.selectemp();
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
	

}
