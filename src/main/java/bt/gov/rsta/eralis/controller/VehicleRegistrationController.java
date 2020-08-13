package bt.gov.rsta.eralis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.eralis.entity.VehicleRegistrationEntity;
import bt.gov.rsta.eralis.service.VehicleRegistrationService;

@RestController
@CrossOrigin(origins = "*")
public class VehicleRegistrationController {

	@Autowired
	private VehicleRegistrationService vehicleRegistrationService;

	//Get all vehicle Registration Detail list
	@RequestMapping(value = "/vehicleRegistrationDetails", method = RequestMethod.GET)
	public List<VehicleRegistrationEntity> vehicleRegistrationDetails() {
		return vehicleRegistrationService.vehicleRegistrationDetails();
	}



	//GET SPECIFIC DATA
	@RequestMapping(value = "/vehicleRegistrationDetails/vehicleTypeId={Vehicle_Type_Id}&&vehicleNumber={Vehicle_Number}", method = RequestMethod.GET)
	@ResponseBody
	public VehicleRegistrationEntity getParticularVehicleDetails(@PathVariable int Vehicle_Type_Id, @PathVariable String Vehicle_Number) {
		VehicleRegistrationEntity specificVehicleDetail = (VehicleRegistrationEntity) vehicleRegistrationService.getParticularVehicleDetails(Vehicle_Type_Id,Vehicle_Number);
		return specificVehicleDetail;
	}


}
