/**
 *
 */
package com.db.lb.ali.sdk.example;

import com.db.lb.ali.sdk.client.policy.RequestPolicy;
import com.db.lb.ali.sdk.common.SDKResult;
import com.db.lb.ali.sdk.example.param.ExampleFamilyGetParam;
import com.db.lb.ali.sdk.example.param.ExampleFamilyGetResult;
import com.db.lb.ali.sdk.example.param.ExampleFamilyPostParam;
import com.db.lb.ali.sdk.example.param.ExampleFamilyPostResult;
import com.db.lb.ali.sdk.AliApiExecutor;
import com.db.lb.ali.sdk.client.APIId;
import com.db.lb.ali.sdk.util.DateUtil;

/**
 *
 *
 *
 * @author hongbang.hb
 *
 */
public class RawSdkExample {

	/**
	 * It is an example to simulate the request without accessToken. In this
	 * example, the result is a complex object. You need not care if the
	 * signature is required, the signature is handled by SDK automatically.
	 *
	 * @param aliApiExecutor
	 */
	public void exampleFamilyGet(AliApiExecutor aliApiExecutor) {
		ExampleFamilyGetParam exampleFamilyGetParam = new ExampleFamilyGetParam();

		APIId oceanApiId = new APIId("api.example", "example.family.get", 1);
		exampleFamilyGetParam.setOceanApiId(oceanApiId);

		RequestPolicy oceanRequestPolicy = new RequestPolicy();
		oceanRequestPolicy.setHttpMethod(RequestPolicy.HttpMethodPolicy.POST).setNeedAuthorization(false)
				.setRequestSendTimestamp(false).setUseHttps(false).setUseSignture(true).setAccessPrivateApi(false);
		exampleFamilyGetParam.setOceanRequestPolicy(oceanRequestPolicy);

		exampleFamilyGetParam.setFamilyNumber(1);
		SDKResult<ExampleFamilyGetResult> exampleFamilyGetResult = aliApiExecutor.execute(exampleFamilyGetParam);

		System.out.println("ExampleFamilyGet call, family information of Result:" + exampleFamilyGetResult.getResult());
	}

	/**
	 * It is an example to simulate the request which require accessToken. In
	 * this example, HouseImg is a byte array which simulate the feature of
	 * upload image. You need not care if the signature is required, the
	 * signature is handled by SDK automatically.
	 *
	 *
	 * @param aliApiExecutor
	 * @param accessToken
	 *
	 */
	public void exampleFamilyPost(AliApiExecutor aliApiExecutor, String accessToken) {
		ExampleFamilyPostParam exampleFamilyPostParam = new ExampleFamilyPostParam();

		// Indicate the API Id, api.example:example.family.post-1 is an API
		// created already in system.
		// Please refer to
		// http://ohz.alibaba-inc.com/isp/apifactory/api/view.htm?namespace=api.example&name=example.family.post&version=1&isDraft=true
		APIId oceanApiId = new APIId("api.example", "example.family.post", 1);
		exampleFamilyPostParam.setOceanApiId(oceanApiId);

		// Then setup the request policy for calling API.
		// You must understand below property for the request policy even there
		// are default value exist.
		// Below property were depending on the the configuration in server
		// side, you can contact Ocean Team for detail.
		RequestPolicy oceanRequestPolicy = new RequestPolicy();
		oceanRequestPolicy.setHttpMethod(RequestPolicy.HttpMethodPolicy.POST).setNeedAuthorization(false)
				.setRequestSendTimestamp(false).setUseHttps(false).setUseSignture(true).setAccessPrivateApi(false)
				.setDateFormat(DateUtil.SIMPLE_DATE_FORMAT_STR);
		exampleFamilyPostParam.setOceanRequestPolicy(oceanRequestPolicy);

		// This example help us to understand how to send an complex request to
		// Ocean.
		exampleFamilyPostParam.setComments("Example for SDK");
		// it is a complex request, SDK help us to create Json Object
		// automatically.
		exampleFamilyPostParam.setFamily(RawSdkExampleData.createFirstFamily());
		// Also, if you need send some byte array information like image.
		exampleFamilyPostParam.setHouseImg(RawSdkExampleData.getPicture("example.png"));
		// Calling and get the result.
		SDKResult<ExampleFamilyPostResult> exampleFamilyPostResult = aliApiExecutor.execute(exampleFamilyPostParam,
				accessToken);

		System.out.println("ExampleFamilyPost call, Family information of Result:"
				+ exampleFamilyPostResult.getResult().getResult());
		System.out.println("ExampleFamilyPost call, Desc of Result:"
				+ exampleFamilyPostResult.getResult().getResultDesc());
	}

	public static void main(String[] args) {

		AliApiExecutor aliApiExecutor = new AliApiExecutor("{appKey}", "{appSecret}");
		RawSdkExample rawSdkExample = new RawSdkExample();
		rawSdkExample.exampleFamilyGet(aliApiExecutor);

		rawSdkExample.exampleFamilyPost(aliApiExecutor, "{the access token}");
	}
}
