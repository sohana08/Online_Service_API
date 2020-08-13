package bt.gov.rsta.eralis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.eralis.component.RegionMasterComponent;
import bt.gov.rsta.eralis.entity.RegionMasterEntity;
import bt.gov.rsta.eralis.repository.RegionMasterRepository;

@Service
public class RegionMasterService implements RegionMasterComponent {
	
	@Autowired 
	public  RegionMasterRepository regionMasterRepository;



	public List<RegionMasterEntity> regionDetail() {
		List <RegionMasterEntity> regionDetail = new ArrayList<>();
		regionMasterRepository.findAll().forEach(regionDetail::add);
		return regionDetail;
	}

}
