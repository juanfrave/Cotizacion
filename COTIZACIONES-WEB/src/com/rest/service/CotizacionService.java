package com.rest.service;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.primefaces.convert.DatePatternConverter;

import com.cotizaciones.entidad.Cotizacion;
import com.cotizaciones.facade.CotizacionFacade;

@Path("cotizacion")
public class CotizacionService {

	@Inject
	CotizacionFacade cf;

	// GET http://localhost:8080/COTIZACIONES-WEB/rest/cotizacion/list
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<Cotizacion> listar() {
		return cf.listar();
	}

	// GET http://localhost:8080/COTIZACIONES-WEB/rest/cotizacion/find/n
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/find/{codigo}")
	public Cotizacion buscar(@PathParam("codigo") Integer codigo) {
		return cf.buscar(codigo);
	}

	// GET http://localhost:8080/COTIZACIONES-WEB/rest/cotizacion/find_date/n
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/find_date/{fecha}")
	public Cotizacion buscar(@PathParam("fecha") Date fecha) {
		return cf.buscar_fecha(fecha);
	}

	// POST http://localhost:8080/COTIZACIONES-WEB/rest/cotizacion/create
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Cotizacion crear(Cotizacion cotizacion) {
		return cf.crear(cotizacion);
	}

	// PUT http://localhost:8080/COTIZACIONES-WEB/rest/cotizacion/update
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Cotizacion actualizar(Cotizacion cotizacion) {
		return cf.actualizar(cotizacion);
	}

	// DELETE http://localhost:8080/COTIZACIONES-WEB/rest/cotizacion/delete/n
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/delete/{codigo}")
	public void borrar(@PathParam("codigo") Integer codigo) {
		cf.borrar(codigo);
	}
	
	
}
