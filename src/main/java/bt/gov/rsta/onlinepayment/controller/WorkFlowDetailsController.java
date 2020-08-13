package bt.gov.rsta.onlinepayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.onlinepayment.entity.WorkFlowDetailEntity;
import bt.gov.rsta.onlinepayment.service.WorkFlowDetailService;

@RestController
@CrossOrigin(origins="*")
public class WorkFlowDetailsController {
	
	@Autowired
	private WorkFlowDetailService workFlowDetailService;
	
	@RequestMapping(value="/workFlowDetail", method = RequestMethod.GET)
	public List<WorkFlowDetailEntity> getWorkFlowDetail() {
		return workFlowDetailService.getWorkFlowDetail();
	}
	

}
