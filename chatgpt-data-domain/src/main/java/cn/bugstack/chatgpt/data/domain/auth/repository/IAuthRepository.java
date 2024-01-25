package cn.bugstack.chatgpt.data.domain.auth.repository;

/**
 * 
 * @description 认证仓储服务
 * @create 2023-11-05 15:52
 */
public interface IAuthRepository {

    String getCodeUserOpenId(String code);

    void removeCodeByOpenId(String code, String openId);

}
