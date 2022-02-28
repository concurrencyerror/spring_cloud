package com.horace.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 2022/2/25
 * com.horace.entity
 * horace
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//订单实体类
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
