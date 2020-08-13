package bt.gov.rsta.eralis.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name= "t_vehicle_registration_dtls")
public class VehicleRegistrationEntity {
	

	  @Id
	  private int Vehicle_Reg_Dtls_Id;
	  private String Customer_Id;
	  private String Registration_Type;
	  private Date Expiry_Date;
	  private String Vehicle_Registration_Type;
	  private String Vehicle_Number;
	  private int Vehicle_Type_Id;
	  private String Seating_Capacity;
	  private String Loading_Capacity;
	  private String Vehicle_Horse_Power;
	  private String Engine_CC;
	  
	  
	  //Mapping Vehicle Registration and Vehicle Type Table
	  @ManyToOne(targetEntity = VehicleTypeEntity.class, cascade = CascadeType.ALL)
	  @JoinColumn(name="vehicle_type_id", referencedColumnName = "vehicle_type_id", insertable=false, updatable=false)
	  private VehicleTypeEntity vehicleTypeEntity;
	  
	 //Mapping Vehicle Registration and Vehicle Renewal Table
	 @OneToMany(targetEntity = VehicleRenewalEntity.class, cascade = CascadeType.ALL)
	 @JoinColumn(name="Vehicle_Id",insertable=false, updatable=false) 
	 @OrderBy(value="Expiry_Date ASC")
	 private Set<VehicleRenewalEntity> vehicleRenewal = new HashSet<>();
	


	  
	//Mapping vehicle Registration and Personal Detail Table
	  @OneToOne(targetEntity = PersonalDetailEntity.class, cascade =
	  CascadeType.ALL) 
	  @JoinColumn(name = "Customer_Id", referencedColumnName = "Customer_Id",insertable=false, updatable=false)
	  @Where(clause = "Registration_Type = 'P'") 
	  private PersonalDetailEntity personalDetailEntity;
		 
	  
	public VehicleRegistrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleRegistrationEntity(int vehicle_Reg_Dtls_Id, String customer_Id, String registration_Type,
			Date expiry_Date, String vehicle_Registration_Type, String vehicle_Number, int vehicle_Type_Id,
			String seating_Capacity, String loading_Capacity, String vehicle_Horse_Power, String engine_CC) {
		super();
		Vehicle_Reg_Dtls_Id = vehicle_Reg_Dtls_Id;
		Customer_Id = customer_Id;
		Registration_Type = registration_Type;
		Expiry_Date = expiry_Date;
		Vehicle_Registration_Type = vehicle_Registration_Type;
		Vehicle_Number = vehicle_Number;
		Vehicle_Type_Id = vehicle_Type_Id;
		Seating_Capacity = seating_Capacity;
		Loading_Capacity = loading_Capacity;
		Vehicle_Horse_Power = vehicle_Horse_Power;
		Engine_CC = engine_CC;
	}

	public int getVehicle_Reg_Dtls_Id() {
		return Vehicle_Reg_Dtls_Id;
	}

	public void setVehicle_Reg_Dtls_Id(int vehicle_Reg_Dtls_Id) {
		Vehicle_Reg_Dtls_Id = vehicle_Reg_Dtls_Id;
	}

	public String getCustomer_Id() {
		return Customer_Id;
	}

	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}

	public String getRegistration_Type() {
		return Registration_Type;
	}

	public void setRegistration_Type(String registration_Type) {
		Registration_Type = registration_Type;
	}

	public Date getExpiry_Date() {
		return Expiry_Date;
	}

	public void setExpiry_Date(Date expiry_Date) {
		Expiry_Date = expiry_Date;
	}

	public String getVehicle_Registration_Type() {
		return Vehicle_Registration_Type;
	}

	public void setVehicle_Registration_Type(String vehicle_Registration_Type) {
		Vehicle_Registration_Type = vehicle_Registration_Type;
	}

	public String getVehicle_Number() {
		return Vehicle_Number;
	}

	public void setVehicle_Number(String vehicle_Number) {
		Vehicle_Number = vehicle_Number;
	}

	public int getVehicle_Type_Id() {
		return Vehicle_Type_Id;
	}

	public void setVehicle_Type_Id(int vehicle_Type_Id) {
		Vehicle_Type_Id = vehicle_Type_Id;
	}

	public String getSeating_Capacity() {
		return Seating_Capacity;
	}

	public void setSeating_Capacity(String seating_Capacity) {
		Seating_Capacity = seating_Capacity;
	}

	public String getLoading_Capacity() {
		return Loading_Capacity;
	}

	public void setLoading_Capacity(String loading_Capacity) {
		Loading_Capacity = loading_Capacity;
	}

	public String getVehicle_Horse_Power() {
		return Vehicle_Horse_Power;
	}

	public void setVehicle_Horse_Power(String vehicle_Horse_Power) {
		Vehicle_Horse_Power = vehicle_Horse_Power;
	}

	public String getEngine_CC() {
		return Engine_CC;
	}

	public void setEngine_CC(String engine_CC) {
		Engine_CC = engine_CC;
	}	  

}
