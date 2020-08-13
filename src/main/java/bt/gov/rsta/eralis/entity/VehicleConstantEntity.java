package bt.gov.rsta.eralis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "t_vehicle_constant")
public class VehicleConstantEntity {
	
	@Id
	private int Vehicle_Constant_Id;
	private int Vehicle_Type_Id;
	private float Loading_Capacity;
	private int Seating_Capacity;
	private int  Vehicle_HP;
	private int Engine_CC;
	private int  Flag;
	private int  sequence;
	private double Fees;
	private double Amount;
	private double RC_Cost;
	
	
	public VehicleConstantEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleConstantEntity(int vehicle_Constant_Id, int vehicle_Type_Id, float loading_Capacity,
			int seating_Capacity, int vehicle_HP, int engine_CC, int flag, int sequence, double fees, double amount,
			double rC_Cost) {
		super();
		Vehicle_Constant_Id = vehicle_Constant_Id;
		Vehicle_Type_Id = vehicle_Type_Id;
		Loading_Capacity = loading_Capacity;
		Seating_Capacity = seating_Capacity;
		Vehicle_HP = vehicle_HP;
		Engine_CC = engine_CC;
		Flag = flag;
		this.sequence = sequence;
		Fees = fees;
		Amount = amount;
		RC_Cost = rC_Cost;
	}
	public int getVehicle_Constant_Id() {
		return Vehicle_Constant_Id;
	}
	public void setVehicle_Constant_Id(int vehicle_Constant_Id) {
		Vehicle_Constant_Id = vehicle_Constant_Id;
	}
	public int getVehicle_Type_Id() {
		return Vehicle_Type_Id;
	}
	public void setVehicle_Type_Id(int vehicle_Type_Id) {
		Vehicle_Type_Id = vehicle_Type_Id;
	}
	public float getLoading_Capacity() {
		return Loading_Capacity;
	}
	public void setLoading_Capacity(float loading_Capacity) {
		Loading_Capacity = loading_Capacity;
	}
	public int getSeating_Capacity() {
		return Seating_Capacity;
	}
	public void setSeating_Capacity(int seating_Capacity) {
		Seating_Capacity = seating_Capacity;
	}
	public int getVehicle_HP() {
		return Vehicle_HP;
	}
	public void setVehicle_HP(int vehicle_HP) {
		Vehicle_HP = vehicle_HP;
	}
	public int getEngine_CC() {
		return Engine_CC;
	}
	public void setEngine_CC(int engine_CC) {
		Engine_CC = engine_CC;
	}
	public int getFlag() {
		return Flag;
	}
	public void setFlag(int flag) {
		Flag = flag;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public double getFees() {
		return Fees;
	}
	public void setFees(double fees) {
		Fees = fees;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public double getRC_Cost() {
		return RC_Cost;
	}
	public void setRC_Cost(double rC_Cost) {
		RC_Cost = rC_Cost;
	}
	
	
}
