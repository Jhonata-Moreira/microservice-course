package com.devsuperior.hrpayholl.service;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayholl.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Jhonata", 200.0, days);
	}
}
