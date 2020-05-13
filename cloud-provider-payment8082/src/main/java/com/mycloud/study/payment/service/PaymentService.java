package com.mycloud.study.payment.service;

import com.mycloud.study.dto.Payment;
import com.mycloud.study.payment.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 24513
 */
@Service
public class PaymentService {
    @Autowired
    PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
