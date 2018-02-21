package com.LMS.DTO;

public class FuelDto {

private String placeoffuel;

private int NumberofLitre;

private int pricePerlitre;

private String state;

private String paymentMode;

private int totalAmount;



public int getTotalAmount() {
	return totalAmount;
}

public void setTotalAmount(int totalAmount) {
	this.totalAmount = totalAmount;
}

public String getPlaceoffuel() {
	return placeoffuel;
}

public void setPlaceoffuel(String placeoffuel) {
	this.placeoffuel = placeoffuel;
}

public int getNumberofLitre() {
	return NumberofLitre;
}

public void setNumberofLitre(int numberofLitre) {
	NumberofLitre = numberofLitre;
}

public int getPricePerlitre() {
	return pricePerlitre;
}

public void setPricePerlitre(int pricePerlitre) {
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
