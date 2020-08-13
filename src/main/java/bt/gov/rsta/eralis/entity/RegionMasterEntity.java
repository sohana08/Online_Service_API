package bt.gov.rsta.eralis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_region_master")
public class RegionMasterEntity {
	
	@Id
	private int region_id;
	private String 	region_name;
	
	public RegionMasterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegionMasterEntity(int region_id, String region_name) {
		super();
		this.region_id = region_id;
		this.region_name = region_name;
	}

	public int getRegion_id() {
		return region_id;
	}

	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

}
