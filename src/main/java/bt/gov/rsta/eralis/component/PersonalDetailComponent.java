package bt.gov.rsta.eralis.component;

import java.util.List;

import org.springframework.stereotype.Component;

import bt.gov.rsta.eralis.entity.PersonalDetailEntity;

@Component
public interface PersonalDetailComponent {
	
	public List<PersonalDetailEntity> personalDetails();

}
