package com.db.lb.jvshuitan.sdk.test.response;

import com.db.lb.jvshuitan.sdk.response.BaseResponse;

import java.util.List;

public class SkuResponse extends BaseResponse {

    public int page_size;

    public int page_index;

    public Boolean has_next;

    public List<SkuModel> datas;

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public int getPage_index() {
        return page_index;
    }

    public void setPage_index(int page_index) {
        this.page_index = page_index;
    }

    public Boolean getHas_next() {
        return has_next;
    }

    public void setHas_next(Boolean has_next) {
        this.has_next = has_next;
    }

    public List<SkuModel> getDatas() {
        return datas;
    }

    public void setDatas(List<SkuModel> datas) {
        this.datas = datas;
    }
}


