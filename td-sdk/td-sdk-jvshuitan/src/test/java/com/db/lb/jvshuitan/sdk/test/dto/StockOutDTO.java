package com.db.lb.jvshuitan.sdk.test.dto;

import java.io.Serializable;
import java.util.Date;

public class StockOutDTO implements Serializable {

    private static final long serialVersionUID = 5286015003131222483L;
    private Integer shop_id;
    private Long o_id;
    private String so_id;
    private String lc_name;
    private String l_id;
    private String lc_id;
    private String  modified;

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public Long getO_id() {
        return o_id;
    }

    public void setO_id(Long o_id) {
        this.o_id = o_id;
    }

    public String getSo_id() {
        return so_id;
    }

    public void setSo_id(String so_id) {
        this.so_id = so_id;
    }

    public String getLc_name() {
        return lc_name;
    }

    public void setLc_name(String lc_name) {
        this.lc_name = lc_name;
    }

    public String getL_id() {
        return l_id;
    }

    public void setL_id(String l_id) {
        this.l_id = l_id;
    }

    public String getLc_id() {
        return lc_id;
    }

    public void setLc_id(String lc_id) {
        this.lc_id = lc_id;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }
}
