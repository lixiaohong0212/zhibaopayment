package com.example.zhibaopayment.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author lee
 * @create 2023-03-21 4:49 PM
 */

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Component
@ConfigurationProperties
public class AlipayConfig {

    // app_id
    @Value("${alipay.app_id}")
    public String app_id;

    @Value("${alipay.merchant_private_key}")
    public String merchant_private_key;

    @Value("${alipay.alipay_public_key}")
    public String alipay_public_key;

    @Value("${alipay.notify_url}")
    public String notify_url;

    @Value("${alipay.return_url}")
    public String return_url;

    @Value("${alipay.sign_type}")
    public String sign_type;

    @Value("${alipay.charset}")
    public String charset;

    @Value("${alipay.gatewayUrl}")
    public String gatewayUrl;

    @Bean
    public AlipayConfig getAlipayConfig()
    {
        AlipayConfig alipayConfig = new AlipayConfig();
        alipayConfig.setApp_id(app_id);
        alipayConfig.setMerchant_private_key(merchant_private_key);
        alipayConfig.setAlipay_public_key(alipay_public_key);
        alipayConfig.setNotify_url(notify_url);
        alipayConfig.setReturn_url(return_url);
        alipayConfig.setSign_type(sign_type);
        alipayConfig.setCharset(charset);
        alipayConfig.setGatewayUrl(gatewayUrl);

        return alipayConfig;
    }
}
