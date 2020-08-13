package bt.gov.rsta.onlinepayment.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import bt.gov.rsta.onlinepayment.entity.VehicleApplicationEntity;

@Component
public interface VehicleApplicationComponent {

	public void insertVehicleApplicationWithType(@PathVariable String Service_Type, @PathVariable String Service_Identifier, @PathVariable String submittedTo, @RequestBody VehicleApplicationEntity vehicleApplication);
}
