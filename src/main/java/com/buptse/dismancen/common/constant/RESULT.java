package com.buptse.dismancen.common.constant;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


public enum RESULT {

    SUCCESS(0,"success"),
    FILE_PATH_ERROR(-1,"file path or name error"),
    SAVE_OR_UPDATE_ERROR(-2,"database input error"),
    FILE_TYPE_ERROR(-3,"file type is not supported now"),
    FILE_CONVERT_TO_OBJECT_ERROR(-4,"file convert error"),
    FILE_OUTPUT_ERROR(-5,"file out put error");

    private Integer errorCode;
    private String msg;

    RESULT(Integer errorCode, String msg){
        this.errorCode = errorCode;
        this.msg = msg;
    }


    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



}
