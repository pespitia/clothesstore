package com.exp.clothesstore.ejb;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import com.exp.clothesstore.dto.ProductDTO;
import com.exp.clothesstore.enums.QueryEnum;

/**
 * Expone los m&eacute;todos del EJB ManageProduct.
 * 
 * @author pespitia
 * @version 1.0, 2021/06/04
 */
@Local
public interface IManageProductLocal {

	/**
	 * M&eacute;todo encargado de recuperar los productos en la base de datos.
	 */
	public List<ProductDTO> retrieveProducts(QueryEnum queryEnum, Map<String, String> mParameters);
}
