/**
 *
 */
package com.db.lb.ali.sdk.client.imp.serialize;

import com.db.lb.ali.sdk.client.policy.Protocol;

/**
 * @author hongbang.hb
 *
 */
public class Param2Deserializer extends Json2Deserializer {

	@Override
	public String supportedContentType() {
		return Protocol.param2.name();
	}

}
