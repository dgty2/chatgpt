package cn.bugstack.chatgpt.data.domain.weixin.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 
 * @description 微信公众号消息类型值对象，用于描述对象属性的值，为值对象。
 * @create 2023-08-05 17:20
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum MsgTypeVO {

    EVENT("event","事件消息"),
    TEXT("text","文本消息");

    private String code;
    private String desc;

}
