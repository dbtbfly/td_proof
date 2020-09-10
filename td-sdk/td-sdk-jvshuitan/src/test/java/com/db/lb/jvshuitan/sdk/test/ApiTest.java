package com.db.lb.jvshuitan.sdk.test;

import com.db.lb.jvshuitan.sdk.api.JvShuiTanHttpClient;
import com.db.lb.jvshuitan.sdk.model.RequestModel;
import com.db.lb.jvshuitan.sdk.test.dto.*;
import com.db.lb.jvshuitan.sdk.test.response.SkuModel;
import com.db.lb.jvshuitan.sdk.test.response.SkuResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;

/**
 * 聚水潭api 测试
 *
 * 测试环境 店铺：非凡VISION
 *         店铺id：10161655
 * */
public class ApiTest {
    private static  String partnerId ="ywv5jGT8ge6Pvlq3FZSPol345asd";
    private static  String partnerKey ="ywv5jGT8ge6Pvlq3FZSPol2323";
    private static  String token ="3f723a3e4bd178cdc7070b48641c5707";
    private static  String host ="https://c.jushuitan.com/api/open/query.aspx";

    private ObjectMapper mapper=new ObjectMapper();

    /**
     * sku 查询
     * */
    @Test
    public void testSearchSku() throws IOException {
        String method="sku.query";

        JvShuiTanHttpClient api = new JvShuiTanHttpClient(partnerId, partnerKey, token,method, host);

        RequestModel requestModel = new RequestModel();
        SearchSkuDTO search=new SearchSkuDTO();
        search.sku_ids="feifan001,feifan002,feifan003";

        requestModel.setData(mapper.writeValueAsString(search));
        String res =  api.execute(requestModel);
        SkuResponse result= mapper.readValue(res, SkuResponse.class);

        System.out.println(mapper.writeValueAsString(result));
    }

    /**
     * 异步添加 sku
     * */
    @Test
    public void testAddSkuAsync() throws IOException {
        String method="item.upload";
        JvShuiTanHttpClient api = new JvShuiTanHttpClient(partnerId, partnerKey, token,method, host);

        SkuModel skuModel = new SkuModel();
        skuModel.setShop_id("10161655");
        skuModel.setI_id("feifan001");
        skuModel.setShop_i_id("f10161655");
        skuModel.setName("feifan女装");
        skuModel.setEnabled(1);

        SkuVO skuVO = new SkuVO();
        skuVO.setSku_id("feifan002");
        skuVO.setEnabled(1);
        skuVO.setName("feifan女装002");
        skuVO.setShop_sku_id("Yfeifan002");
        skuVO.setSku_code("feifan002");

        skuModel.setSkus(Collections.singletonList(skuVO));

        RequestModel requestModel = new RequestModel();

        requestModel.setData(mapper.writeValueAsString(Collections.singletonList(skuModel)));

        String res =  api.execute(requestModel);

        System.out.println(mapper.writeValueAsString(res));
    }

    /**
     * 同步添加 sku
     * 商品类目需要在管理端维护 eg.feifan
     * */
    @Test
    public void testAddSkuSync() throws IOException {
        String method="mall.item.upload";

        JvShuiTanHttpClient api = new JvShuiTanHttpClient(partnerId, partnerKey, token,method, host);

        SkuModel skuModel = new SkuModel();
        skuModel.setC_name("feifan");
        skuModel.setI_id("feifan-003");
        skuModel.setSku_id("feifan003");
        skuModel.setName("feifan女装001001");
        skuModel.setProperties_value("nvzhuang天蓝色;M");


        RequestModel requestModel = new RequestModel();

        requestModel.setData(mapper.writeValueAsString(Collections.singletonList(skuModel)));

        String res =  api.execute(requestModel);
        System.out.println(res);
    }


