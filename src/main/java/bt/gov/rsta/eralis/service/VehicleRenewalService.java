package bt.gov.rsta.eralis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.eralis.component.VehicleRenewalComponent;
import bt.gov.rsta.eralis.entity.VehicleRenewalEntity;
import bt.gov.rsta.eralis.repository.VehicleRenewalRepository;

@Service
public class VehicleRenewalService implements VehicleRenewalComponent{

	@Autowired
	private VehicleRenewalRepository vehicleRenewalRepository;

	
	public List<VehicleRenewalEntity> vehicleRenewalDetails() {
		
		List <VehicleRenewalEntity> vehicleRenewalDetails = new ArrayList<>();
		vehicleRenewalRepository.findAll().forEach(vehicleRenewalDetails::add);
		return vehicleRenewalDetails;
	}
	

}
