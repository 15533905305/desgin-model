package com.example.designmodel.exceptions;

/**
 * @author junli wang
 * @date 18-9-9
 * 自定义异常类
 */
public class StrategyException extends RuntimeException{

    private Integer code;

    private String codeDesc;

    public StrategyException(String msg){
        super(msg);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }
}
