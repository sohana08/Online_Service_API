package bt.gov.rsta.eralis.component;

import java.util.List;

import org.springframework.stereotype.Component;

import bt.gov.rsta.eralis.entity.BaseOfficeEntity;

@Component
public interface BaseOfficeComponent {
	
	public List<BaseOfficeEntity> baseOfficeDetail();

}
