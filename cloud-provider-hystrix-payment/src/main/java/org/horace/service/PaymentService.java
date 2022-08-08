package org.horace.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * 2022/6/19
 * org.horace.service
 * horace
 */
@Service
public class PaymentService {
    /**
     * 正常的方法，肯定ok的方法
     *
     * @param id
     * @return
     */
    public String paymentInfo(Integer id) {
        return "线程池  " + Thread.currentThread().getName() + "payment info id" + id + "hhhhhhh";
    }


    /**
     * 不正常的方法，一定会失败
     *
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfoTimeOut(Integer id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池  " + Thread.currentThread().getName() + "payment info timeOut id" + id + "wwwwwww";
    }

    public String paymentFallback(Integer id) {
        return "线程池  " + Thread.currentThread().getName() + "payment info timeOut id" + id + "fallback";
    }
}
