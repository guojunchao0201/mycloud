package com.mycloud.study.payment.dao;

import com.mycloud.study.dto.Payment;

public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
