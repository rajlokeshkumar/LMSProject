package com.Logistic.jsfBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.LMS.DTO.Constants;
import com.LMS.DTO.ExpenseOnTripBilled;
import com.LMS.DTO.ExpenseonRTOandTOLL;
import com.LMS.DTO.FuelDto;
import com.LMS.DTO.TripRegisterDto;

@ViewScoped
@ManagedBean(name = "TripRegistrationController")
public class TripRegistrationController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TripRegisterDto tripRegisterDto;

	private List<FuelDto> fuelDtoForTable;

	private List<ExpenseOnTripBilled> billedExpense;

	private List<ExpenseonRTOandTOLL> expenseonRTOandTOLL = new ArrayList<>(8);

	private List<Constants> typeOfExpense = new ArrayList<>();

	private List<String> paymentType = new ArrayList<>();

	private List<String> listOfStates = new ArrayList<>();

	public List<String> getListOfStates() {
		return listOfStates;
	}

	public void setListOfStates(List<String> listOfStates) {
		this.listOfStates = listOfStates;
	}

	public List<String> getPaymentType() {

		return paymentType;
	}

	public void setPaymentType(List<String> paymentType) {
		this.paymentType = paymentType;
	}

	public List<Constants> getTypeOfExpense() {

		return typeOfExpense;
	}

	public void setTypeOfExpense(List<Constants> typeOfExpense) {
		this.typeOfExpense = typeOfExpense;
	}

	public List<ExpenseonRTOandTOLL> getExpenseonRTOandTOLL() {
		return expenseonRTOandTOLL;
	}

	public void setExpenseonRTOandTOLL(List<ExpenseonRTOandTOLL> expenseonRTOandTOLL) {
		this.expenseonRTOandTOLL = expenseonRTOandTOLL;
	}

	@PostConstruct
	public void init() {
		this.preFillDiesel();
		this.preFillBilledExpese();
		this.preFillRTOandTOLLExpense();
		this.preFillStates();
	}

	private void preFillRTOandTOLLExpense() {
		List<ExpenseonRTOandTOLL> aExpenseonRTOandTOLL = new ArrayList<>(8);
		for (int i = 0; i < 8; i++) {
			ExpenseonRTOandTOLL bExpenseonRTOandTOLL = new ExpenseonRTOandTOLL();
			bExpenseonRTOandTOLL.setRowID("Expense on Toll" + i);
			aExpenseonRTOandTOLL.add(bExpenseonRTOandTOLL);
		}
		this.getExpenseonRTOandTOLL().addAll(aExpenseonRTOandTOLL);
		typeOfExpense.add(Constants.RTO);
		typeOfExpense.add(Constants.TOLL);
	}

	public List<ExpenseOnTripBilled> getBilledExpense() {
		return billedExpense;
	}

	public void setBilledExpense(List<ExpenseOnTripBilled> billedExpense) {
		this.billedExpense = billedExpense;
	}

	public List<FuelDto> getFuelDtoForTable() {
		if (this.fuelDtoForTable == null) {
			this.fuelDtoForTable = new ArrayList<>();

		}
		return fuelDtoForTable;
	}

	private void preFillBilledExpese() {
		List<ExpenseOnTripBilled> abilledExpense = new ArrayList<>(5);

		for (int i = 0; i <= 4; i++) {
			ExpenseOnTripBilled bExpenseOnTripBilled = new ExpenseOnTripBilled();
			bExpenseOnTripBilled.setRowID("Billed Expense Report" + i);
			abilledExpense.add(bExpenseOnTripBilled);
		}
		if (this.billedExpense == null) {
			this.billedExpense = new ArrayList<>();
		}
		this.billedExpense.addAll(abilledExpense);
	}

	private void preFillDiesel() {
		List<FuelDto> aFuelDto = new ArrayList<>();
		for (int i = 0; i <= 4; i++) {
			FuelDto bFuelDto = new FuelDto();
			bFuelDto.setRowID("Diesel Expense Row" + String.valueOf(i));
			aFuelDto.add(bFuelDto);
		}
		if (this.fuelDtoForTable == null) {
			this.fuelDtoForTable = new ArrayList<>();

		}
		paymentType.add("CREDIT");
		paymentType.add("CASH");

		fuelDtoForTable.addAll(aFuelDto);
	}

	private void preFillStates() {
		listOfStates.add("Andhra Pradesh");
		listOfStates.add("Arunachal Pradesh");
		listOfStates.add("Assam");
		listOfStates.add("Bihar");
		listOfStates.add("Chhattisgarh");
		listOfStates.add("Goa");
		listOfStates.add("Gujarat ");
		listOfStates.add("Haryana ");
		listOfStates.add("Himachal Pradesh ");
		listOfStates.add("Jammu & Kashmir");
		listOfStates.add("Jharkhand ");
		listOfStates.add("Karnataka ");
		listOfStates.add("Kerala");
		listOfStates.add("Madhya Pradesh ");
		listOfStates.add("Maharashtra ");
		listOfStates.add("Manipur ");
		listOfStates.add("Meghalaya ");
		listOfStates.add("Mizoram ");
		listOfStates.add("Nagaland");
		listOfStates.add("Orissa ");
		listOfStates.add("Punjab ");
		listOfStates.add("Rajasthan ");
		listOfStates.add("Sikkim ");
		listOfStates.add("Tamil Nadu ");
		listOfStates.add("Telangana ");
		listOfStates.add("Tripura ");
		listOfStates.add("Uttar Pradesh ");
		listOfStates.add("Uttarakhand ");
		listOfStates.add("West Bengal ");

	}

	public void setFuelDtoForTable(List<FuelDto> fuelDtoForTable) {
		this.fuelDtoForTable = fuelDtoForTable;
	}

	public TripRegisterDto getTripRegisterDto() {
		if (this.tripRegisterDto == null) {
			this.tripRegisterDto = new TripRegisterDto();
		}
		return tripRegisterDto;
	}

	public void setTripRegisterDto(TripRegisterDto tripRegisterDto) {
		this.tripRegisterDto = tripRegisterDto;
	}

	public void onRowEdit(RowEditEvent event) throws ParseException {
		FacesMessage msg = null;
		if (event.getObject() instanceof FuelDto) {
			processDoneOnFuelTable((FuelDto) event.getObject());
			msg = new FacesMessage("Fuel Edited", ((FuelDto) event.getObject()).getRowID());
		} else if (event.getObject() instanceof ExpenseOnTripBilled) {
			msg = new FacesMessage("Expense Edited", ((ExpenseOnTripBilled) event.getObject()).getRowID());
		} else if (event.getObject() instanceof ExpenseonRTOandTOLL) {
			msg = new FacesMessage("Expense Edited", ((ExpenseonRTOandTOLL) event.getObject()).getRowID());
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	private void processDoneOnFuelTable(FuelDto pFuelDto) throws ParseException {
		if (pFuelDto.getNumberofLitre() != null && pFuelDto.getPricePerlitre() != null) {
			BigDecimal totalamount = pFuelDto.getNumberofLitre().multiply(pFuelDto.getPricePerlitre());
			pFuelDto.setTotalAmount(totalamount);
		} else if (pFuelDto.getNumberofLitre() != null && pFuelDto.getTotalAmount() != null) {
			BigDecimal pricePerLitre = pFuelDto.getTotalAmount().divide(pFuelDto.getNumberofLitre(), 2,
					RoundingMode.HALF_UP);
			pFuelDto.setPricePerlitre(pricePerLitre);
		}

		if (this.getTripRegisterDto().getTotalDieselAmount() == null) {
			this.getTripRegisterDto().setTotalDieselAmount(new BigDecimal(0));
		}
		BigDecimal totalFuelAmount = new BigDecimal(0);
		for (FuelDto aFuelDto : this.getFuelDtoForTable()) {
			if (aFuelDto.getTotalAmount() != null) {
				totalFuelAmount = totalFuelAmount.add(aFuelDto.getTotalAmount());
			}
		}

		this.getTripRegisterDto().setTotalDieselAmount(totalFuelAmount);

	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = null;
		if (event.getObject() instanceof FuelDto) {
			msg = new FacesMessage("Fuel Edited", ((FuelDto) event.getObject()).getRowID());
		} else if (event.getObject() instanceof ExpenseOnTripBilled) {
			msg = new FacesMessage("Expense Edited", ((ExpenseOnTripBilled) event.getObject()).getRowID());
		} else if (event.getObject() instanceof ExpenseonRTOandTOLL) {
			msg = new FacesMessage("Expense Edited", ((ExpenseonRTOandTOLL) event.getObject()).getRowID());
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onCellEdit(CellEditEvent event) {
		Object oldValue = event.getOldValue();
		Object newValue = event.getNewValue();

		if (newValue != null && !newValue.equals(oldValue)) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed",
					"Old: " + oldValue + ", New:" + newValue);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public void processButton() {

	}

}
