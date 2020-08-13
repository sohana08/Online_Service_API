package bt.gov.rsta.eralis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.eralis.component.PersonalDetailComponent;
import bt.gov.rsta.eralis.entity.PersonalDetailEntity;
import bt.gov.rsta.eralis.repository.PersonalDetailRepository;

@Service
public class PersonalDetailService implements PersonalDetailComponent {

	@Autowired
	private PersonalDetailRepository personalDetailRepository;
	
	
	public List<PersonalDetailEntity> personalDetails() {
		List <PersonalDetailEntity> personalDetails = new ArrayList<>();
		personalDetailRepository.findAll().forEach(personalDetails::add);
		return personalDetails;
	}

}
