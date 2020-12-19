package com.aos.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.aos.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Worker", 200.0, days);
	}
}
