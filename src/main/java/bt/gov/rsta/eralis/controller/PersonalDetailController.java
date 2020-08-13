package bt.gov.rsta.eralis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.eralis.entity.PersonalDetailEntity;
import bt.gov.rsta.eralis.service.PersonalDetailService;

@RestController
@CrossOrigin(origins = "*")
public class PersonalDetailController {
	
	@Autowired
	private PersonalDetailService personalDetailService;
	
	@RequestMapping(value = "/personalDetails", method = RequestMethod.GET)
	public List<PersonalDetailEntity> personalDetails() {
		return personalDetailService.personalDetails();
	}
	

}
