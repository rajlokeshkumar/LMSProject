package com.Logistic.jsfBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import com.LMS.jpaconnectivity.EmployeeJpadaoimpl;

@ViewScoped
@ManagedBean
public class HeyBuddy implements PhaseListener {

private String name;

private String name1;



public String getName1() {
	return name1;
}

public void setName1(String name1) {
	this.name1 = name1;
}

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
@Override
public void afterPhase(PhaseEvent event) {
System.out.println(event.getPhaseId());
	
}
@Override
public void beforePhase(PhaseEvent event) {
	System.out.println(event.getPhaseId());
	
}
@Override
public PhaseId getPhaseId() {
	// TODO Auto-generated method stub
	return null;
}



}
