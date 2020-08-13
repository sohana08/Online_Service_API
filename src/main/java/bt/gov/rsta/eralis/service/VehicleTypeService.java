package bt.gov.rsta.eralis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.eralis.entity.VehicleTypeEntity;
import bt.gov.rsta.eralis.repository.VehicleTypeRepository;

@Service
public class VehicleTypeService {
	
	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;

	public List<VehicleTypeEntity> getVehicleType() {

		List <VehicleTypeEntity> vehicleType = new ArrayList<>();
		vehicleTypeRepository.findAll().forEach(vehicleType::add);
		return vehicleType;
	}

	public void insertData(VehicleTypeEntity vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}

}
