package com.exp.clothesstore.enums;

/**
 * Enumerado que contiene los par&aacute;metros que se utilizan en las
 * consultas.
 * 
 * @author pespitia
 * @version 1.0, 2021/06/04
 *
 */
public enum ParameterEnum {
	UN_ID("id")

	, UN_NAME("name")

	, UN_POPULARSEARCH("popularsearch");

	/**
	 * Nombre del par&aacute;metro.
	 */
	private String name;

	private ParameterEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
