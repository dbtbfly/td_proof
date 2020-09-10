package com.db.lb.ali.sdk.client.imp.serialize;

import com.db.lb.ali.sdk.client.policy.Protocol;

/**
 * @author hongbang.hb
 *
 */
public class HttpRequestSerializer extends AbstractParamRequestSerializer {

	public String supportedContentType() {
		return Protocol.http.name();
	}

	@Override
	protected String processNestedParameter(Object value) {
		throw new RuntimeException(
				"The param protocol does not support Nested parameters.");
	}

}
