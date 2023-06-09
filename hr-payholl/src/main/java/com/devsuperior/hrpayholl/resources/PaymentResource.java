package com.devsuperior.hrpayholl.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrpayholl.entities.Payment;
import com.devsuperior.hrpayholl.service.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
	
	@Autowired
	private PaymentService service;
	
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> findById(@PathVariable Long workerId, @PathVariable Integer days){
		Payment pagamento = service.getPayment(workerId, days);
		return ResponseEntity.ok(pagamento);
	}

}
