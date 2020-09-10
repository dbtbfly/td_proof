package com.db.lb.jvshuitan.sdk.test.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemDTO implements java.io.Serializable {

	private static final long serialVersionUID = -4764800475207747580L;

    public String sku_id;

    public String shop_sku_id;

    public String properties_value;

    public BigDecimal amount;

    public BigDecimal base_price;

    public int qty;

    public String name;

    public String outer_oi_id;


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

    public String getProperties_value() {
        return properties_value;
    }

    public void setProperties_value(String properties_value) {
        this.properties_value = properties_value;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBase_price() {
        return base_price;
    }

    public void setBase_price(BigDecimal base_price) {
        this.base_price = base_price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOuter_oi_id() {
        return outer_oi_id;
    }

    public void setOuter_oi_id(String outer_oi_id) {
        this.outer_oi_id = outer_oi_id;
    }
}
