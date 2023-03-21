package com.example.zhibaopayment.utils;

import lombok.Data;

/**
 * @author lee
 * @create 2023-03-20 9:03 PM
 */

@Data
public class BaseResult {

    // 返回的状态码
    private int status;

    // 返回的信息
    private String message;

    // 返回数据
    private Object result;

    // 返回的时间
    private long timestamp = System.currentTimeMillis();

    // 返回创建的对象
    private static BaseResult createResult(int status, String message, Object result)
    {
        BaseResult baseResult = new BaseResult();
        baseResult.setStatus(status);
        baseResult.setMessage(message);
        baseResult.setResult(result);

        return  baseResult;
    }

    // 返回成功的方法
    public static BaseResult success()
    {
        return BaseResult.createResult(SysConstant.STATUS_SUCCESS, SysConstant.SUCCESS_MESSAGE, null);
    }

    // 返回成功的方法 带数据
    public static BaseResult success(Object result)
    {
        return BaseResult.createResult(SysConstant.STATUS_SUCCESS, SysConstant.SUCCESS_MESSAGE, result);
    }

    // 返回成功的方法 带消息 带数据
    public static BaseResult success(String message, Object result)
    {
        return BaseResult.createResult(SysConstant.STATUS_SUCCESS, message, result);
    }

    // 返回失败的方法
    public static BaseResult fail()
    {
        return BaseResult.createResult(SysConstant.STATUS_FAIL, SysConstant.FAIL_MESSAGE, null);
    }

    // 返回失败的方法 带数据
    public static BaseResult fail(Object result)
    {
        return BaseResult.createResult(SysConstant.STATUS_FAIL, SysConstant.FAIL_MESSAGE, result);
    }

    // 返回失败的方法 带消息 带数据
    public static BaseResult fail(String message, Object result)
    {
        return BaseResult.createResult(SysConstant.STATUS_FAIL, message, result);
    }
}
