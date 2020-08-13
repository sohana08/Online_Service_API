package bt.gov.rsta.eralis.component;

import java.util.List;

import org.springframework.stereotype.Component;

import bt.gov.rsta.eralis.entity.PenaltyConstantEntity;

@Component
public interface PenaltyConstantComponent {
	
	public List<PenaltyConstantEntity> penaltyConstantDetail();
	
	public PenaltyConstantEntity penaltyConstantDetail(int penalty_Id);

}
