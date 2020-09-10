package com.db.lb.ali.sdk.model;

public class AlibabaTradeFastCargo {
    private Long offerId;
    private String specId;
    private Double quantity;

    public AlibabaTradeFastCargo() {
    }

    public Long getOfferId() {
        return this.offerId;
    }

    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    public String getSpecId() {
        return this.specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}

