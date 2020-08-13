package bt.gov.rsta.eralis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "t_penalty_constant")
public class PenaltyConstantEntity {

	@Id
	private int Penalty_Id;
	private String Request_Type;
	private String  Service_Type;
	private int Penalty_Per_Day;
	private int Max_Penalty;
	
	public PenaltyConstantEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PenaltyConstantEntity(int penalty_Id, String request_Type, String service_Type, int penalty_Per_Day,
			int max_Penalty) {
		super();
		Penalty_Id = penalty_Id;
		Request_Type = request_Type;
		Service_Type = service_Type;
		Penalty_Per_Day = penalty_Per_Day;
		Max_Penalty = max_Penalty;
	}

	public int getPenalty_Id() {
		return Penalty_Id;
	}

	public void setPenalty_Id(int penalty_Id) {
		Penalty_Id = penalty_Id;
	}

	public String getRequest_Type() {
		return Request_Type;
	}

	public void setRequest_Type(String request_Type) {
		Request_Type = request_Type;
	}

	public String getService_Type() {
		return Service_Type;
	}

	public void setService_Type(String service_Type) {
		Service_Type = service_Type;
	}

	public int getPenalty_Per_Day() {
		return Penalty_Per_Day;
	}

	public void setPenalty_Per_Day(int penalty_Per_Day) {
		Penalty_Per_Day = penalty_Per_Day;
	}

	public int getMax_Penalty() {
		return Max_Penalty;
	}

	public void setMax_Penalty(int max_Penalty) {
		Max_Penalty = max_Penalty;
	}
	
}
