package bt.gov.rsta.eralis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bt.gov.rsta.eralis.entity.VehicleRegistrationEntity;

@Repository
public interface VehicleRegistrationRepository extends JpaRepository<VehicleRegistrationEntity, Integer> {
	
	@Query("select a from VehicleRegistrationEntity a where a.Vehicle_Type_Id =?1 and a.Vehicle_Number=?2 ")
	VehicleRegistrationEntity getParticularVehicleDetails(int vehicle_Type_Id, String vehicle_Number);
	

}
