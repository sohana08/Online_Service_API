package bt.gov.rsta.eralis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.eralis.entity.VehicleTypeEntity;
import bt.gov.rsta.eralis.service.VehicleTypeService;

@RestController
@CrossOrigin(origins="*")
//@ComponentScan(basePackages = "{bt.gov.rsta.eralis.*}")
public class VehicleTypeController {
	
	@Autowired
	private VehicleTypeService vehicleTypeService;
	
	@RequestMapping(value = "/vehicleType", method = RequestMethod.GET)
	public List<VehicleTypeEntity> getAllVehicleType() {
		return vehicleTypeService.getVehicleType();
	}
	
	@RequestMapping(value="/vehicleType", method = RequestMethod.POST)
	public void inertData(@RequestBody VehicleTypeEntity vehicleType ) {
		vehicleTypeService.insertData(vehicleType);
	}
	

}
