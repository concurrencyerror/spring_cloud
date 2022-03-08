package com.horace.service.impl;

import com.horace.dao.PaymentDao;
import com.horace.service.PaymentService;
import entity.Payment;
import org.springframework.stereotype.Service;

/**
 * 2022/2/25
 * com.horace.service.impl
 * horace
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    private final PaymentDao paymentDao;

    public PaymentServiceImpl(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
