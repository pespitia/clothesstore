/**
 * ManageProductRest.java
 */
package com.exp.clothesstore.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.exp.clothesstore.dto.ResultDTO;
import com.exp.clothesstore.ejb.IManageProductLocal;
import com.exp.clothesstore.enums.ParameterEnum;
import com.exp.clothesstore.enums.QueryEnum;

/**
 * @author pespitia
 * @version 1.0, 2021/06/04
 */
@Path("/manageproduct")
public class ManageProductRest {

	/** Inyeccion de dependencia que gestiona las operaciones de un producto. */
	@EJB
	private IManageProductLocal manageProductEjb;

	/**
	 * &Uacute;til para probar el funcionamiento basico del servicio API Restful.
	 * 
	 * Servicio: http://localhost:8085/clothesstore-services/rest/manageproduct/test
	 * 
	 * @return Mensaje quemado: "API REST Test"
	 */
	@GET
	@Path("/test")
	@Produces
	public String testApiRest() {
		return "API REST Test";
	}

	/**
	 * Consulta los productos m&aacute;s populares.
	 * 
	 * Servicio:
	 * http://localhost:8085/clothesstore-services/rest/manageproduct/morepopular
	 * 
	 * @return Lista de productos más populares en formato JSON.
	 */
	@GET
	@Path("/morepopular")
	@Produces({ MediaType.APPLICATION_JSON })
	public ResultDTO getMorePopularProduct() {
		ResultDTO resultDTO = new ResultDTO();
		resultDTO.setResponse(manageProductEjb.retrieveProducts(QueryEnum.SQL_1, new HashMap<>()));

		return resultDTO;
	}

	/**
	 * Consulta los productos por nombre.
	 * 
	 * Servicio:
	 * http://localhost:8085/clothesstore-services/rest/manageproduct/productbyname?name=blusa
	 * 
	 * @return Lista los productos que cumplan la condicion.
	 */
	@GET
	@Path("/productbyname")
	@Produces({ MediaType.APPLICATION_JSON })
	public ResultDTO getProductByName(@QueryParam("name") String name) {
		if (name == null || name.isEmpty()) {
			return new ResultDTO(400, "The name parameter is empty.");
		}

		ResultDTO resultDTO = new ResultDTO();

		Map<String, String> params = new HashMap<>();

		params.put(ParameterEnum.UN_NAME.getName(), new StringBuilder("%").append(name).append("%").toString());
		resultDTO.setResponse(manageProductEjb.retrieveProducts(QueryEnum.SQL_2, params));

		return resultDTO;
	}

	/**
	 * Consulta los productos por id.
	 * 
	 * Servicio:
	 * http://localhost:8085/clothesstore-services/rest/manageproduct/productbyid?id=1
	 * 
	 * @return Lista los productos que cumplan la condicion.
	 */
	@GET
	@Path("/productbyid")
	@Produces({ MediaType.APPLICATION_JSON })
	public ResultDTO getProductById(@QueryParam("id") Integer id) {
		if (id == null) {
			return new ResultDTO(400, "The id parameter is empty.");
		}

		ResultDTO resultDTO = new ResultDTO();
		Map<String, String> params = new HashMap<>();

		params.put(ParameterEnum.UN_ID.getName(), Integer.toString(id));
		resultDTO.setResponse(manageProductEjb.retrieveProducts(QueryEnum.SQL_3, params));

		return resultDTO;
	}
}
