package bt.gov.rsta.eralis.component;

import java.util.List;

import org.springframework.stereotype.Component;

import bt.gov.rsta.eralis.entity.VehicleTypeEntity;

@Component
public interface VehicleTypeComponent {
	
	public List<VehicleTypeEntity> vehicleTypeDetails();
	
	public void insertData(VehicleTypeEntity vehicleType);

}
