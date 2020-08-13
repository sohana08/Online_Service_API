package bt.gov.rsta.eralis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.eralis.entity.BaseOfficeEntity;
import bt.gov.rsta.eralis.service.BaseOfficeService;

@RestController
@CrossOrigin(origins="*")
public class BaseOfficeController {

	@Autowired
	public BaseOfficeService baseOfficeService;
	

	@RequestMapping(value="/baseOfficeDetail", method= RequestMethod.GET)
	public List<BaseOfficeEntity> baseOfficeDetail() {
	return baseOfficeService.baseOfficeDetail();
		
		
	}
}
