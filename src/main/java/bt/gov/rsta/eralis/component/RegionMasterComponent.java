package bt.gov.rsta.eralis.component;

import java.util.List;

import org.springframework.stereotype.Component;

import bt.gov.rsta.eralis.entity.RegionMasterEntity;

@Component
public interface RegionMasterComponent {
	
	public List<RegionMasterEntity> regionDetail();
}
