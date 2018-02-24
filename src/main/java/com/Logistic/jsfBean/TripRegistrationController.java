package com.Logistic.jsfBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
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
			bExpenseonRTOandTOLL.setRowID(String.valueOf(i));
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
			this.processDoneOnBilledExpenseTable((ExpenseOnTripBilled) event.getObject());
			msg = new FacesMessage("Expense Edited", ((ExpenseOnTripBilled) event.getObject()).getRowID());
		} else if (event.getObject() instanceof ExpenseonRTOandTOLL) {
			this.processDoneOnExpenseonRTOandToll((ExpenseonRTOandTOLL) event.getObject());
			int listmaxSize=Integer.valueOf(((ExpenseonRTOandTOLL) event.getObject()).getRowID());
			if(this.getExpenseonRTOandTOLL().size()==listmaxSize+1) {
				this.setExpenseonRTOandTOLL(FillBilledExpese(this.getExpenseonRTOandTOLL()));
			}
			msg = new FacesMessage("Expense Edited", ((ExpenseonRTOandTOLL) event.getObject()).getRowID());
		}
		this.getTripRegisterDto().setTotalExpenseForTrip(new BigDecimal(0));
		this.getTripRegisterDto().setTotalIncome(new BigDecimal(0));
		this.getTripRegisterDto().setTotalprofitOnTrip(0);
		calculateWages();
		calculateTotalhireprice();
		calculateTotalExpense();
		calculateTotalProfit();
		FacesContext.getCurrentInstance().addMessage(null, msg);
		RequestContext.getCurrentInstance().update("tripRegister:ExpenseOnRTOandToll");
	}

	private List<ExpenseonRTOandTOLL> FillBilledExpese(List<ExpenseonRTOandTOLL> pExpenseonRTOandTOLL) {
		List<ExpenseonRTOandTOLL> cExpenseonRTOandTOLL = new ArrayList<>(5);
		int size=pExpenseonRTOandTOLL.size();
		for (int i =size ; i <= size+4; i++) {
			ExpenseonRTOandTOLL bExpenseonRTOandTOLL = new ExpenseonRTOandTOLL();
			bExpenseonRTOandTOLL.setRowID(String.valueOf(i));
			cExpenseonRTOandTOLL.add(bExpenseonRTOandTOLL);
		}
		pExpenseonRTOandTOLL.addAll(cExpenseonRTOandTOLL);
		return pExpenseonRTOandTOLL;
	}
	
	
	private void processDoneOnExpenseonRTOandToll(ExpenseonRTOandTOLL pExpenseonRTOandTOLL) {
		BigDecimal totalTollAmount = new BigDecimal(0);
		BigDecimal totalRTOExpense = new BigDecimal(0);
		for (ExpenseonRTOandTOLL aExpenseonRTOandTOLL : this.getExpenseonRTOandTOLL()) {
			if (Constants.RTO.equals(aExpenseonRTOandTOLL.getExpenseType())
					&& aExpenseonRTOandTOLL.getAmountOfExpense() != null) {
				totalRTOExpense = totalRTOExpense.add(aExpenseonRTOandTOLL.getAmountOfExpense());
			} else if (Constants.TOLL.equals(aExpenseonRTOandTOLL.getExpenseType())
					&& aExpenseonRTOandTOLL.getAmountOfExpense() != null) {
				totalTollAmount = totalTollAmount.add(aExpenseonRTOandTOLL.getAmountOfExpense());
			}

		}
		this.getTripRegisterDto().setTotalexpenseonRTOandTOLL(totalRTOExpense);
		this.getTripRegisterDto().setTotalTollExpense(totalTollAmount);
	}

	private void processDoneOnBilledExpenseTable(ExpenseOnTripBilled pExpenseOnTripBilled) {
		BigDecimal totalAmountBilled = new BigDecimal(0);
		for (ExpenseOnTripBilled aExpenseOnTripBilled : this.getBilledExpense()) {
			if (aExpenseOnTripBilled.getAmountpaid() != null) {
				totalAmountBilled = totalAmountBilled.add(aExpenseOnTripBilled.getAmountpaid());
			}
		}
		this.getTripRegisterDto().setTotalBilledExpense(totalAmountBilled);
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
			String rowID=((FuelDto) event.getObject()).getRowID();
			if (this.getFuelDtoForTable().remove((FuelDto) event.getObject())) {
				FuelDto a=new FuelDto();
				a.setRowID(rowID);
				this.getFuelDtoForTable().add(a);
			}
			msg = new FacesMessage("Fuel Edited", ((FuelDto) event.getObject()).getRowID());
		} else if (event.getObject() instanceof ExpenseOnTripBilled) {
			if (this.getBilledExpense().remove((ExpenseOnTripBilled) event.getObject())) {
				this.getBilledExpense().add(new ExpenseOnTripBilled());
			}
			msg = new FacesMessage("Expense Edited", ((ExpenseOnTripBilled) event.getObject()).getRowID());
		} else if (event.getObject() instanceof ExpenseonRTOandTOLL) {
			if (this.getExpenseonRTOandTOLL().remove((ExpenseonRTOandTOLL) event.getObject())) {
				this.getExpenseonRTOandTOLL().add(new ExpenseonRTOandTOLL());
			}
			msg = new FacesMessage("Expense Edited", ((ExpenseonRTOandTOLL) event.getObject()).getRowID());
		}
		this.getTripRegisterDto().setTotalExpenseForTrip(new BigDecimal(0));
		this.getTripRegisterDto().setTotalIncome(new BigDecimal(0));
		this.getTripRegisterDto().setTotalprofitOnTrip(0);
		calculateWages();
		calculateTotalhireprice();
		calculateTotalExpense();
		calculateTotalProfit();
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

	public void calculateBaseOnInputdata() {
		this.getTripRegisterDto().setTotalExpenseForTrip(new BigDecimal(0));
		this.getTripRegisterDto().setTotalIncome(new BigDecimal(0));
		this.getTripRegisterDto().setTotalprofitOnTrip(0);
		calculateWages();
		calculateTotalhireprice();
		calculateTotalExpense();
		calculateTotalProfit();
		calculateRemainingHirePrice();
	}

	public void calculateWages() {
		if (this.getTripRegisterDto().getHireprice() != null && this.getTripRegisterDto().getHireprice() != 0) {
			BigDecimal driverWage = new BigDecimal(0);
			BigDecimal cleanerWage = new BigDecimal(0);
			BigDecimal commissionOnLoad = new BigDecimal(0);
			driverWage = BigDecimal.valueOf(this.getTripRegisterDto().getHireprice()).multiply(new BigDecimal(0.14),
					MathContext.DECIMAL32);
			cleanerWage = BigDecimal.valueOf(this.getTripRegisterDto().getHireprice()).multiply(new BigDecimal(0.02),
					MathContext.DECIMAL32);
			commissionOnLoad = BigDecimal.valueOf(this.getTripRegisterDto().getHireprice())
					.multiply(new BigDecimal(0.02), MathContext.DECIMAL32);

			this.getTripRegisterDto().setCleanerWage(cleanerWage);
			this.getTripRegisterDto().setTotalDriverWageForTrip(driverWage);
			this.getTripRegisterDto().setCommissionAsBilled(commissionOnLoad);
			if (this.getTripRegisterDto().getTotalIncome() == null) {
				this.getTripRegisterDto().setTotalIncome(new BigDecimal(0));
			}
			this.getTripRegisterDto().setTotalIncome(this.getTripRegisterDto().getTotalIncome()
					.add(BigDecimal.valueOf(this.getTripRegisterDto().getHireprice())));
		}
	}

	public void calculateTotalhireprice() {
		if (this.getTripRegisterDto().getTotalIncome() == null) {
			this.getTripRegisterDto().setTotalIncome(new BigDecimal(0));
		}
		BigDecimal totalIncome = this.getTripRegisterDto().getTotalIncome();
		if (this.getTripRegisterDto().getVehicleAdvance() != null) {
			totalIncome = totalIncome.add(this.getTripRegisterDto().getVehicleAdvance());
		}
		this.getTripRegisterDto().setTotalIncome(totalIncome);

	}

	public void calculateTotalExpense() {
		BigDecimal totalExpense = new BigDecimal(0);
		if (this.getTripRegisterDto().getTotalBilledExpense() != null) {
			totalExpense = totalExpense.add(this.getTripRegisterDto().getTotalBilledExpense());
		}
		if (this.getTripRegisterDto().getExpenseForLoading() != null) {
			totalExpense = totalExpense.add(this.getTripRegisterDto().getExpenseForLoading());
		}
		if (this.getTripRegisterDto().getExpenseForunloading() != null) {
			totalExpense = totalExpense.add(this.getTripRegisterDto().getExpenseForunloading());
		}
		if (this.getTripRegisterDto().getTotalexpenseonRTOandTOLL() != null) {
			totalExpense = totalExpense.add(this.getTripRegisterDto().getTotalexpenseonRTOandTOLL());
		}
		if (this.getTripRegisterDto().getTotalTollExpense() != null) {
			totalExpense = totalExpense.add(this.getTripRegisterDto().getTotalTollExpense());
		}
		if (this.getTripRegisterDto().getTotalDieselAmount() != null) {
			totalExpense = totalExpense.add(this.getTripRegisterDto().getTotalDieselAmount());
		}
		if (this.getTripRegisterDto().getCommissionAsBilled() != null) {
			totalExpense = totalExpense.add(this.getTripRegisterDto().getCommissionAsBilled());
		}
		if (this.getTripRegisterDto().getTotalDriverWageForTrip() != null) {
			totalExpense = totalExpense.add(this.getTripRegisterDto().getTotalDriverWageForTrip());
		}
		if (this.getTripRegisterDto().getCleanerWage() != null) {
			totalExpense = totalExpense.add(this.getTripRegisterDto().getCleanerWage());
		}

		this.getTripRegisterDto().setTotalExpenseForTrip(totalExpense);

	}

	public void calculateTotalProfit() {
		int totalProfitOnTrip = 0;
		if (this.getTripRegisterDto().getTotalExpenseForTrip() != null
				&& this.getTripRegisterDto().getTotalIncome() != null) {
			totalProfitOnTrip = this.getTripRegisterDto().getTotalIncome()
					.subtract(this.getTripRegisterDto().getTotalExpenseForTrip()).intValue();
			this.getTripRegisterDto().setTotalprofitOnTrip(totalProfitOnTrip);
		}

	}

	public void calculateRemainingHirePrice() {
		int amountPaidonOfLoad = 0;
		if (this.getTripRegisterDto().getAmountpaidonLoad() != null
				&& this.getTripRegisterDto().getHireprice() != null) {
			amountPaidonOfLoad = this.getTripRegisterDto().getHireprice().intValue()
					- this.getTripRegisterDto().getAmountpaidonLoad().intValue();
			this.getTripRegisterDto().setAmountPaidonOffload(BigDecimal.valueOf(amountPaidonOfLoad));
		}
	}

}
