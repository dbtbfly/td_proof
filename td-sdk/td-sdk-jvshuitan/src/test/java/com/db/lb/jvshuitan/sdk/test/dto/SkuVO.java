package com.db.lb.jvshuitan.sdk.test.dto;

import java.io.Serializable;

public class SkuVO implements Serializable {

    private static final long serialVersionUID = 3106103041794557296L;
    private String sku_id;
    private String shop_sku_id;
    private String name;
    private String sku_code;
    private int enabled;

    public String getSku_id() {
        return sku_id;
    }

    public void setSku_id(String sku_id) {
        this.sku_id = sku_id;
    }

    public String getShop_sku_id() {
        return shop_sku_id;
    }

    public void setShop_sku_id(String shop_sku_id) {
        this.shop_sku_id = shop_sku_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku_code() {
        return sku_code;
    }

    public void setSku_code(String sku_code) {
        this.sku_code = sku_code;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
}
