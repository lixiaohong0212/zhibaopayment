package com.example.zhibaopayment.controller;

import com.example.zhibaopayment.pojo.Order;
import com.example.zhibaopayment.service.OrderService;
import com.example.zhibaopayment.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lee
 * @create 2023-03-21 4:17 PM
 */

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @GetMapping("/list")
    public BaseResult list()
    {
        List<Order> list = orderService.list();
        return BaseResult.success(list);
    }
}
