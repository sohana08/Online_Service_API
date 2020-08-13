package bt.gov.rsta.onlinepayment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.onlinepayment.component.TaskDetailComponent;
import bt.gov.rsta.onlinepayment.entity.TaskDetailEntity;
import bt.gov.rsta.onlinepayment.repository.TaskDetailRepository;

@Service
public class TaskDetailService implements TaskDetailComponent {

	@Autowired
	private TaskDetailRepository taskDetailRepository;
	
	public TaskDetailEntity taskDetail(int task_Id) {
		return taskDetailRepository.findById(task_Id).get();
		
	}

}
