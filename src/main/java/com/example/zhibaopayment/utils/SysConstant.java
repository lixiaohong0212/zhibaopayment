package com.example.zhibaopayment.utils;

/**
 * @author lee
 * @create 2023-03-20 9:21 PM
 */

/**
 * 存放常量的接口
 *
 */
public interface SysConstant {
    int STATUS_FAIL = 500;
    int STATUS_SUCCESS = 200;
    String FAIL_MESSAGE = "fail";
    String SUCCESS_MESSAGE = "success";

    // 订单的状态
    // 代付款
    String WAIT_BUYER_PAY = "WAIT_BUYER_PAY";

    // 交易成功
    String TRADE_SUCCESS = "TRADE_SUCCESS";

    // 订单取消
    String CANCEL_SUCCESS = "CANCEL_SUCCESS";

    // 退款成功
    String REFUND_SUCCESS = "REFUND_SUCCESS";

    // 退款失败
    String REFUND_FAIL = "REFUND_FAIL";

    // 订单已关闭
    String TRADE_CLOSE = "TRADE_CLOSE";
}
