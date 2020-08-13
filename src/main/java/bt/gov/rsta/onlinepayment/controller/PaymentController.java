package bt.gov.rsta.onlinepayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.onlinepayment.entity.PaymentEntity;
import bt.gov.rsta.onlinepayment.service.PaymentService;

@RestController
@CrossOrigin(origins="*")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	
	@RequestMapping(value="/paymentDetail/paymentId={Payment_Id}", method= RequestMethod.GET)
	public PaymentEntity paymentDetail(@PathVariable int Payment_Id) {
		PaymentEntity paymentDetail = paymentService.paymentDetail(Payment_Id);
		return paymentDetail;
	}
	

}
