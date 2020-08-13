package bt.gov.rsta.eralis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bt.gov.rsta.eralis.entity.RenewalConstantEntity;

@Repository
public interface RenewalConstantRepository extends JpaRepository<RenewalConstantEntity, Integer>{
	
	@Query("select a from RenewalConstantEntity a where a.Vehicle_Type_Id=?1 ")
	public List<RenewalConstantEntity> getRenewalDuration(int vehicle_Type_Id);

}
