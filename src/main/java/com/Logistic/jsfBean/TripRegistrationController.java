package com.Logistic.jsfBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.LMS.DTO.ExpenseOnTripBilled;
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
	@PostConstruct
	public  void init() {
		this.preFillDiesel();
		this.preFillBilledExpese();
	}
	private List<ExpenseOnTripBilled> billedExpense;
	
	
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
		List<ExpenseOnTripBilled> abilledExpense=new ArrayList<>(5);
		
		for(int i=0;i<=4;i++) {
			ExpenseOnTripBilled bExpenseOnTripBilled=new ExpenseOnTripBilled();
			bExpenseOnTripBilled.setRowID("Billed Expense Report"+i);
			abilledExpense.add(bExpenseOnTripBilled);
		}
		if(this.billedExpense==null) {
			this.billedExpense=new ArrayList<>();
		}
		this.billedExpense.addAll(abilledExpense);
	}
	private void preFillDiesel() {
		List<FuelDto> aFuelDto = new ArrayList<>();
		for (int i = 0; i <= 4; i++) {
			FuelDto bFuelDto = new FuelDto();
			bFuelDto.setRowID("Diesel Expense Row"+String.valueOf(i));
			aFuelDto.add(bFuelDto);
		}
		if (this.fuelDtoForTable == null) {
			this.fuelDtoForTable = new ArrayList<>();
			
		}
		fuelDtoForTable.addAll(aFuelDto);
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

	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg=null;
		if( event.getObject() instanceof FuelDto) {
			msg = new FacesMessage("Fuel Edited", ((FuelDto) event.getObject()).getRowID());
		}
		if( event.getObject() instanceof ExpenseOnTripBilled) {
			 msg = new FacesMessage("Expense Edited", ((ExpenseOnTripBilled) event.getObject()).getRowID());
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg=null;
		if( event.getObject() instanceof FuelDto) {
			msg = new FacesMessage("Fuel Edited", ((FuelDto) event.getObject()).getRowID());
		}
		if( event.getObject() instanceof ExpenseOnTripBilled) {
			 msg = new FacesMessage("Expense Edited", ((ExpenseOnTripBilled) event.getObject()).getRowID());
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
