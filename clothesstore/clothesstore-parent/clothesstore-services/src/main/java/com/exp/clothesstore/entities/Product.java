package com.exp.clothesstore.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad que mapea la tabla PRODUCT asociada al esquema CLOTHESSTORE.
 * 
 * @author pespitia
 * @version 1.0, 2021/06/04
 *
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

	/** N&uacute;mero &uacute;nico que representa la clase serializable. */
	private static final long serialVersionUID = -3030638979327170733L;

	/** Id del producto. */
	private String id;

	/** Nombre del producto. */
	private String name;

	/** Descripci&oacute;n del producto. */
	private String description;

	/** Precio del producto. */
	private BigDecimal price;

	/** Porcentaje de descuento del producto. */
	private Integer rateDiscount;

	/** Base64 de la imagen frontal. */
	private String imageFront;

	/** Base64 de la imagen trasera. */
	private String imageBack;

	/** Indica si es un producto popular en las busquedas. */
	private Boolean popularSearch;

	public Product() {
	}

	@Id
	@Column(name = "ID")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "PRICE")
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "RATEDISCOUNT")
	public Integer getRateDiscount() {
		return rateDiscount;
	}

	public void setRateDiscount(Integer rateDiscount) {
		this.rateDiscount = rateDiscount;
	}

	@Column(name = "IMAGEFRONT")
	public String getImageFront() {
		return imageFront;
	}

	public void setImageFront(String imageFront) {
		this.imageFront = imageFront;
	}

	@Column(name = "IMAGEBACK")
	public String getImageBack() {
		return imageBack;
	}

	public void setImageBack(String imageBack) {
		this.imageBack = imageBack;
	}

	@Column(name = "POPULARSEARCH")
	public Boolean getPopularSearch() {
		return popularSearch;
	}

	public void setPopularSearch(Boolean popularSearch) {
		this.popularSearch = popularSearch;
	}
}
