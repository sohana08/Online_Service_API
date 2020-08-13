package bt.gov.rsta.eralis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name="t_base_office_master")
@Where(clause = "base_office_id <> 2 and base_office_id <> 9 and base_office_id <> 10 and base_office_id <> 16 and base_office_id <> 21" )
public class BaseOfficeEntity {

	@Id
	private long base_office_id;
	private String base_office_name;
	
	public BaseOfficeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseOfficeEntity(long base_office_id, String base_office_name) {
		super();
		this.base_office_id = base_office_id;
		this.base_office_name = base_office_name;
	}
	public long getBase_office_id() {
		return base_office_id;
	}
	public void setBase_office_id(long base_office_id) {
		this.base_office_id = base_office_id;
	}
	public String getBase_office_name() {
		return base_office_name;
	}
	public void setBase_office_name(String base_office_name) {
		this.base_office_name = base_office_name;
	}

	
	
	
	
}
