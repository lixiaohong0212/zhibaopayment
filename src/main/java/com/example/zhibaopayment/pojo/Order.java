package com.example.zhibaopayment.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author lee
 * @create 2023-03-20 8:42 PM
 */


@Data
@TableName("t_order")
public class Order {

//      `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
//  `subject` varchar(256) COLLATE utf8mb4_bin DEFAULT NULL,
//  `order_no` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '商户订单编号',
//            `total_amount` double DEFAULT NULL COMMENT '订单金额',
//            `status` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '订单状态',
//            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
//            `update_time` datetime DEFAULT NULL,
//            `msg_type` varchar(10) COLLATE utf8mb4_bin DEFAULT NULL,
//
    // 商品id
    @TableId(value = "id", type = IdType.AUTO)
    private long id;

    // 商品标题
    private String subject;

    // 订单编号
    private String orderNo;

    // 订单金额
    private Double totalAmount;

    // 订单状态
    private String status;

    // 下单时间
    private Timestamp createTime;

    // 更新时间
    private Timestamp updateTime;
}
