package bt.gov.rsta.onlinepayment.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="t_workflow_dtls")
public class WorkFlowDetailEntity {
	
	
	@Id
	private int Instance_Id;
	private String Application_Number ;
	private int Status_Id;
	private int Service_Id;
	private Date Action_Date;
	private String 	Actor_Id;
	private String 	Actor_Name;
	private int Role_Id;
	private String 	Role_Name;
	private int Juris_Id;
	private int Juris_Type_Id;
	
	public WorkFlowDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WorkFlowDetailEntity(int instance_Id, String application_Number, int status_Id, int service_Id,
			Date action_Date, String actor_Id, String actor_Name, int role_Id, String role_Name, int juris_Id,
			int juris_Type_Id) {
		super();
		Instance_Id = instance_Id;
		Application_Number = application_Number;
		Status_Id = status_Id;
		Service_Id = service_Id;
		Action_Date = action_Date;
		Actor_Id = actor_Id;
		Actor_Name = actor_Name;
		Role_Id = role_Id;
		Role_Name = role_Name;
		Juris_Id = juris_Id;
		Juris_Type_Id = juris_Type_Id;
	}

	public int getInstance_Id() {
		return Instance_Id;
	}

	public void setInstance_Id(int instance_Id) {
		Instance_Id = instance_Id;
	}

	public String getApplication_Number() {
		return Application_Number;
	}

	public void setApplication_Number(String application_Number) {
		Application_Number = application_Number;
	}

	public int getStatus_Id() {
		return Status_Id;
	}

	public void setStatus_Id(int status_Id) {
		Status_Id = status_Id;
	}

	public int getService_Id() {
		return Service_Id;
	}

	public void setService_Id(int service_Id) {
		Service_Id = service_Id;
	}

	public Date getAction_Date() {
		return Action_Date;
	}

	public void setAction_Date(Date action_Date) {
		Action_Date = action_Date;
	}

	public String getActor_Id() {
		return Actor_Id;
	}

	public void setActor_Id(String actor_Id) {
		Actor_Id = actor_Id;
	}

	public String getActor_Name() {
		return Actor_Name;
	}

	public void setActor_Name(String actor_Name) {
		Actor_Name = actor_Name;
	}

	public int getRole_Id() {
		return Role_Id;
	}

	public void setRole_Id(int role_Id) {
		Role_Id = role_Id;
	}

	public String getRole_Name() {
		return Role_Name;
	}

	public void setRole_Name(String role_Name) {
		Role_Name = role_Name;
	}

	public int getJuris_Id() {
		return Juris_Id;
	}

	public void setJuris_Id(int juris_Id) {
		Juris_Id = juris_Id;
	}

	public int getJuris_Type_Id() {
		return Juris_Type_Id;
	}

	public void setJuris_Type_Id(int juris_Type_Id) {
		Juris_Type_Id = juris_Type_Id;
	}

}
