package com.exp.clothesstore.dto;

import java.io.Serializable;

/**
 * Clase utilizada para enviar el resultado de la ejecuci&oacute;n.
 * 
 * @author pespitia
 * @version 1.0, 2021/06/04
 */
public class ResultDTO implements Serializable {

	/**
	 * Identificador serial de la clase.
	 */
	private static final long serialVersionUID = -716568289561057990L;

	/**
	 * C&oacute;digo de estado de la respuesta HTTP.
	 * <li>200</li> Ok
	 * <li>400</li> Bad Request
	 */
	private int status;

	/**
	 * Mensaje de ejecución.
	 */
	private String message;

	/**
	 * Resultado de la ejecución correcta del servicio.
	 */
	private Object response;

	public ResultDTO() {
		this.status = 200;
		this.message = "Process successfully executed";
	}

	/**
	 * @param status Estado de la ejecuci&oacute;n.
	 * @param message Mensaje de la ejecuci&oacute;n.
	 */
	public ResultDTO(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}
}
