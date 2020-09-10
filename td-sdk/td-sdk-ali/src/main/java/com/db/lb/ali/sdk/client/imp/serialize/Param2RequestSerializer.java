/**
 *
 */
package com.db.lb.ali.sdk.client.imp.serialize;

import com.alibaba.fastjson.JSON;
import com.db.lb.ali.sdk.client.policy.Protocol;

/**
 * @author hongbang.hb
 *
 */
public class Param2RequestSerializer extends AbstractParamRequestSerializer {


	public String supportedContentType() {
		return Protocol.param2.name();
	}

	@Override
	protected String processNestedParameter(Object value) {

		return JSON.toJSONString(value);

	}
}
