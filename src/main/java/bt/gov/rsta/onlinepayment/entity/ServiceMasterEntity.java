package bt.gov.rsta.onlinepayment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_service_master")
public class ServiceMasterEntity {
	
	@Id
	private int Service_Id;
	private String 	Service_Short_Desc;
	private String Service_Identifier;
	private int Page_Id;
	private String Service_Type;
	
	public ServiceMasterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceMasterEntity(int service_Id, String service_Short_Desc, String service_Identifier, int page_Id,
			String service_Type) {
		super();
		Service_Id = service_Id;
		Service_Short_Desc = service_Short_Desc;
		Service_Identifier = service_Identifier;
		Page_Id = page_Id;
		Service_Type = service_Type;
	}

	public int getService_Id() {
		return Service_Id;
	}

	public void setService_Id(int service_Id) {
		Service_Id = service_Id;
	}

	public String getService_Short_Desc() {
		return Service_Short_Desc;
	}

	public void setService_Short_Desc(String service_Short_Desc) {
		Service_Short_Desc = service_Short_Desc;
	}

	public String getService_Identifier() {
		return Service_Identifier;
	}

	public void setService_Identifier(String service_Identifier) {
		Service_Identifier = service_Identifier;
	}

	public int getPage_Id() {
		return Page_Id;
	}

	public void setPage_Id(int page_Id) {
		Page_Id = page_Id;
	}

	public String getService_Type() {
		return Service_Type;
	}

	public void setService_Type(String service_Type) {
		Service_Type = service_Type;
	}

}
