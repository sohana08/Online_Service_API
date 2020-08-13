package bt.gov.rsta.eralis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.configuration.RenewalConstantComponent;
import bt.gov.rsta.eralis.entity.RenewalConstantEntity;
import bt.gov.rsta.eralis.repository.RenewalConstantRepository;

@Service
public class RenewalConstantService implements RenewalConstantComponent{
	
	@Autowired
	private RenewalConstantRepository renewalConstantRepository;

	public List<RenewalConstantEntity> renewalConstantDetail() {
		List <RenewalConstantEntity> renewalConstantDetail = new ArrayList<>();
		renewalConstantRepository.findAll().forEach(renewalConstantDetail::add);
		return renewalConstantDetail;
		
	}

	public List<RenewalConstantEntity> getRenewalDuration(int vehicle_Type_Id) {
		List<RenewalConstantEntity> getRenewalDuration = renewalConstantRepository.getRenewalDuration(vehicle_Type_Id);
		return getRenewalDuration;
	}

}
