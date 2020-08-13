package bt.gov.rsta.eralis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.eralis.component.BaseOfficeComponent;
import bt.gov.rsta.eralis.entity.BaseOfficeEntity;
import bt.gov.rsta.eralis.repository.BaseOfficeRepository;

@Service
public class BaseOfficeService implements BaseOfficeComponent{

	@Autowired
	private BaseOfficeRepository baseOfficeRepository;
	
	public List<BaseOfficeEntity> baseOfficeDetail() {
		List <BaseOfficeEntity> baseOfficeDetails = new ArrayList<>();
		baseOfficeRepository.findAll().forEach(baseOfficeDetails::add);
		return baseOfficeDetails;
	}

}
