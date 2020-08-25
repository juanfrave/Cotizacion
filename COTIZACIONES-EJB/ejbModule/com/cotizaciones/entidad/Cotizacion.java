/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cotizaciones.entidad;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author juanf
 */
@Entity
@Table(name = "cotizaciones")
public class Cotizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int codigo;
    
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @Column(name = "dolar_compra")
    private BigInteger dolarCompra;
    
    @Column(name = "dolar_venta")
    private BigInteger dolarVenta;
    
    @Column(name = "real_compra")
    private BigInteger realCompra;
    
    @Column(name = "real_venta")
    private BigInteger realVenta;
    
    @Column(name = "peso_arg_compra")
    private BigInteger pesoArgCompra;
    
    @Column(name = "peso_arg_venta")
    private BigInteger pesoArgVenta;
    
    @Column(name = "yen_compra")
    private BigInteger yenCompra;
    
    @Column(name = "yen_venta")
    private BigInteger yenVenta;
    
    @Column(name = "euro_compra")
    private BigInteger euroCompra;
    
    @Column(name = "euro_venta")
    private BigInteger euroVenta;
    
    @Column(name = "libra_compra")
    private BigInteger libraCompra;
    
    @Column(name = "libra_venta")
    private BigInteger libraVenta;

    public Cotizacion() {
    }

    public Cotizacion(Integer codigo) {
        this.codigo = codigo;
    }

    public Cotizacion(Integer codigo, Date fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
    }

    public Cotizacion(Date fecha) {
        this.fecha = fecha;
    }

    
    public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigInteger getDolarCompra() {
		return dolarCompra;
	}

	public void setDolarCompra(BigInteger dolarCompra) {
		this.dolarCompra = dolarCompra;
	}

	public BigInteger getDolarVenta() {
		return dolarVenta;
	}

	public void setDolarVenta(BigInteger dolarVenta) {
		this.dolarVenta = dolarVenta;
	}

	public BigInteger getRealCompra() {
		return realCompra;
	}

	public void setRealCompra(BigInteger realCompra) {
		this.realCompra = realCompra;
	}

	public BigInteger getRealVenta() {
		return realVenta;
	}

	public void setRealVenta(BigInteger realVenta) {
		this.realVenta = realVenta;
	}

	public BigInteger getPesoArgCompra() {
		return pesoArgCompra;
	}

	public void setPesoArgCompra(BigInteger pesoArgCompra) {
		this.pesoArgCompra = pesoArgCompra;
	}

	public BigInteger getPesoArgVenta() {
		return pesoArgVenta;
	}

	public void setPesoArgVenta(BigInteger pesoArgVenta) {
		this.pesoArgVenta = pesoArgVenta;
	}

	public BigInteger getYenCompra() {
		return yenCompra;
	}

	public void setYenCompra(BigInteger yenCompra) {
		this.yenCompra = yenCompra;
	}

	public BigInteger getYenVenta() {
		return yenVenta;
	}

	public void setYenVenta(BigInteger yenVenta) {
		this.yenVenta = yenVenta;
	}

	public BigInteger getEuroCompra() {
		return euroCompra;
	}

	public void setEuroCompra(BigInteger euroCompra) {
		this.euroCompra = euroCompra;
	}

	public BigInteger getEuroVenta() {
		return euroVenta;
	}

	public void setEuroVenta(BigInteger euroVenta) {
		this.euroVenta = euroVenta;
	}

	public BigInteger getLibraCompra() {
		return libraCompra;
	}

	public void setLibraCompra(BigInteger libraCompra) {
		this.libraCompra = libraCompra;
	}

	public BigInteger getLibraVenta() {
		return libraVenta;
	}

	public void setLibraVenta(BigInteger libraVenta) {
		this.libraVenta = libraVenta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        return "Cotizaciones{" + "codigo=" + codigo + ", fecha=" + fecha + ", dolarCompra=" + dolarCompra + ", dolarVenta=" + dolarVenta + ", realCompra=" + realCompra + ", realVenta=" + realVenta + ", pesoArgCompra=" + pesoArgCompra + ", pesoArgVenta=" + pesoArgVenta + ", yenCompra=" + yenCompra + ", yenVenta=" + yenVenta + ", euroCompra=" + euroCompra + ", euroVenta=" + euroVenta + ", libraCompra=" + libraCompra + ", libraVenta=" + libraVenta + '}';
    }

   
    
}
