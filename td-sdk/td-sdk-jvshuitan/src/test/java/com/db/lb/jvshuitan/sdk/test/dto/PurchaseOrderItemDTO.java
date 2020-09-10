package com.db.lb.jvshuitan.sdk.test.dto;

import java.io.Serializable;

public class PurchaseOrderItemDTO implements Serializable {


    private static final long serialVersionUID = -722616931253792536L;

    private Integer qty;

    private String sku_id;

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getSku_id() {
        return sku_id;
    }

    public void setSku_id(String sku_id) {
        this.sku_id = sku_id;
    }
}
