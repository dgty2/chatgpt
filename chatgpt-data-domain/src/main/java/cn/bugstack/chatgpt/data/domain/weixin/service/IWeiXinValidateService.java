package cn.bugstack.chatgpt.data.domain.weixin.service;

/**
 * 
 * @description 验签接口
 * @create 2023-08-05 16:56
 */
public interface IWeiXinValidateService {

    boolean checkSign(String signature, String timestamp, String nonce);

}
