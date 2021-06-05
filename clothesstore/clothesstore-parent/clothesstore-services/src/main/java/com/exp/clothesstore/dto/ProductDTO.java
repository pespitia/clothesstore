package com.exp.clothesstore.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Clase utilizada como objeto de transferencia de la informaci&oacute;n de un
 * producto.
 * 
 * @author pespitia
 * @version 1.0
 *
 */
public class ProductDTO implements Serializable {

	/** N&uacute;mero unico que representa la clase serializable. */
	private static final long serialVersionUID = -1424039964596472995L;

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

	/**
	 * Precio del producto con descuento, cuyo valor es calculado:<br>
	 * discountPrice = (price/100)*rateDiscount
	 */
	private BigDecimal discountPrice;

	public ProductDTO() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getRateDiscount() {
		return rateDiscount;
	}

	public void setRateDiscount(Integer rateDiscount) {
		this.rateDiscount = rateDiscount;
	}

	public String getImageFront() {
		return imageFront;
	}

	public void setImageFront(String imageFront) {
		this.imageFront = imageFront;
	}

	public String getImageBack() {
		return imageBack;
	}

	public void setImageBack(String imageBack) {
		this.imageBack = imageBack;
	}

	public Boolean getPopularSearch() {
		return popularSearch;
	}

	public void setPopularSearch(Boolean popularSearch) {
		this.popularSearch = popularSearch;
	}

	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}
}
