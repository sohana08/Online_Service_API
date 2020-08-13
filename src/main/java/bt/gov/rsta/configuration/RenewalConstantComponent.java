package bt.gov.rsta.configuration;

import java.util.List;

import org.springframework.stereotype.Component;

import bt.gov.rsta.eralis.entity.RenewalConstantEntity;

@Component
public interface RenewalConstantComponent {

	public List<RenewalConstantEntity> renewalConstantDetail();
	
	public List<RenewalConstantEntity> getRenewalDuration(int vehicle_Type_Id);

}
