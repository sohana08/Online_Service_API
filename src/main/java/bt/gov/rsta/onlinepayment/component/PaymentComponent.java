package bt.gov.rsta.onlinepayment.component;

import org.springframework.stereotype.Component;

import bt.gov.rsta.onlinepayment.entity.PaymentEntity;

@Component
public interface PaymentComponent {
	
	public PaymentEntity paymentDetail(int payment_Id);
	

}
