package com.LMS.DTO;

public class ExpenseOnTripBilled {

	private String purposeOfBill;
	
	private String amountpaid;
	
	private boolean expenseBilled;

	private String rowID;
	
	
	public String getPurposeOfBill() {
		return purposeOfBill;
	}

	public void setPurposeOfBill(String purposeOfBill) {
		this.purposeOfBill = purposeOfBill;
	}

	public String getAmountpaid() {
		return amountpaid;
	}

	public void setAmountpaid(String amountpaid) {
		this.amountpaid = amountpaid;
	}

	public boolean isExpenseBilled() {
		return expenseBilled;
	}

	public void setExpenseBilled(boolean expenseBilled) {
		this.expenseBilled = expenseBilled;
	}

	public String getRowID() {
		return rowID;
	}

	public void setRowID(String rowID) {
		this.rowID = rowID;
	}
	
	
	
}
