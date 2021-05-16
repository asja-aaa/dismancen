package com.buptse.dismancen.common;

import com.buptse.dismancen.common.constant.RESULT;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @ClassName CommonResult
 * @Description TODO
 * @Author ASJA
 * @Date 2021/5/14 16:57
 * @Version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
public class CommonResult {
    private Integer errorCode;
    private String msg;

    /**
     *  快速返回
     * @param result
     * @return
     */
    public static CommonResult failFast(RESULT result){
        return new CommonResult(result.getErrorCode(),result.getMsg());
    }

    /**
     * 快速返回
     * @param errorCode
     * @param msg
     * @return
     */
    public static CommonResult failFast(Integer errorCode, String msg){
        return new CommonResult(errorCode,msg);
    }

}
