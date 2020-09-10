/**
 *
 */
package com.db.lb.ali.sdk.client;

import com.db.lb.ali.sdk.client.serialize.DeSerializerListener;
import com.db.lb.ali.sdk.client.serialize.SerializerListener;

/**
 * @author hongbang.hb
 *
 */
public interface SDKListener {

	public void register(SerializerListener serializerListener);

	public void register(DeSerializerListener deSerializerListener);

}
