package com.vet.maestria.domain.vet;

public class Response {
	
	private Object object;

	private ResponseType responseType;

	public Response() {}

	public Response(Object object, ResponseType responseType) {
		this.object = object;
		this.responseType = responseType;
		
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public ResponseType getResponseType() {
		return responseType;
	}

	public void setResponseType(ResponseType responseType) {
		this.responseType = responseType;
	}

}
