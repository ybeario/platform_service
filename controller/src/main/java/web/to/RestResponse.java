package web.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("code")
	private String errorCode;

	@JsonProperty("message")
	private String errorMessage;

	@JsonProperty("data")
	private Object body;

	RestResponse() {
	}

	public RestResponse(Object body) {
		this.body = body;
	}

	public RestResponse(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public Object getBody() {
		return body;
	}

}