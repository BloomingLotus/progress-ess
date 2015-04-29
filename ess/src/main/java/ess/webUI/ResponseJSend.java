package ess.webUI;

public class ResponseJSend<T> {
	public ResponseStatus status;
	public T data;
	public String message;
	
	public ResponseJSend(ResponseStatus status, T data) {
		this.status = status;
		this.data = data;
	}

	public ResponseJSend() {
		this.status = ResponseStatus.ERROR;
		this.data = null;
		this.message = "";
	}


	
}
