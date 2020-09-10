package com.db.lb.jvshuitan.sdk.test.response;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.db.lb.jvshuitan.sdk.model.CustomDateSerializer;
import com.db.lb.jvshuitan.sdk.model.CustomDateDeserializer;
import com.db.lb.jvshuitan.sdk.test.dto.SkuVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SkuModel implements java.io.Serializable  {

      private static final long serialVersionUID = -6300847956316422263L;

      public String sku_id;

      public String shop_sku_id;

      public String i_id;

      public String shop_i_id;

      private String shop_id;

      public String name;

      public BigDecimal sale_price;

      public int shop_qty;

      public String color;

      public String properties_name;

      public String properties_value;

      public String pic;

      public String pic_big;

      public int enabled=1;

      public BigDecimal weight;

      public BigDecimal market_price;

      public String brand_name;

      @JsonSerialize(using = CustomDateSerializer.class)
      @JsonDeserialize(using= CustomDateDeserializer.class)
      public Date modified;

      private List<SkuVO> skus;

      private String c_name;


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

      public String getI_id() {
            return i_id;
      }

      public void setI_id(String i_id) {
            this.i_id = i_id;
      }

      public String getShop_i_id() {
            return shop_i_id;
      }

      public void setShop_i_id(String shop_i_id) {
            this.shop_i_id = shop_i_id;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public BigDecimal getSale_price() {
            return sale_price;
      }

      public void setSale_price(BigDecimal sale_price) {
            this.sale_price = sale_price;
      }

      public int getShop_qty() {
            return shop_qty;
      }

      public void setShop_qty(int shop_qty) {
            this.shop_qty = shop_qty;
      }

      public String getColor() {
            return color;
      }

      public void setColor(String color) {
            this.color = color;
      }

      public String getProperties_name() {
            return properties_name;
      }

      public void setProperties_name(String properties_name) {
            this.properties_name = properties_name;
      }

      public String getProperties_value() {
            return properties_value;
      }

      public void setProperties_value(String properties_value) {
            this.properties_value = properties_value;
      }

      public String getPic() {
            return pic;
      }

      public void setPic(String pic) {
            this.pic = pic;
      }

      public String getPic_big() {
            return pic_big;
      }

      public void setPic_big(String pic_big) {
            this.pic_big = pic_big;
      }

      public int getEnabled() {
            return enabled;
      }

      public void setEnabled(int enabled) {
            this.enabled = enabled;
      }

      public BigDecimal getWeight() {
            return weight;
      }

      public void setWeight(BigDecimal weight) {
            this.weight = weight;
      }

      public BigDecimal getMarket_price() {
            return market_price;
      }

      public void setMarket_price(BigDecimal market_price) {
            this.market_price = market_price;
      }

      public String getBrand_name() {
            return brand_name;
      }

      public void setBrand_name(String brand_name) {
            this.brand_name = brand_name;
      }

      public Date getModified() {
            return modified;
      }

      public void setModified(Date modified) {
            this.modified = modified;
      }

      public String getShop_id() {
            return shop_id;
      }

      public void setShop_id(String shop_id) {
            this.shop_id = shop_id;
      }

      public List<SkuVO> getSkus() {
            return skus;
      }

      public void setSkus(List<SkuVO> skus) {
            this.skus = skus;
      }


      public String getC_name() {
            return c_name;
      }

      public void setC_name(String c_name) {
            this.c_name = c_name;
      }
}
