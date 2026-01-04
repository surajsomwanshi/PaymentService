package com.codewithsuraj.PaymentService.service;

import com.codewithsuraj.PaymentService.model.PaymentRequest;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);
}
