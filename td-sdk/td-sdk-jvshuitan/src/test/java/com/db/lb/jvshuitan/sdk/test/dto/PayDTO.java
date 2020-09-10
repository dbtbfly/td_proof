package com.db.lb.jvshuitan.sdk.test.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.db.lb.jvshuitan.sdk.model.CustomDateSerializer;
import com.db.lb.jvshuitan.sdk.model.CustomDateDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PayDTO implements java.io.Serializable{
	private static final long serialVersionUID = 8894170247498551205L;

    public String outer_pay_id;

    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonDeserialize(using= CustomDateDeserializer.class)
    public Date pay_date;

    public BigDecimal amount;

    public String so_id;

    public String payment;

    public String buyer_account;

    public String seller_account;

    public String getOuter_pay_id() {
        return outer_pay_id;
    }

    public void setOuter_pay_id(String outer_pay_id) {
        this.outer_pay_id = outer_pay_id;
    }

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSo_id() {
        return so_id;
    }

    public void setSo_id(String so_id) {
        this.so_id = so_id;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getBuyer_account() {
        return buyer_account;
    }

    public void setBuyer_account(String buyer_account) {
        this.buyer_account = buyer_account;
    }

    public String getSeller_account() {
        return seller_account;
    }

    public void setSeller_account(String seller_account) {
        this.seller_account = seller_account;
    }
}
