package com.Logistic.jsfBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import com.LMS.jpaconnectivity.EmployeeJpadaoimpl;

@ViewScoped
@ManagedBean
public class HeyBuddy {

private String name;

public HeyBuddy() {
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void performtheAction() {
	System.out.println(this.getName());
}
}
