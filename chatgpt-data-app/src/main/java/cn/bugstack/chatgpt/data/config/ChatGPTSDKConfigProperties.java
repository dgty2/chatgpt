package cn.bugstack.chatgpt.data.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
 * @description
 * @create 2023-07-22 20:36
 */
@Data
@ConfigurationProperties(prefix = "chatgpt.sdk.config", ignoreInvalidFields = true)
public class ChatGPTSDKConfigProperties {

    /** 转发地址 <a href="https://api.xfg.im/b8b6/">https://api.xfg.im/b8b6/</a> */
    private String apiHost;
    /** 可以申请 sk-*** */
    private String apiKey;
    /** 获取Token <a href="http://api.xfg.im:8080/authorize?username=xfg&password=123">访问获取</a> */
    private String authToken;

}
