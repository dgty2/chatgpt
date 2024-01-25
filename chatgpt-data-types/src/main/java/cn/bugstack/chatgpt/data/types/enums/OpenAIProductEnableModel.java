package cn.bugstack.chatgpt.data.types.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description
 * @create 2023-09-28 20:58
 */
@Getter
@AllArgsConstructor
public enum OpenAIProductEnableModel {

    CLOSE(0, "无效，已关闭"),
    OPEN(1,"有效，使用中"),
    ;

    private final Integer code;

    private final String info;

    public static OpenAIProductEnableModel get(Integer code){
        switch (code){
            case 0:
                return OpenAIProductEnableModel.CLOSE;
            case 1:
                return OpenAIProductEnableModel.OPEN;
            default:
                return OpenAIProductEnableModel.CLOSE;
        }
    }

}
