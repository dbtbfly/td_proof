package com.db.lb.jvshuitan.sdk.model;
import java.io.Serializable;

public class SearchModel   implements Serializable {

	private static final long serialVersionUID = -312270604484284028L;

    public int shop_id;

    public int page_index = 1;

    public int page_size=30;

    public  String flds="*";

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public int getPage_index() {
        return page_index;
    }

    public void setPage_index(int page_index) {
        this.page_index = page_index;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public String getFlds() {
        return flds;
    }

    public void setFlds(String flds) {
        this.flds = flds;
    }
}
