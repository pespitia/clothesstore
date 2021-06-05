package com.exp.clothesstore.ejb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.exp.clothesstore.dto.ProductDTO;
import com.exp.clothesstore.entities.Product;
import com.exp.clothesstore.enums.QueryEnum;

/**
 * Permite realizar la comunicaci&oacute;n entre la base de datos y la
 * aplicaci&oacute;n.
 * 
 * @author pespitia
 * @version 1.0, 2021/06/04
 */
@Stateless
public class ManageProductBean implements IManageProductLocal {

	/** Permite la comunicaci&oacute;n con la base de datos. */
	@PersistenceContext
	private EntityManager em;

	/**
	 * Recupera los productos de la base de datos. La consulta se puede filtrar por
	 * alg&uacute;n par&aacute;metro definido en la entrada {@code parameters}.
	 * 
	 * @return Listado de productos.
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ProductDTO> retrieveProducts(QueryEnum queryEnum, Map<String, String> mParameters) {
		Query query = em.createQuery(queryEnum.getSql());

		mParameters.forEach((k, v) -> {
			query.setParameter(k, v);
		});

		List<Product> products = query.getResultList();
		List<ProductDTO> productsDTO = new ArrayList<>();

		for (Product product : products) {
			productsDTO.add(castProductToDTO(product));
		}

		return productsDTO;
	}

	/**
	 * Convierte la instancia de un Product a su equivalente ProductDTO.
	 * 
	 * @param product -> Instancia Product.
	 * @return Equivalente ProductDTO.
	 */
	private ProductDTO castProductToDTO(Product product) {
		ProductDTO productDTO = new ProductDTO();

		if (product.getId() != null) {
			productDTO.setId(product.getId().toString());
		}

		productDTO.setName(product.getName());
		productDTO.setDescription(product.getDescription());
		productDTO.setPrice(product.getPrice());
		productDTO.setRateDiscount(product.getRateDiscount());
		productDTO.setImageFront(product.getImageFront());
		productDTO.setImageBack(product.getImageBack());
		productDTO.setPopularSearch(product.getPopularSearch());

		return productDTO;
	}
}
