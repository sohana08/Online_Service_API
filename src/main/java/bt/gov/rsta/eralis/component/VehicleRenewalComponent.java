package bt.gov.rsta.eralis.component;

import java.util.List;

import org.springframework.stereotype.Component;

import bt.gov.rsta.eralis.entity.VehicleRenewalEntity;

@Component
public interface VehicleRenewalComponent {
	
	public List<VehicleRenewalEntity> vehicleRenewalDetails();
}
