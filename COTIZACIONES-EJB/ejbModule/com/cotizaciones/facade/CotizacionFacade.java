package com.cotizaciones.facade;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cotizaciones.entidad.Cotizacion;

/**
 * Session Bean implementation class LibroFacade
 */
@Stateless
public class CotizacionFacade {
	
	@PersistenceContext
	EntityManager em;

    /**
     * Default constructor. 
     */
    public CotizacionFacade() {
        // TODO Auto-generated constructor stub
    }
    
    public List<Cotizacion> listar(){
    	return em.createQuery("SELECT c FROM Cotizacion c").getResultList();
    }
    
    public Cotizacion buscar(Integer codigo) {
    	return em.find(Cotizacion.class, codigo);
    }
    
    public Cotizacion buscar_fecha(Date fecha) {
    	return em.find(Cotizacion.class, fecha);
    }
    
    public Cotizacion crear(Cotizacion cotizacion) {
    	try {
    		em.persist(cotizacion);
        	em.refresh(cotizacion);
		} catch (Exception e) {
			System.out.println("Erro en la creacion: "+e);
		}
    	return cotizacion;
    }
    
    public Cotizacion actualizar(Cotizacion cotizacion) {
    	try {
    		em.merge(cotizacion);
		} catch (Exception e) {
			System.out.println("Erro en la actualizacion: "+e);
		}
    	
    	return cotizacion;
    	
    }
    
    public void borrar(Integer codigo) {
    	try {
    		Cotizacion cotizacion = em.find(Cotizacion.class, codigo);
        	em.remove(cotizacion);
		} catch (Exception e) {
			System.out.println("Erro en la eliminacion: "+e);
		}
    	
    }

}
