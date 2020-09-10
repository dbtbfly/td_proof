/**
 *
 */
package com.db.lb.ali.sdk.client;

import com.db.lb.ali.sdk.client.entity.AuthorizationToken;
import com.db.lb.ali.sdk.client.exception.OceanException;
import com.db.lb.ali.sdk.client.policy.RequestPolicy;

/**
 * @author hongbang.hb
 *
 */
public interface APIClient {


	public <T> T send(Request request, Class<T> resultType, RequestPolicy policy) throws OceanException;


	public AuthorizationToken getToken(String code) throws OceanException;


	public AuthorizationToken refreshToken(String refreshToken) throws OceanException;



	public void start();

	public void shutdown();


}
