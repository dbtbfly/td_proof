package com.db.lb.ali.sdk.model;


import com.db.lb.ali.sdk.common.SDKResult;

public class AlibabaTradeFastCreateOrderResult extends SDKResult {
    private AlibabaTradeFastResult result;
    private Boolean success;
    private String code;
    private String message;

    public AlibabaTradeFastCreateOrderResult() {
    }

    public AlibabaTradeFastResult getResult() {
        return this.result;
    }

    public void setResult(AlibabaTradeFastResult result) {
        this.result = result;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

