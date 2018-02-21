package com.Logistic.jsfBean;

import javax.faces.bean.ManagedBean;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import com.LMS.DTO.VehicleDto;

@ManagedBean(name="VehicleInformationController")
public class VehicleInformationController implements PhaseListener {
	private static final long serialVersionUID = 1L;

	private VehicleDto vehicle;
	

	public VehicleDto getVehicle() {
		if(this.vehicle==null) {
			this.vehicle=new VehicleDto();
		}
		return vehicle;
	}

	public void setVehicle(VehicleDto vehicle) {
		this.vehicle = vehicle;
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
