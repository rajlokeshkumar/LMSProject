package com.Logistic.jsfBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import com.LMS.DTO.Vehicle;
import com.LMS.jpaconnectivity.EmployeeJpadaoimpl;

@ViewScoped
@ManagedBean
public class HeyBuddy implements PhaseListener {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private Vehicle vehicle;
	

	public Vehicle getVehicle() {
		if(this.vehicle==null) {
			this.vehicle=new Vehicle();
		}
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public HeyBuddy() {

	}

	

	public void performtheAction() {
		
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
