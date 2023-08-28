package com.qiyao.shortenservice.common;

/**
 * @ClassName ResultUtils
 * @Description 返回结果工具类
 * @Version 1.0.0
 * @Date 2023/08/28
 * @Author LinQi
 */
public class ResultUtils {
    /**
     * 私有化构造参数，使得其返回只可以通过方法的方式返回
     */
    private ResultUtils() {

    }

    /**
     * 执行结果成功 (需要返回数据)
     *
     * @param data 数据
     * @param <T>  泛型
     * @return 执行结果包装类
     */
    public static <T> ResponseResult success(T data) {
        return build("200", "message", data);
    }

    /**
     * 执行结果成功 (不需要返回数据)
     *
     * @return 执行结果包装类
     */
    public static ResponseResult success() {
        return build("200", "message", null);
    }


    /**
     * 判断是否成功
     *
     * @param code 状态码
     * @return 包装类
     */
    public static boolean isSuccess(String code) {
        return "200".equals(code);
    }

    /**
     *执行失败，值返回错误信息
     * @param msg 错误信息
     * @return 包装类
     */
    public static ResponseResult failure(String msg){
        return build("500", "message",null);
    }

    /**
     * 执行失败
     *
     * @param code 响应码
     * @param msg  响应叙述
     * @return
     */
    public ResponseResult failure(String code, String msg) {
        return build(code, msg, null);
    }

    public <T> ResponseResult failure(String code, String msg,T data) {
        return build(code, msg, data);
    }

    /**
     * 构造返回结果
     *
     * @param code 响应码
     * @param msg  响应叙述
     * @param data 数据
     * @param <T>  泛型参数
     * @return 返回结果
     */
    public static <T> ResponseResult build(String code, String msg, T data) {
        return new ResponseResult(code, msg, data);
    }

}
