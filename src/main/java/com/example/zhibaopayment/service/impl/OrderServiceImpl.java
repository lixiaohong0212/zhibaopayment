package com.example.zhibaopayment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.zhibaopayment.mapper.OrderMapper;
import com.example.zhibaopayment.pojo.Order;
import com.example.zhibaopayment.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author lee
 * @create 2023-03-21 4:11 PM
 */

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
}
