package com.LMS.DTO;

import java.io.Serializable;

public class FuelDto implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String placeoffuel;

private Integer NumberofLitre;

private Integer pricePerlitre;

private String state;

private String paymentMode;

private Integer totalAmount;

private String rowID;



public String getRowID() {
	return rowID;
}

public void setRowID(String rowID) {
	this.rowID = rowID;
}

public Integer getTotalAmount() {
	return totalAmount;
}

public void setTotalAmount(Integer totalAmount) {
	this.totalAmount = totalAmount;
}

public String getPlaceoffuel() {
	return placeoffuel;
}

public void setPlaceoffuel(String placeoffuel) {
	this.placeoffuel = placeoffuel;
}

public Integer getNumberofLitre() {
	return NumberofLitre;
}

public void setNumberofLitre(Integer numberofLitre) {
	NumberofLitre = numberofLitre;
}

public Integer getPricePerlitre() {
	return pricePerlitre;
}

public void setPricePerlitre(Integer pricePerlitre) {
	this.pricePerlitre = pricePerlitre;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getPaymentMode() {
	return paymentMode;
}

public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}


}
