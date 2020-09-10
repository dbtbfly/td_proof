package com.db.lb.jvshuitan.sdk.api;

/**
 * 聚水潭 http client
 * */
public class JvShuiTanHttpClient extends JvShuiTanAbstractClient {

	/**
	 * 聚水潭 http 客户端
	 * @param partnerId 租户id
	 * @param partnerKey 租户秘钥
	 * @param token 令牌
	 * @param host openapi 地址
	 * @param methodName 方法名
	 * */
	  public JvShuiTanHttpClient(String partnerId, String partnerKey, String token , String methodName, String host) {
		  this.partnerId =partnerId;
		  this.partnerKey =partnerKey;
		  this.methodName =methodName;
		  this.host =host;
		  this.token =token;
	  }
}
