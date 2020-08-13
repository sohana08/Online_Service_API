package bt.gov.rsta.onlinepayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.onlinepayment.entity.VehicleApplicationEntity;
import bt.gov.rsta.onlinepayment.service.VehicleApplicationService;

@RestController
@CrossOrigin(origins="*")
public class VehicleApplicationController {
	
	@Autowired
	private VehicleApplicationService vehicleApplicationService;
	
	
	@RequestMapping(value="/vehicleApplication/{Service_Type}/{Service_Identifier}/{submittedTo}",method = RequestMethod.POST)
	public void insertVehicleApplicationWithType(@PathVariable String Service_Type, @PathVariable String Service_Identifier, @PathVariable String submittedTo, @RequestBody VehicleApplicationEntity vehicleApplication){
		vehicleApplicationService.insertVehicleApplicationWithType(Service_Type, Service_Identifier,submittedTo, vehicleApplication);
	}

}
