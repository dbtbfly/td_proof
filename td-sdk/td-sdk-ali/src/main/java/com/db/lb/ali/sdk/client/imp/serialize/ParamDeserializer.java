/**
 *
 */
package com.db.lb.ali.sdk.client.imp.serialize;

import com.db.lb.ali.sdk.client.policy.Protocol;

/**
 * @author hongbang.hb
 *
 */
public class ParamDeserializer extends JsonDeserializer {

	@Override
	public String supportedContentType() {
		return Protocol.param.name();
	}

}
