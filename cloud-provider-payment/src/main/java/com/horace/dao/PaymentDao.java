package com.horace.dao;

import com.horace.entity.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 2022/2/25
 * com.horace.dao
 * horace
 */
@Mapper
public interface PaymentDao {

    @Insert( "insert into payment(serial) values (#{serial})" )
    int create(Payment payment);

    @Select( "select * from payment where id=#{id}" )
    Payment getPaymentById(@Param( "id" ) Long id);
}
