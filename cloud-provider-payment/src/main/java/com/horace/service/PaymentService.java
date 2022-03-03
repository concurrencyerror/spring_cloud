package com.horace.service;

import entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 2022/2/25
 * com.horace.service
 * horace
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param( "id" ) Long id);
}
