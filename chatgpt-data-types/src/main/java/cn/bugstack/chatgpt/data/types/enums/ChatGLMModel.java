package cn.bugstack.chatgpt.data.types.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description 模型对象
 * @create 2023-10-15 13:59
 */
@Getter
@AllArgsConstructor
public enum ChatGLMModel {

    CHATGLM_6B_SSE("chatGLM_6b_SSE"),
    CHATGLM_LITE("chatglm_lite"),
    CHATGLM_LITE_32K("chatglm_lite_32k"),
    CHATGLM_STD("chatglm_std"),
    CHATGLM_PRO("chatglm_pro"),

    ;
    private final String code;

    public static ChatGLMModel get(String code){
        switch (code){
            case "chatGLM_6b_SSE":
                return ChatGLMModel.CHATGLM_6B_SSE;
            case "chatglm_lite":
                return ChatGLMModel.CHATGLM_LITE;
            case "chatglm_lite_32k":
                return ChatGLMModel.CHATGLM_LITE_32K;
            case "chatglm_std":
                return ChatGLMModel.CHATGLM_STD;
            case "chatglm_pro":
                return ChatGLMModel.CHATGLM_PRO;
            default:
                return ChatGLMModel.CHATGLM_6B_SSE;
        }
    }

}
