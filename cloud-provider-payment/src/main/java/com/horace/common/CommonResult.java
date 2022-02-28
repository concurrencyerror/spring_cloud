package com.horace.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 2022/2/25
 * com.horace.common
 * horace
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//公共返回类
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
