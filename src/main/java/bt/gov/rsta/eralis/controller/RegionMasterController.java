package bt.gov.rsta.eralis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.eralis.entity.RegionMasterEntity;
import bt.gov.rsta.eralis.service.RegionMasterService;

@RestController
@CrossOrigin(origins="*")
public class RegionMasterController {

	@Autowired
	public RegionMasterService regionMasterService;
	
	@RequestMapping(value="/regionDetails", method=RequestMethod.GET)
	public List<RegionMasterEntity> regionDetail() {
		return regionMasterService.regionDetail();
	}
}
