package com.db.lb.jvshuitan.sdk.test.dto;

import java.util.Date;

import com.db.lb.jvshuitan.sdk.model.CustomDateSerializer;
import com.db.lb.jvshuitan.sdk.model.SearchModel;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class SearchSkuDTO extends SearchModel {
	@JsonSerialize(using = CustomDateSerializer.class)
    public Date modified_begin=null;

    public Date modified_end;

    public String sku_ids;

    public Date getModified_begin() {
        return modified_begin;
    }

    public void setModified_begin(Date modified_begin) {
        this.modified_begin = modified_begin;
    }

    public Date getModified_end() {
        return modified_end;
    }

    public void setModified_end(Date modified_end) {
        this.modified_end = modified_end;
    }

    public String getSku_ids() {
        return sku_ids;
    }

    public void setSku_ids(String sku_ids) {
        this.sku_ids = sku_ids;
    }
}
