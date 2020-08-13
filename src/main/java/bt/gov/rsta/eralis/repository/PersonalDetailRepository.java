package bt.gov.rsta.eralis.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bt.gov.rsta.eralis.entity.PersonalDetailEntity;

@Repository
public interface PersonalDetailRepository extends JpaRepository<PersonalDetailEntity, Integer>{
	
}
