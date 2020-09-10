package com.db.lb.ali.sdk.ali;

import com.db.lb.ali.sdk.model.*;
import com.db.lb.ali.sdk.AliApiExecutor;
import com.db.lb.ali.sdk.common.SDKResult;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * mock : https://auth.1688.com/dev/tools/auth_test.html
 * api 下单:https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.fastCreateOrder-1&aopApiCategory=trade_new
 * api 查询订单(买家): https://open.1688.com/api/apidocdetail.htm?aopApiCategory=trade_new&id=com.alibaba.trade%3Aalibaba.trade.get.buyerView-1
 * api 查询订单（卖家）： https://open.1688.com/api/apidocdetail.htm?aopApiCategory=trade_new&id=com.alibaba.trade%3Aalibaba.trade.get.sellerView-1
 *
 * */
public class AliApiTest {

    private String appKey = "9185899";
    private String secKey = "kpVqlhhOEFeu";
    private String code= "51293f3f-cba9-4362-adbe-9621e3cdedf6";
    private String tempAccToken = "f61adebd-a25f-4aa7-ada3-202b38614542";
    private String tempRefreshToken= "81c97921-4524-4d5d-9dad-14da68ce3cf1";

    @Test
    public void testAddOrder(){

        AliApiExecutor executor = new AliApiExecutor(appKey, secKey);

//        AuthorizationToken authorizationToken = executor.getToken(code);

        AlibabaTradeFastCreateOrderParam param = new AlibabaTradeFastCreateOrderParam();
        param.setFlow("abc");
        param.setMessage("aa");
        AlibabaTradeFastAddress address = new AlibabaTradeFastAddress();
        address.setProvinceText("北京");
        address.setCityText("北京");
        address.setAreaText("大兴区");
        address.setAddress("科创十一街");
        address.setFullName("张三");
        address.setMobile("18888888888");
        address.setPostCode("010");
        param.setAddressParam(address);
        List<AlibabaTradeFastCargo> cargoList = new ArrayList<AlibabaTradeFastCargo>();
        AlibabaTradeFastCargo cargo = new AlibabaTradeFastCargo();
        cargo.setOfferId(557856910956L);
        cargo.setSpecId("a63c985e3358d02b842322fc287be521");
        cargo.setQuantity(5D);
        cargoList.add(cargo);
        param.setCargoParamList(cargoList.toArray(new AlibabaTradeFastCargo[]{}));

        SDKResult<AlibabaTradeFastCreateOrderResult> result = executor.execute(param, tempAccToken);
        System.err.println(result.getResult().getCode());

    }

    @Test
    public void testQueryOrderBuyerView(){
        Long orderId = 123321123321L;
        AliBuyerViewParam aliBuyerViewParam = new AliBuyerViewParam();
        aliBuyerViewParam.setOrderId(orderId);
        aliBuyerViewParam.setWebSite("12");
        AliApiExecutor executor = new AliApiExecutor(appKey, secKey);
        SDKResult<AliBuyerViewResult> result = executor.execute(aliBuyerViewParam, "9c664f11-9a70-457c-8612-e5477a98ff44");
        System.err.println(result.getResult().getErrorCode());
    }

    @Test
    public void testQueryOrderSellerView(){
        Long orderId = 623321123321L;
        AliSellerViewParam aliSellerViewParam = new AliSellerViewParam();
        aliSellerViewParam.setOrderId(orderId);
        aliSellerViewParam.setWebSite("12");
        AliApiExecutor executor = new AliApiExecutor(appKey, secKey);
        SDKResult<AliSellerViewResult> result = executor.execute(aliSellerViewParam, "9c664f11-9a70-457c-8612-e5477a98ff44");
        System.err.println(result.getResult().getErrorCode());
    }
}
