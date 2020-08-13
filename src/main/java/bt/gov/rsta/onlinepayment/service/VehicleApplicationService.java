package bt.gov.rsta.onlinepayment.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.onlinepayment.component.VehicleApplicationComponent;
import bt.gov.rsta.onlinepayment.entity.PaymentEntity;
import bt.gov.rsta.onlinepayment.entity.TaskDetailEntity;
import bt.gov.rsta.onlinepayment.entity.VehicleApplicationEntity;
import bt.gov.rsta.onlinepayment.entity.WorkFlowDetailEntity;
import bt.gov.rsta.onlinepayment.repository.PaymentRepository;
import bt.gov.rsta.onlinepayment.repository.TaskDetailRepository;
import bt.gov.rsta.onlinepayment.repository.VehicleApplicationRepository;
import bt.gov.rsta.onlinepayment.repository.WorkFlowDetailRepository;

@Service
public class VehicleApplicationService  implements VehicleApplicationComponent {

	@Autowired
	private VehicleApplicationRepository vehicleApplicationRepository;
	
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private WorkFlowDetailRepository workFlowDetailRepository;
	
	@Autowired
	private TaskDetailRepository taskDetailRepository;

	
	@Transactional
	@Override
	public void insertVehicleApplicationWithType(String Service_Type, String Service_Identifier, String submittedTo,
			VehicleApplicationEntity vehicleApplication) {
		
		PaymentEntity vehiclePaymentEntity = new PaymentEntity();
		WorkFlowDetailEntity workflowDetailEntity = new WorkFlowDetailEntity();
		TaskDetailEntity taskDetailEntity = new TaskDetailEntity();
		
		//append date format in application
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yy");
				String dateString = simpleDateFormat.format(new Date());
				String day = dateString.split("/")[0];
				String month = dateString.split("/")[1];
				String year = dateString.split("/")[2];
				
				
				//random number generation
				Random rand = new Random();
				int number = rand.nextInt((99999 - 100) + 1) + 10;
				
				
				workflowDetailEntity.setInstance_Id(number);
				taskDetailEntity.setInstance_Id(number);
				
				String unsplitData = submittedTo;
				String arrayData[] = unsplitData.split("_");
				workflowDetailEntity.setJuris_Type_Id(Integer.parseInt(arrayData[0]));
				workflowDetailEntity.setJuris_Id(Integer.parseInt(arrayData[1]));
				
				String applicationNo = "PN" + year + month + day + number;
				System.out.println(applicationNo);
				vehicleApplication.setApplication_Number(applicationNo);
				vehiclePaymentEntity.setApplication_Number(applicationNo);
				workflowDetailEntity.setApplication_Number(applicationNo);
				taskDetailEntity.setApplication_Number(applicationNo);
		
				
				if(Service_Identifier .equalsIgnoreCase("renewal") || Service_Identifier.equalsIgnoreCase("DUPLICATION")) {
					vehicleApplicationRepository.save(vehicleApplication);	
					paymentRepository.save(vehiclePaymentEntity);
					workFlowDetailRepository.save(workflowDetailEntity);
					taskDetailRepository.save(taskDetailEntity);
				}
	}

}
