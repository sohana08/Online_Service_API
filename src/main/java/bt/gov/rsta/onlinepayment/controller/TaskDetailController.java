package bt.gov.rsta.onlinepayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.onlinepayment.entity.TaskDetailEntity;
import bt.gov.rsta.onlinepayment.service.TaskDetailService;

@RestController
@CrossOrigin(origins="*")
public class TaskDetailController {

	@Autowired
	private TaskDetailService taskDetailService;
	
	@RequestMapping(value="/taskDetail/taskId={Task_Id}", method = RequestMethod.GET)
	public TaskDetailEntity taskDetail(@PathVariable int Task_Id) {
		TaskDetailEntity taskDetail = taskDetailService.taskDetail(Task_Id);
		return taskDetail;
	}
	
}
