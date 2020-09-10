package com.db.lb.ali.sdk.model;


public class AlibabaTradeFastResult {
    private Long totalSuccessAmount;
    private String orderId;
    private AlibabaTradeFastOffer[] failedOfferList;
    private Long postFee;

    public AlibabaTradeFastResult() {
    }

    public Long getTotalSuccessAmount() {
        return this.totalSuccessAmount;
    }

    public void setTotalSuccessAmount(Long totalSuccessAmount) {
        this.totalSuccessAmount = totalSuccessAmount;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public AlibabaTradeFastOffer[] getFailedOfferList() {
        return this.failedOfferList;
    }

    public void setFailedOfferList(AlibabaTradeFastOffer[] failedOfferList) {
        this.failedOfferList = failedOfferList;
    }

    public Long getPostFee() {
        return this.postFee;
    }

    public void setPostFee(Long postFee) {
        this.postFee = postFee;
    }
}

