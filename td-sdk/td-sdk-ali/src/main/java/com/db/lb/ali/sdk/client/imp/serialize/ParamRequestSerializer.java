/**
 *
 */
package com.db.lb.ali.sdk.client.imp.serialize;

import com.db.lb.ali.sdk.client.policy.Protocol;

/**
 * @author hongbang.hb
 *
 */
public class ParamRequestSerializer extends AbstractParamRequestSerializer {

	public String supportedContentType() {
		return Protocol.param.name();
	}

	@Override
	protected String processNestedParameter(Object value) {
		throw new RuntimeException("The param protocol does not support Nested parameters.");
	}

}
