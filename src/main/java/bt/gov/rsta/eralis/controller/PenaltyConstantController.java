package bt.gov.rsta.eralis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.eralis.entity.PenaltyConstantEntity;
import bt.gov.rsta.eralis.service.PenaltyConstantService;

@RestController
@CrossOrigin(origins = "*")
public class PenaltyConstantController {
	
	@Autowired
	public PenaltyConstantService penaltyConstantService;
	
	@RequestMapping(value="/penaltyConstantDetail", method= RequestMethod.GET)
	public List<PenaltyConstantEntity> penaltyConstantDetail() {
		return penaltyConstantService.penaltyConstantDetail();
	}
	
	
	@RequestMapping(value="/penaltyConstantDetail/penaltyConstantId={Penalty_Id}", method= RequestMethod.GET)
	public PenaltyConstantEntity penaltyConstantDetail(@PathVariable int Penalty_Id) {
		PenaltyConstantEntity penaltyConstantDetail = penaltyConstantService.penaltyConstantDetail(Penalty_Id);
		return penaltyConstantDetail;
	}

}
