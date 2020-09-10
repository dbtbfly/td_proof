package com.db.lb.jvshuitan.sdk.test.dto;

import com.db.lb.jvshuitan.sdk.model.CustomDateSerializer;
import com.db.lb.jvshuitan.sdk.model.CustomDateDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;
import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderBaseDTO implements java.io.Serializable {

	private static final long serialVersionUID = 9010417105228211181L;


       public int shop_id;

       public String so_id;

       @JsonSerialize(using = CustomDateSerializer.class)
       @JsonDeserialize(using= CustomDateDeserializer.class)
       public Date order_date;

       public String shop_status;

       public String question_type;

       public String question_desc;

       public String shop_buyer_id;

       public String receiver_state;

       public String receiver_city;

       public String receiver_district;

       public String receiver_address;

       public String receiver_name;

       public String receiver_phone;

       public String receiver_mobile;

       @JsonSerialize(using = CustomDateSerializer.class)
       @JsonDeserialize(using= CustomDateDeserializer.class)
       public Date send_date;

       public BigDecimal pay_amount;

       public BigDecimal freight;

       public String buyer_message;

       public String remark;

       public String invoice_title;

       public Boolean is_cod;

       public BigDecimal amount;

       public Date modified;

       public String receiver_zip;

       public String order_from;

       public List<OrderItemDTO> items=new ArrayList<OrderItemDTO>();

       public PayDTO pay;

       public Date shop_modified;

       public int getShop_id() {
              return shop_id;
       }

       public void setShop_id(int shop_id) {
              this.shop_id = shop_id;
       }

       public String getSo_id() {
              return so_id;
       }

       public void setSo_id(String so_id) {
              this.so_id = so_id;
       }

       public Date getOrder_date() {
              return order_date;
       }

       public void setOrder_date(Date order_date) {
              this.order_date = order_date;
       }

       public String getShop_status() {
              return shop_status;
       }

       public void setShop_status(String shop_status) {
              this.shop_status = shop_status;
       }

       public String getQuestion_type() {
              return question_type;
       }

       public void setQuestion_type(String question_type) {
              this.question_type = question_type;
       }

       public String getQuestion_desc() {
              return question_desc;
       }

       public void setQuestion_desc(String question_desc) {
              this.question_desc = question_desc;
       }

       public String getShop_buyer_id() {
              return shop_buyer_id;
       }

       public void setShop_buyer_id(String shop_buyer_id) {
              this.shop_buyer_id = shop_buyer_id;
       }

       public String getReceiver_state() {
              return receiver_state;
       }

       public void setReceiver_state(String receiver_state) {
              this.receiver_state = receiver_state;
       }

       public String getReceiver_city() {
              return receiver_city;
       }

       public void setReceiver_city(String receiver_city) {
              this.receiver_city = receiver_city;
       }

       public String getReceiver_district() {
              return receiver_district;
       }

       public void setReceiver_district(String receiver_district) {
              this.receiver_district = receiver_district;
       }

       public String getReceiver_address() {
              return receiver_address;
       }

       public void setReceiver_address(String receiver_address) {
              this.receiver_address = receiver_address;
       }

       public String getReceiver_name() {
              return receiver_name;
       }

       public void setReceiver_name(String receiver_name) {
              this.receiver_name = receiver_name;
       }

       public String getReceiver_phone() {
              return receiver_phone;
       }

       public void setReceiver_phone(String receiver_phone) {
              this.receiver_phone = receiver_phone;
       }

       public String getReceiver_mobile() {
              return receiver_mobile;
       }

       public void setReceiver_mobile(String receiver_mobile) {
              this.receiver_mobile = receiver_mobile;
       }

       public Date getSend_date() {
              return send_date;
       }

       public void setSend_date(Date send_date) {
              this.send_date = send_date;
       }

       public BigDecimal getPay_amount() {
              return pay_amount;
       }

       public void setPay_amount(BigDecimal pay_amount) {
              this.pay_amount = pay_amount;
       }

       public BigDecimal getFreight() {
              return freight;
       }

       public void setFreight(BigDecimal freight) {
              this.freight = freight;
       }

       public String getBuyer_message() {
              return buyer_message;
       }

       public void setBuyer_message(String buyer_message) {
              this.buyer_message = buyer_message;
       }

       public String getRemark() {
              return remark;
       }

       public void setRemark(String remark) {
              this.remark = remark;
       }

       public String getInvoice_title() {
              return invoice_title;
       }

       public void setInvoice_title(String invoice_title) {
              this.invoice_title = invoice_title;
       }

       public Boolean getIs_cod() {
              return is_cod;
       }

       public void setIs_cod(Boolean is_cod) {
              this.is_cod = is_cod;
       }

       public BigDecimal getAmount() {
              return amount;
       }

       public void setAmount(BigDecimal amount) {
              this.amount = amount;
       }

       public Date getModified() {
              return modified;
       }

       public void setModified(Date modified) {
              this.modified = modified;
       }

       public String getReceiver_zip() {
              return receiver_zip;
       }

       public void setReceiver_zip(String receiver_zip) {
              this.receiver_zip = receiver_zip;
       }

       public String getOrder_from() {
              return order_from;
       }

       public void setOrder_from(String order_from) {
              this.order_from = order_from;
       }

       public List<OrderItemDTO> getItems() {
              return items;
       }

       public void setItems(List<OrderItemDTO> items) {
              this.items = items;
       }

       public PayDTO getPay() {
              return pay;
       }

       public void setPay(PayDTO pay) {
              this.pay = pay;
       }

       public Date getShop_modified() {
              return shop_modified;
       }

       public void setShop_modified(Date shop_modified) {
              this.shop_modified = shop_modified;
       }
}
