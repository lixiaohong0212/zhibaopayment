package com.example.zhibaopayment.web;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.example.zhibaopayment.utils.AppUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author lee
 * @create 2023-03-19 4:25 PM
 */

@Controller
public class PayController {

    @Resource
    private AlipayClient alipayClient;

    @Resource
    private AlipayTradePagePayRequest alipayTradePagePayRequest;

    /**
     * 跳转到index.html页面
     *
     * @return
     */
    @RequestMapping("/index")
    public String index()
    {
        return "index";
    }


    // 处理支付请求的方法
    @RequestMapping("/pay")
    public void pay(String WIDout_trade_no, String WIDsubject, String WIDtotal_amount, String WIDbody, HttpServletResponse response) throws AlipayApiException, IOException {

        // 1 设置参数
        alipayTradePagePayRequest.setReturnUrl(AppUtils.return_url);

        // 设置异步返回路径
        alipayTradePagePayRequest.setNotifyUrl(AppUtils.notify_url);

        //设置其他请求参数
        HashMap<String, Object> bizContentMap = new HashMap<>();

        bizContentMap.put("out_trade_no", WIDout_trade_no);
        bizContentMap.put("total_amount", WIDtotal_amount);
        bizContentMap.put("subject", WIDsubject);
        bizContentMap.put("body", WIDbody);
        bizContentMap.put("product_code", "FAST_INSTANT_TRADE_PAY");

        String bizContent = JSON.toJSONString(bizContentMap);
        alipayTradePagePayRequest.setBizContent(bizContent);

        // 2 发送请求
        String result = alipayClient.pageExecute(alipayTradePagePayRequest).getBody();

        // 3 响应的结果发送给前端
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(result);
    }

}
