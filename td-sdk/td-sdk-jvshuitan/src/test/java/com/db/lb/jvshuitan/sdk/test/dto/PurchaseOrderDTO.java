package com.db.lb.jvshuitan.sdk.test.dto;


import java.io.Serializable;
import java.util.List;

public class PurchaseOrderDTO implements Serializable {
    private static final long serialVersionUID = 6185870940411443084L;

    private Integer supplier_id;
    private String so_id;
    private List<PurchaseOrderItemDTO> items;

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSo_id() {
        return so_id;
    }

    public void setSo_id(String so_id) {
        this.so_id = so_id;
    }

    public List<PurchaseOrderItemDTO> getItems() {
        return items;
    }

    public void setItems(List<PurchaseOrderItemDTO> items) {
        this.items = items;
    }
}
