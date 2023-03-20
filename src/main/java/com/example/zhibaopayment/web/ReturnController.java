package com.example.zhibaopayment.web;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.example.zhibaopayment.utils.AppUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author lee
 * @create 2023-03-20 3:34 PM
 */
@Controller
public class ReturnController {
    // 接收支付宝返回的异步信息
    @RequestMapping("/getreturn")
    public void getNotify(HttpServletRequest request,
                          HttpServletResponse response) throws AlipayApiException, IOException {
        Map<String, String> params = new HashMap<>();
        Map<String, String[]> parameterMap = request.getParameterMap();

        Iterator<String> iterator = parameterMap.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            String[] values = parameterMap.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1)?valueStr + values[i]:valueStr + values[i] + ",";
            }
            params.put(name, valueStr);
        }

        // 调用支付宝的SDK验证签名
        boolean signVerified = AlipaySignature.rsaCheckV2(params, AppUtils.alipay_public_key, AppUtils.charset, AppUtils.sign_type);

        /**
         *
         * 一般建议商户验签: 保证数据在传输过程中没有被修改
         * 1.需要验证通知数据中的out_trade_no和我们创建的订单号是否一致
         * 2.判断total_amount的金额和我们实际发送的金额是否一致
         * 3.验证seller_id是否对应商户
         * 4.验证app_id是否为商户本身
         */
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        // 验证成功
        if (signVerified) {
            // 获取商户的订单号
            String out_trade_no = request.getParameter("out_trade_no");
            // 支付宝的交易号
            String trade_no = request.getParameter("trade_no");

            //付款金额
            String total_amount = request.getParameter("total_amount");
            out.println("trade_no:" + trade_no + " ,out_trade_no:" + out_trade_no + ",total_amount:" + total_amount);
        }
    }

}
