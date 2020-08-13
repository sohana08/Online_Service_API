package bt.gov.rsta.onlinepayment.component;

import org.springframework.stereotype.Component;

import bt.gov.rsta.onlinepayment.entity.TaskDetailEntity;

@Component
public interface TaskDetailComponent {
	
	public TaskDetailEntity taskDetail(int task_Id);

}
