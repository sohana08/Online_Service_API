package bt.gov.rsta.eralis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.eralis.entity.RenewalConstantEntity;
import bt.gov.rsta.eralis.service.RenewalConstantService;

@RestController
@CrossOrigin(origins="*")
public class RenewalConstantController {
	
	@Autowired
	public RenewalConstantService renewalConstantService;
	

	@RequestMapping(value="/renewalConstantDetail", method= RequestMethod.GET)
	public List<RenewalConstantEntity> renewalConstantDetail() {
	return renewalConstantService.renewalConstantDetail();	
	}
	
	
	@RequestMapping(value="/renewalConstantDetail/vehicleTypeId={Vehicle_Type_Id}", method= RequestMethod.GET)
	@ResponseBody
	public List<RenewalConstantEntity> getRenewalDuration(@PathVariable ("Vehicle_Type_Id") int Vehicle_Type_Id ) {
		List <RenewalConstantEntity> renewalDetail = (List<RenewalConstantEntity>) renewalConstantService.getRenewalDuration(Vehicle_Type_Id );
		return renewalDetail;
	}

}
