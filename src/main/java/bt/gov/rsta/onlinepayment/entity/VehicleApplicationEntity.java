package bt.gov.rsta.onlinepayment.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_vehicle_application")
public class VehicleApplicationEntity {

	@Id
	private String Application_Number;
	private String 	Application_Type;
	private String 	Customer_Id;
	private String Amount;
	private int Vehicle_Id;
	private int Renewal_Duration;
	private String Renewal_Amount;
	private String 	Created_By;
	private Date Created_On;
	
	public VehicleApplicationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleApplicationEntity(String application_Number, String application_Type, String customer_Id,
			String amount, int vehicle_Id, int renewal_Duration, String renewal_Amount, String created_By,
			Date created_On) {
		super();
		Application_Number = application_Number;
		Application_Type = application_Type;
		Customer_Id = customer_Id;
		Amount = amount;
		Vehicle_Id = vehicle_Id;
		Renewal_Duration = renewal_Duration;
		Renewal_Amount = renewal_Amount;
		Created_By = created_By;
		Created_On = created_On;
	}

	public String getApplication_Number() {
		return Application_Number;
	}

	public void setApplication_Number(String application_Number) {
		Application_Number = application_Number;
	}

	public String getApplication_Type() {
		return Application_Type;
	}

	public void setApplication_Type(String application_Type) {
		Application_Type = application_Type;
	}

	public String getCustomer_Id() {
		return Customer_Id;
	}

	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public int getVehicle_Id() {
		return Vehicle_Id;
	}

	public void setVehicle_Id(int vehicle_Id) {
		Vehicle_Id = vehicle_Id;
	}

	public int getRenewal_Duration() {
		return Renewal_Duration;
	}

	public void setRenewal_Duration(int renewal_Duration) {
		Renewal_Duration = renewal_Duration;
	}

	public String getRenewal_Amount() {
		return Renewal_Amount;
	}

	public void setRenewal_Amount(String renewal_Amount) {
		Renewal_Amount = renewal_Amount;
	}

	public String getCreated_By() {
		return Created_By;
	}

	public void setCreated_By(String created_By) {
		Created_By = created_By;
	}

	public Date getCreated_On() {
		return Created_On;
	}

	public void setCreated_On(Date created_On) {
		Created_On = created_On;
	}
	
}
