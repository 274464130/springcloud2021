package com.atspringcloud.service;


import com.atspringcloud.vo.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById( Long id);
}
