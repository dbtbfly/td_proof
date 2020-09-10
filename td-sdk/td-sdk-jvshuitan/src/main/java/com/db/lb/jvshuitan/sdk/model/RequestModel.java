package com.db.lb.jvshuitan.sdk.model;

/**
 *
 * 请求任务
 * */
public class RequestModel {

	private String PartnerId;
	private String Data;
	private CommonStatus Status = CommonStatus.IsSuccess;

	public String getPartnerId() {
		return PartnerId;
	}

	public void setPartnerId(String partnerId) {
		PartnerId = partnerId;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public CommonStatus getStatus() {
		return Status;
	}

	public void setStatus(CommonStatus status) {
		Status = status;
	}

}
