package com.db.lb.ali.sdk.model;

import com.db.lb.ali.sdk.client.APIId;
import com.db.lb.ali.sdk.common.AbstractAPIRequest;


public class AlibabaTradeFastCreateOrderParam extends AbstractAPIRequest<AlibabaTradeFastCreateOrderResult> {

    private String flow;
    private Long subUserId;
    private String message;
    private AlibabaTradeFastAddress addressParam;
    private AlibabaTradeFastCargo[] cargoParamList;
    private AlibabaTradeFastInvoice invoiceParam;
    private String shopPromotionId;
    private String tradeType;

    public AlibabaTradeFastCreateOrderParam() {
        this.oceanApiId = new APIId("com.alibaba.trade", "alibaba.trade.fastCreateOrder", 1);
    }

    public String getFlow() {
        return this.flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public Long getSubUserId() {
        return this.subUserId;
    }

    public void setSubUserId(Long subUserId) {
        this.subUserId = subUserId;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AlibabaTradeFastAddress getAddressParam() {
        return this.addressParam;
    }

    public void setAddressParam(AlibabaTradeFastAddress addressParam) {
        this.addressParam = addressParam;
    }

    public AlibabaTradeFastCargo[] getCargoParamList() {
        return this.cargoParamList;
    }

    public void setCargoParamList(AlibabaTradeFastCargo[] cargoParamList) {
        this.cargoParamList = cargoParamList;
    }

    public AlibabaTradeFastInvoice getInvoiceParam() {
        return this.invoiceParam;
    }

    public void setInvoiceParam(AlibabaTradeFastInvoice invoiceParam) {
        this.invoiceParam = invoiceParam;
    }

    public String getShopPromotionId() {
        return this.shopPromotionId;
    }

    public void setShopPromotionId(String shopPromotionId) {
        this.shopPromotionId = shopPromotionId;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

}
