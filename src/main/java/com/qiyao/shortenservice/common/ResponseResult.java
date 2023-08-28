package com.qiyao.shortenservice.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ResponseResult
 * @Description 自定义异常封装类
 * @Version 1.0.0
 * @Date 2023/08/28
 * @Author LinQi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> {
    /**
     * 响应状态码
     */
    private String code;
    /**
     * 响应状态码叙述
     */
    private String message;
    /**
     * 响应封装的数据
     */
    private T data;
}
