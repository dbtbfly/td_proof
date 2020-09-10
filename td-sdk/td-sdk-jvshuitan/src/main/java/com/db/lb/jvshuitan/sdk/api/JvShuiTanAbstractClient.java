package com.db.lb.jvshuitan.sdk.api;

import com.db.lb.jvshuitan.sdk.model.RequestModel;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 聚水潭 api client
 * */
public abstract class JvShuiTanAbstractClient {
    /*
    * 方法名
    * */
    protected  String methodName;
    /*
     * 租户id
     * */
    protected  String partnerId;
    /*
     * 租户key秘钥
     * */
    protected  String partnerKey;
    /*
     * 令牌
     * */
    public String token;
    /*
     * api 地址
     * */
    protected  String host;

    /**
     * 执行请求
     * */
    public  String execute(RequestModel requestModel) throws IOException {

        HashMap<String, String> dicArg = new HashMap<String,String>();
        String url = genRequestUrl(partnerKey, dicArg);
        String res = post(url, requestModel.getData());
        return res;
    }

    /**
     * 初始化请求参数
     * */
    protected  void init(HashMap<String, String> dicArgMap){
    	if(dicArgMap.get("ts")==null) {
    		dicArgMap.put("ts", String.valueOf(JvShuiTanUtil.getStamp(new Date())));

    	}
    	dicArgMap.put("partnerid", partnerId);
    	dicArgMap.put("method", methodName);
    	dicArgMap.put("token", token);
    }

    /**
     * md5签名
     * */
    protected String doMD5(String prestr) {
        return JvShuiTanUtil.doMD5(prestr,null);
    }

    /**
     * 生成签名
     * */
    protected String getSign(String partnerId, String sPartnerKey, HashMap<String, String> dicArg) {
        String sSignPara = buildSignPara(dicArg);
        String sSign = this.methodName + partnerId + sSignPara + sPartnerKey;
        return doMD5(sSign);
    }

    /**
     * 构建签名参数
     * */
    protected  String buildSignPara(HashMap<String, String> dicArg) {
        StringBuilder prestr = new StringBuilder();
        Iterator<Map.Entry<String, String>> iterator = dicArg.entrySet().iterator();
        while (iterator.hasNext()) {
        	Map.Entry<String, String> entry = iterator.next();
        	String key=entry.getKey();
            if ( key == "sign" || key == "method" ||  key== "partnerid") {
                continue;
            }
            prestr.append(entry.getKey() +entry.getValue());
        }
        return prestr.toString();
    }

    /**
     *  post 请求
     * @param sUrl 请求地址
     * @param sContent 请求体
     * */
    protected String post(String sUrl, String sContent) throws IOException {
        if (sContent==null||sContent.isEmpty()) {
            return JvShuiTanUtil.doPost(sUrl, "");
        }
        else {
            return JvShuiTanUtil.doPost(sUrl, sContent);
        }
    }


    /**
     * 生成请求url
     * @param dicArgMap 查询参数map
     * @param partnerKey 租户秘钥
     * */
	public String genRequestUrl(String partnerKey, HashMap<String, String> dicArgMap) throws IOException {

        init(dicArgMap);

        String sSignPara = buildSignPara(dicArgMap);
        String sPartnerId = dicArgMap.get("partnerid");
        String sMethod=dicArgMap.get("method");
        String sSign = sMethod + sPartnerId + sSignPara + partnerKey;
        sSign = doMD5(sSign);
        dicArgMap.put("sign", sSign);
        StringBuilder sbUrl = new StringBuilder();
        sbUrl.append(host);

        Boolean isFirst=true;
        Iterator<Map.Entry<String, String>> iterator = dicArgMap.entrySet().iterator();
        while (iterator.hasNext()) {
        	Map.Entry<String, String> entry = iterator.next();
        	if(isFirst) {
        		 sbUrl.append("?");
        	}
        	else {
        		sbUrl.append("&");
        	}
            StringBuilder append = sbUrl.append(entry.getKey());
            sbUrl.append("=");
              sbUrl.append(URLEncoder.encode(entry.getValue(),"UTF-8"));
              isFirst=false;
        }
        return sbUrl.toString();
    }

    /**
     * 添加参数
     *
     * @param dicArgMap 源请求参数map
     * @param key key
     * @param value value
     * */
    protected void addArg(Map<String, String> dicArgMap, String key, String value) {
        dicArgMap.put(key,value);
    }
}
