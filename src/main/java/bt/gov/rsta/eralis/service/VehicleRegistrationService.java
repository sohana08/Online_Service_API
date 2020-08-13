package bt.gov.rsta.eralis.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.eralis.component.VehicleRegistrationComponent;
import bt.gov.rsta.eralis.entity.VehicleRegistrationEntity;
import bt.gov.rsta.eralis.repository.VehicleRegistrationRepository;

@Service
public class VehicleRegistrationService implements VehicleRegistrationComponent  {

	
	@Autowired
	private VehicleRegistrationRepository vehicleRegistrationRepository;

	
	public List<VehicleRegistrationEntity> vehicleRegistrationDetails() {
		List <VehicleRegistrationEntity> vehicleRegistrationDetails = new ArrayList<>();
		vehicleRegistrationRepository.findAll().forEach(vehicleRegistrationDetails::add);
		return vehicleRegistrationDetails;
	}

	
	@Transactional
	@Override
	public VehicleRegistrationEntity getParticularVehicleDetails(int vehicle_Type_Id, String vehicle_Number) {
		VehicleRegistrationEntity specificVehicleDetail = vehicleRegistrationRepository.getParticularVehicleDetails(vehicle_Type_Id , vehicle_Number);		
		return specificVehicleDetail;
	}
	

	

}
