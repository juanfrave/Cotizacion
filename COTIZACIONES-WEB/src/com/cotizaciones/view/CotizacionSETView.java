package com.cotizaciones.view;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.cotizaciones.entidad.CotizacionSET;
import com.cotizaciones.facade.CotizacionSetFacade;

@Named
@SessionScoped
public class CotizacionSETView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<CotizacionSET> cotizaciones;
	
	@EJB
	private CotizacionSetFacade cf;
	
	@PostConstruct
    public void init()   {
        try {
			cotizaciones = cf.listar();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public List<CotizacionSET> getCotizaciones() {
		return cotizaciones;
	}

	public void setCotizaciones(List<CotizacionSET> cotizaciones) {
		this.cotizaciones = cotizaciones;
	}

	
	
}