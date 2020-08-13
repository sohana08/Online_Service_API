package bt.gov.rsta.eralis.component;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import bt.gov.rsta.eralis.entity.VehicleRegistrationEntity;

@Component
public interface VehicleRegistrationComponent {
	
	public List<VehicleRegistrationEntity> vehicleRegistrationDetails();
	
	 public VehicleRegistrationEntity getParticularVehicleDetails(@PathVariable int Vehicle_Type_Id, @PathVariable String Vehicle_Number);

}
