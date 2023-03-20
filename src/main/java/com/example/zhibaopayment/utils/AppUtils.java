package com.example.zhibaopayment.utils;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lee
 * @create 2023-03-19 3:34 PM
 */
public class AppUtils {

    // 定义应用app_id
    public static String app_id = "2016091300499579";


    // 定义商户的私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDiRbp5wAIqreHN4eDsNneX84Ck+AO8NhO7wPyXfDsN9Uqeg0Ew3yoaIfeOUpfVk7YsStZLICflIrHkOsn9X0p1ncV8od3Wf9Oid2fNAB/Xkc3Nzy/bkIAhiudnx/FjEIkU8O3kqd/a1tCRLBdj+lGd98fFUM6hLlHC8ejLOd4UcCr7YhMdsiyYYy+isOBKB5c6CyDsr5DfYws179PGxy0+8Cei9ebGVBWUAMsMkKHsQVFzGUYfc4yHu1TmNNnJovjXgMIYEePihOI136bZv/aAWVckd+gEGKJqeWfks7Pe1wjssJiFRo/RMdxmqU5gBv1qi0xZgqqPpjVYx1Vo5UyjAgMBAAECggEBAIK9PVjZq6bTX3QhPl/dvM5MgRlQwH/AUziZ8pjozAptn5blSgad+2qsE6jlahuaxJjlCNrRkpufp1+y5EEFDTXWWmR/9njY1QS7r3tQxhU9hseTHhjkblRzOO/LJFtUE5DJAPutd82vb0ViT4WR/hSjNYd6AFo7NDzKn/LE1d/CNap5wEhIpPvOAeqzsubaXdS5r1npDRzZZazsLCv1I0w/040StG9dBeDTnd6F9e1MIhKRGFcLgXAY2UvY2Jkdjq1kYVMOr2RDtvEnfCQvqfuWNNncEtXCH1cap5eoHPsQ22q6LHtNDNheyTqYYHn/ziMdMffEwjddcIZm0+vfQJkCgYEA9wLtuSh7H4app+AZkr1EMEvtcRr2syOiubsZqbXb9golFYnVKTYJEOzuIRlfgj+kRHUZc7MWPsS/LymhkqXf2y+zuTvCIq5FbaXx0XLvS8aU562Js6LO/QBLMItEqZ4Vo5nmKJqnPt2TYJKKLVK7j8Rb4n2++YXuToCTzh8fl50CgYEA6oGaHgFnnCU/xoiKirHj4bT/7uysbTnMIdDtBVzIeMDiMWZkV5MAO1pWfL+QJXWi++WbNL2IORIImPwoKVU4kUYhq9i8NCPHUCF5GRVP0TtWfj4aKdkqTAoUeyQ+fRJ3piHlEng3rTyG3znILoleRpLxTCVy8bcBhIHfwAf24T8CgYBKdwKNeCut9F2+8ysidpZQ7QLWvycyGAMddM8mv2FhSeumE5hERTr0dEjRh6GoVWFDFf4nSAzjvVJZeHZyDDlxDW9j3yUGaX0ashU1bC3BrUsEkOdbVTCLSwRfzQxVCghB+spM4Vqb9BZS3bp0MWXD0JFWtUvWU07lMZPdZrqSbQKBgQCZntULGvh4vZ4NvJylRut1jFCsf7ZkxxwGewsKHEHneNO0cNMC23WnbAKELimLoIhoY31NC2wVls6zCVx11zH7WOnt3UlNDrMetw7Rc7iZ5DlA8gXJrE2dCm1oTdHxtQtUdZfOhZpTjfb8fKm6cpqjuNcBfvbRiYUg/MNK1OzRmQKBgQC5TQTkmNhwwkuHGfSSW4fCZspY9OdY6/xeWefktw25x07BCcmcx3fwsns7XjDbN5PQEPO8PQjlof4rant6OStYLjPqLjlEx1ZqImEipgMd506BbPI9UrtqME5VT0K+BH1xLBhaz8PppC9BKmMgLN9l5i0vFcuD9o1fPVxcp3Nc1A==";

    // 定义支付宝的公钥
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt2fXnLeJsvLh7vppUd0ODzo69lsH8Ofef/DQBwCdfZw/QE8V4Knxjr2KbetCXTX95bndflvF+OPvuVNJ19BEL4ZExcxvOGjmge0iVs12lY0G9++4s7IwAyhBmWAMdhk1ejKYtYtaS/BuIO6kpBHw9pBukNsaXD7lEbTr6Tbe0cWosjUqo2XlfsUgV7Yka6Q70+BZ4hjqIU00kJv/JZq+Ic36jjyEKcP1XyY7KEQOTR1CHzHrwagf5iZkQfJGEnqsVM1E8vLogfCJuELsvJf+v3Q7Kgzryv1Ro656YKGyxBmjztwVcnT0eeLUY2HQJNt9sO/vnw3T6mJ7H29UtrX4nQIDAQAB";

    // 定义服务器异步通知的地址
    public static String notify_url = "http://u5mypq.natappfree.ccc/getnotify";

    // 支付宝跳转回商户页面
    public static String return_url = "http://u5mypq.natappfree.cc/getreturn";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符的编码格式
    public static String charset = "utf-8";

    // 设定网关地址
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";


    public static String log_path = "/tmp/";

    public static void logResult(String sWord) throws IOException {
        FileWriter writer = null;

        try {
            writer = new FileWriter(log_path + "alipay_log" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

}
