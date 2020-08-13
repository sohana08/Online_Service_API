package bt.gov.rsta.onlinepayment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.onlinepayment.component.PaymentComponent;
import bt.gov.rsta.onlinepayment.entity.PaymentEntity;
import bt.gov.rsta.onlinepayment.repository.PaymentRepository;

@Service
public class PaymentService implements PaymentComponent {

	@Autowired
	private PaymentRepository paymentRepository;
	
	public PaymentEntity paymentDetail(int payment_Id) {
		return paymentRepository.findById(payment_Id).get();	
	}

}
