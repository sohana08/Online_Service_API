package bt.gov.rsta.onlinepayment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.onlinepayment.component.WorkFlowDetailComponent;
import bt.gov.rsta.onlinepayment.entity.WorkFlowDetailEntity;
import bt.gov.rsta.onlinepayment.repository.WorkFlowDetailRepository;

@Service
public class WorkFlowDetailService implements WorkFlowDetailComponent {

	@Autowired
	private WorkFlowDetailRepository workFlowDetailRepository;
	
	
	public List<WorkFlowDetailEntity> getWorkFlowDetail() {
		List<WorkFlowDetailEntity> getWorkFlowDetail = new ArrayList<>();
		workFlowDetailRepository.findAll().forEach(getWorkFlowDetail::add);
		return getWorkFlowDetail;
	}


}
