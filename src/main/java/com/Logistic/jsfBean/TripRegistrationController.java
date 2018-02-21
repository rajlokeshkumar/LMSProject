package com.Logistic.jsfBean;

import javax.faces.bean.ManagedBean;

import com.LMS.DTO.TripRegisterDto;
@ManagedBean(name="TripRegistrationController")
public class TripRegistrationController {


	private TripRegisterDto tripRegisterDto;

	public TripRegisterDto getTripRegisterDto() {
		return tripRegisterDto;
	}

	public void setTripRegisterDto(TripRegisterDto tripRegisterDto) {
		this.tripRegisterDto = tripRegisterDto;
	}
	
	
	
	
}
