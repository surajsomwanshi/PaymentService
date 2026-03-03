package com.codewithsuraj.PaymentService.service;

import com.codewithsuraj.PaymentService.model.PaymentRequest;
import com.codewithsuraj.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetails(long orderId);
}
