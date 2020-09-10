package com.db.lb.jvshuitan.sdk.model;

/**
 * 状态码
 * */
public enum CommonStatus {
    /**
     * 成功
     * */
    IsSuccess,
    /**
     * 租户id错误
     * */
    PartnerIPErr,

    /**
     * 签名错误
     * */
    SignErr,

    /**
     * 请求体错误
     * */
     DataErr ,

    /**
     * 请求参数错误
     * */
    ArgErr ,

    /**
     * open api 内部错误
     * */
    InnerException,

    /**
     * 保存数据失败
     * */
    SaveDataErr,
    /**
     * 验证数据失败
     * */
    VerifyDataErr

}
