package com.example.zhibaopayment.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author lee
 * @create 2023-03-21 5:06 PM
 */
public class StringUtils {

    public static void main(String[] args) {
        String orderNum = createOrderNum();
        System.out.println(orderNum);
    }

    public static String createOrderNum()
    {
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String seconds = new SimpleDateFormat("HHmmss").format(new Date());

        System.out.println(date);
        System.out.println(seconds);

        String result = date + "000010000" + getTwo() + "00" + seconds + getTow();
        return result;
    }

    private static String getTow() {
        return getTwo();
    }

    /**
     * 生成一个随机的两位数
     *
     * @return
     */
    private static String getTwo() {
        Random random = new Random();
        String result = random.nextInt(100) + "";

        return result;
    }
}
