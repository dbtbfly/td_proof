package com.db.lb.ali.sdk.model;

import com.db.lb.ali.sdk.client.APIId;
import com.db.lb.ali.sdk.common.AbstractAPIRequest;

public class AliBuyerViewParam extends AbstractAPIRequest<AliBuyerViewResult> {
    public AliBuyerViewParam() {
        this.oceanApiId = new APIId("com.alibaba.trade", "alibaba.trade.get.buyerView", 1);
    }

    private String webSite;

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    private Long orderId;


}
