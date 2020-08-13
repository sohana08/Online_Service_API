package bt.gov.rsta.eralis.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_vehicle_renewal_dtls")
public class VehicleRenewalEntity {
	

	@Id
	private int Vehicle_Id;
	private String Customer_Id;
	private Date Renewal_Date;
	private Date Expiry_Date;
	private String Renewal_Duration;
	
	public VehicleRenewalEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleRenewalEntity(int vehicle_Id, String customer_Id, Date renewal_Date, Date expiry_Date,
			String renewal_Duration) {
		super();
		Vehicle_Id = vehicle_Id;
		Customer_Id = customer_Id;
		Renewal_Date = renewal_Date;
		Expiry_Date = expiry_Date;
		Renewal_Duration = renewal_Duration;
	}
	public int getVehicle_Id() {
		return Vehicle_Id;
	}
	public void setVehicle_Id(int vehicle_Id) {
		Vehicle_Id = vehicle_Id;
	}
	public String getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}
	public Date getRenewal_Date() {
		return Renewal_Date;
	}
	public void setRenewal_Date(Date renewal_Date) {
		Renewal_Date = renewal_Date;
	}
	public Date getExpiry_Date() {
		return Expiry_Date;
	}
	public void setExpiry_Date(Date expiry_Date) {
		Expiry_Date = expiry_Date;
	}
	public String getRenewal_Duration() {
		return Renewal_Duration;
	}
	public void setRenewal_Duration(String renewal_Duration) {
		Renewal_Duration = renewal_Duration;
	}
	
	
	
	

}
