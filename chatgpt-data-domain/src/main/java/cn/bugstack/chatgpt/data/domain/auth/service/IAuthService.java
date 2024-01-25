package cn.bugstack.chatgpt.data.domain.auth.service;

import cn.bugstack.chatgpt.data.domain.auth.model.entity.AuthStateEntity;

/**
 * 
 * @description 鉴权验证服务接口
 * @create 2023-08-05 18:22
 */
public interface IAuthService {

    /**
     * 登录验证
     * @param code 验证码
     * @return Token
     */
    AuthStateEntity doLogin(String code);

    boolean checkToken(String token);

    String openid(String token);
}
