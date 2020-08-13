package bt.gov.rsta.eralis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.eralis.component.PenaltyConstantComponent;
import bt.gov.rsta.eralis.entity.PenaltyConstantEntity;
import bt.gov.rsta.eralis.repository.PenaltyConstantRepository;

@Service
public class PenaltyConstantService implements PenaltyConstantComponent {
	

	@Autowired
	private PenaltyConstantRepository penaltyConstantRepository;

	public List<PenaltyConstantEntity> penaltyConstantDetail() {
		List <PenaltyConstantEntity> penaltyConstantDetails = new ArrayList<>();
		penaltyConstantRepository.findAll().forEach(penaltyConstantDetails::add);
		return penaltyConstantDetails;
	}

	public PenaltyConstantEntity penaltyConstantDetail(int penalty_Id) {
		return penaltyConstantRepository.findById(penalty_Id).get();
	}



}
