package com.cotizaciones.view;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.cotizaciones.entidad.Cotizacion;
import com.cotizaciones.facade.CotizacionFacade;


@Named
@SessionScoped
public class CotizacionView implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Cotizacion> cotizaciones;
	private Cotizacion cotizacion;

	@EJB
	private CotizacionFacade cf;

	@PostConstruct
	public void init() {
		cotizaciones = cf.listar();
	}

	public String nuevo() {
		this.cotizacion = new Cotizacion();
		return "create";
	}

	public String create() {
		cf.crear(this.cotizacion);
		cotizaciones = cf.listar();

		return "index";
	}

	public String view(Cotizacion cotizacion) {
		this.cotizacion = cf.buscar(cotizacion.getCodigo());

		return "view";
	}

	public String edit(Cotizacion cotizacion) {
		this.cotizacion = cf.buscar(cotizacion.getCodigo());

		return "edit";
	}

	public String delete(Cotizacion cotizacion) {
		this.cotizacion = cf.buscar(cotizacion.getCodigo());

		return "delete";
	}

	public String actualizar() {
		this.cotizacion = cf.actualizar(this.cotizacion);
		this.cotizaciones = cf.listar();

		return "index";
	}

	public String borrar() {
		cf.borrar(this.cotizacion.getCodigo());
		this.cotizaciones = cf.listar();

		return "index";
	}

	public List<Cotizacion> getCotizaciones() {
		return cotizaciones;
	}

	public Cotizacion getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(Cotizacion cotizacion) {
		this.cotizacion = cotizacion;
	}
}