    /**
     * 订单上传
     * 生成内部订单号（用户聚水潭内部订单查询)，用户发货等状态更新
     * */
    @Test
    public void testAddOrder() throws IOException {
        String method="jushuitan.orders.upload";

        JvShuiTanHttpClient api = new JvShuiTanHttpClient(partnerId, partnerKey, token,method, host);

        OrderBaseDTO orderBaseDTO = new OrderBaseDTO();
        orderBaseDTO.setShop_id(10161655);
        orderBaseDTO.setSo_id("20200910151500010001");
        orderBaseDTO.setOrder_date(new Date());
        orderBaseDTO.setShop_status("WAIT_SELLER_SEND_GOODS");
        orderBaseDTO.setShop_buyer_id("zhangsan001");
        orderBaseDTO.setReceiver_state("北京");
        orderBaseDTO.setReceiver_city("北京市");
        orderBaseDTO.setReceiver_district("大兴区");
        orderBaseDTO.setReceiver_address("北京北京市大兴区科创十一街");
        orderBaseDTO.setReceiver_name("张三");
        orderBaseDTO.setReceiver_mobile("010-58888888");
        orderBaseDTO.setReceiver_phone("18888888888");
        orderBaseDTO.setPay_amount(new BigDecimal("123.21"));
        orderBaseDTO.setFreight(new BigDecimal("6"));
        orderBaseDTO.setModified(new Date());
        orderBaseDTO.setShop_modified(new Date());

        OrderItemDTO itemModel = new OrderItemDTO();
        itemModel.setSku_id("feifan001");
        itemModel.setShop_sku_id("feifan001");
        itemModel.setAmount(new BigDecimal("8.88"));
        itemModel.setBase_price(new BigDecimal("1.2"));
        itemModel.setQty(11);
        itemModel.setName("非凡女装");
        itemModel.setOuter_oi_id("00913401234000000001");
        itemModel.setProperties_value("SKU A1");

        PayDTO payDTO = new PayDTO();
        payDTO.setOuter_pay_id("0091234123123120000000006");
        payDTO.setPay_date(new Date());
        payDTO.setAmount(new BigDecimal("8.88"));
        payDTO.setBuyer_account("zhangsan");
        payDTO.setSeller_account("lisi");
        payDTO.setPayment("weixin");

        orderBaseDTO.setPay(payDTO);
        orderBaseDTO.setItems(Collections.singletonList(itemModel));

        RequestModel requestModel = new RequestModel();
        requestModel.setData(mapper.writeValueAsString(Collections.singletonList(orderBaseDTO)));

        String res = api.execute(requestModel);

        System.err.println(res);

    }

    /**
     * 出库(订单发货)
     * */
    @Test
    public void testStockOut() throws IOException {
        String method="ordersent.upload";

        JvShuiTanHttpClient api = new JvShuiTanHttpClient(partnerId, partnerKey, token,method, host);


        StockOutDTO stockOutDTO = new StockOutDTO();
        stockOutDTO.setShop_id(10161655);
        stockOutDTO.setO_id(3137393L);
        stockOutDTO.setSo_id("19137");
        stockOutDTO.setL_id("jdl001001");
        stockOutDTO.setLc_name("jdl");
        stockOutDTO.setModified("2020-09-10 15:13:12");

        RequestModel requestModel = new RequestModel();
        requestModel.setData(mapper.writeValueAsString(Collections.singletonList(stockOutDTO)));

        String res = api.execute(requestModel);

        System.err.println(res);

    }


    /**
     * 采购单上传
     * 供应商需要提前在管理端维护
     * */
    @Test
    public void testAddPurchaseOrder() throws IOException {
        String method="purchase.upload";

        JvShuiTanHttpClient api = new JvShuiTanHttpClient(partnerId, partnerKey, token,method, host);

        PurchaseOrderDTO purchaseOrderDTO = new PurchaseOrderDTO();
        purchaseOrderDTO.setSo_id("20200910090909090");
        purchaseOrderDTO.setSupplier_id(53261);

        PurchaseOrderItemDTO purchaseOrderItemDTO = new PurchaseOrderItemDTO();
        purchaseOrderItemDTO.setQty(1);
        purchaseOrderItemDTO.setSku_id("feifan001");

        purchaseOrderDTO.setItems(Collections.singletonList(purchaseOrderItemDTO));

        RequestModel requestModel = new RequestModel();
        requestModel.setData(mapper.writeValueAsString(Collections.singletonList(purchaseOrderDTO)));

        String res = api.execute(requestModel);

        System.err.println(res);
    }

    /**
     * 供应商查询
     *
     * */
    @Test
    public void testSearchSupplier() throws IOException {
        String method="supplier.query";

        JvShuiTanHttpClient api = new JvShuiTanHttpClient(partnerId, partnerKey, token,method, host);
        RequestModel requestModel = new RequestModel();

        String res = api.execute(requestModel);

        System.err.println(res);
    }
}
