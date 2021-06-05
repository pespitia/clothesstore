package com.exp.clothesstore.enums;

/**
 * Enumerado que contiene las sentencias SQL utilizadas en el código para
 * consultar en la base de datos.
 * 
 * @author pespitia
 * @version 1.0, 2021/06/04
 *
 */
public enum QueryEnum {
	SQL_1("select p from Product p where p.popularSearch not in(0)")

	, SQL_2("select p from Product p where lower(p.name) like :name")

	, SQL_3("select p from Product p where p.id = :id");

	/**
	 * Sentencia SQL.
	 */
	private String sql;

	private QueryEnum(String sql) {
		this.sql = sql;
	}

	public String getSql() {
		return sql;
	}
}
