/**
 *
 */
package com.db.lb.ali.sdk.common;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.db.lb.ali.sdk.client.policy.RequestPolicy;
import com.db.lb.ali.sdk.client.APIId;

/**
 * @author hongbang.hb
 *
 */
public abstract class AbstractAPIRequest<TResponse> {

	protected RequestPolicy oceanRequestPolicy = new RequestPolicy();

	protected APIId oceanApiId;

	public RequestPolicy getOceanRequestPolicy() {
		return oceanRequestPolicy;
	}

	public void setOceanRequestPolicy(RequestPolicy oceanRequestPolicy) {
		this.oceanRequestPolicy = oceanRequestPolicy;
	}

	public APIId getOceanApiId() {
		return oceanApiId;
	}

	public void setOceanApiId(APIId oceanApiId) {
		this.oceanApiId = oceanApiId;
	}

	public Class<TResponse> getResponseClass() {
		Type type = this.getClass().getGenericSuperclass();

		ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
		return (Class) parameterizedType.getActualTypeArguments()[0];
	}
}
