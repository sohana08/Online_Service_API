package bt.gov.rsta.eralis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_renewal_constant")
public class RenewalConstantEntity {
	
	@Id
	private int Renewal_Constant_Id;
	private String Service_Type;
	private int Vehicle_Type_Id;
	private int Renewal_Duration_Month;
	private String Renewal_Duration_Desc;
	
	
	public RenewalConstantEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RenewalConstantEntity(int renewal_Constant_Id, String service_Type, int vehicle_Type_Id,
			int renewal_Duration_Month, String renewal_Duration_Desc) {
		super();
		Renewal_Constant_Id = renewal_Constant_Id;
		Service_Type = service_Type;
		Vehicle_Type_Id = vehicle_Type_Id;
		Renewal_Duration_Month = renewal_Duration_Month;
		Renewal_Duration_Desc = renewal_Duration_Desc;
	}
	public int getRenewal_Constant_Id() {
		return Renewal_Constant_Id;
	}
	public void setRenewal_Constant_Id(int renewal_Constant_Id) {
		Renewal_Constant_Id = renewal_Constant_Id;
	}
	public String getService_Type() {
		return Service_Type;
	}
	public void setService_Type(String service_Type) {
		Service_Type = service_Type;
	}
	public int getVehicle_Type_Id() {
		return Vehicle_Type_Id;
	}
	public void setVehicle_Type_Id(int vehicle_Type_Id) {
		Vehicle_Type_Id = vehicle_Type_Id;
	}
	public int getRenewal_Duration_Month() {
		return Renewal_Duration_Month;
	}
	public void setRenewal_Duration_Month(int renewal_Duration_Month) {
		Renewal_Duration_Month = renewal_Duration_Month;
	}
	public String getRenewal_Duration_Desc() {
		return Renewal_Duration_Desc;
	}
	public void setRenewal_Duration_Desc(String renewal_Duration_Desc) {
		Renewal_Duration_Desc = renewal_Duration_Desc;
	}
	
	
	
}
