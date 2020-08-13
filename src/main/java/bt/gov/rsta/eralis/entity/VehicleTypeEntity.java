package bt.gov.rsta.eralis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_vehicle_type_master")
public class VehicleTypeEntity {
	
	

	@Id
	private int Vehicle_Type_Id;
	private String Vehicle_Type_Name;
	private int Vehicle_Type_Number;
	private String 	Calculation_Constant;
	
	public VehicleTypeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleTypeEntity(int vehicle_Type_Id, String vehicle_Type_Name, int vehicle_Type_Number,
			String calculation_Constant) {
		super();
		Vehicle_Type_Id = vehicle_Type_Id;
		Vehicle_Type_Name = vehicle_Type_Name;
		Vehicle_Type_Number = vehicle_Type_Number;
		Calculation_Constant = calculation_Constant;
	}

	public int getVehicle_Type_Id() {
		return Vehicle_Type_Id;
	}

	public void setVehicle_Type_Id(int vehicle_Type_Id) {
		Vehicle_Type_Id = vehicle_Type_Id;
	}

	public String getVehicle_Type_Name() {
		return Vehicle_Type_Name;
	}

	public void setVehicle_Type_Name(String vehicle_Type_Name) {
		Vehicle_Type_Name = vehicle_Type_Name;
	}

	public int getVehicle_Type_Number() {
		return Vehicle_Type_Number;
	}

	public void setVehicle_Type_Number(int vehicle_Type_Number) {
		Vehicle_Type_Number = vehicle_Type_Number;
	}

	public String getCalculation_Constant() {
		return Calculation_Constant;
	}

	public void setCalculation_Constant(String calculation_Constant) {
		Calculation_Constant = calculation_Constant;
	}

	
	
	
}
