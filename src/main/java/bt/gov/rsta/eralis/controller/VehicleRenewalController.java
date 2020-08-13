package bt.gov.rsta.eralis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.eralis.entity.VehicleRenewalEntity;
import bt.gov.rsta.eralis.service.VehicleRenewalService;

@RestController
@CrossOrigin(origins = "*")
public class VehicleRenewalController {
	
	@Autowired
	private VehicleRenewalService vehicleRenewalService;
	
	//Get all vehicle Renewal Detail list
			@RequestMapping(value = "/vehicleRenewalDetails", method = RequestMethod.GET)
			public List<VehicleRenewalEntity> vehicleRenewalDetails() {
				return vehicleRenewalService.vehicleRenewalDetails();
			}

}
