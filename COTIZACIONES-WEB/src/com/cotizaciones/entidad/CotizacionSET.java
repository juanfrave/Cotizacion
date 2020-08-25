package com.cotizaciones.entidad;

public class CotizacionSET {

	private String fecha;

	private String dolarCompra;

	private String dolarVenta;

	private String realCompra;

	private String realVenta;

	private String pesoArgCompra;

	private String pesoArgVenta;

	private String yenCompra;

	private String yenVenta;

	private String euroCompra;

	private String euroVenta;

	private String libraCompra;

	private String libraVenta;

	public CotizacionSET() {

	}

	public CotizacionSET(String fecha) {
		this.fecha = fecha;
	}

	public CotizacionSET(String fecha, String dolarCompra, String dolarVenta, String realCompra, String realVenta,
			String pesoArgCompra, String pesoArgVenta, String yenCompra, String yenVenta, String euroCompra,
			String euroVenta, String libraCompra, String libraVenta) {
		this.fecha = fecha;
		this.dolarCompra = dolarCompra;
		this.dolarVenta = dolarVenta;
		this.realCompra = realCompra;
		this.realVenta = realVenta;
		this.pesoArgCompra = pesoArgCompra;
		this.pesoArgVenta = pesoArgVenta;
		this.yenCompra = yenCompra;
		this.yenVenta = yenVenta;
		this.euroCompra = euroCompra;
		this.euroVenta = euroVenta;
		this.libraCompra = libraCompra;
		this.libraVenta = libraVenta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDolarCompra() {
		return dolarCompra;
	}

	public void setDolarCompra(String dolarCompra) {
		this.dolarCompra = dolarCompra;
	}

	public String getDolarVenta() {
		return dolarVenta;
	}

	public void setDolarVenta(String dolarVenta) {
		this.dolarVenta = dolarVenta;
	}

	public String getRealCompra() {
		return realCompra;
	}

	public void setRealCompra(String realCompra) {
		this.realCompra = realCompra;
	}

	public String getRealVenta() {
		return realVenta;
	}

	public void setRealVenta(String realVenta) {
		this.realVenta = realVenta;
	}

	public String getPesoArgCompra() {
		return pesoArgCompra;
	}

	public void setPesoArgCompra(String pesoArgCompra) {
		this.pesoArgCompra = pesoArgCompra;
	}

	public String getPesoArgVenta() {
		return pesoArgVenta;
	}

	public void setPesoArgVenta(String pesoArgVenta) {
		this.pesoArgVenta = pesoArgVenta;
	}

	public String getYenCompra() {
		return yenCompra;
	}

	public void setYenCompra(String yenCompra) {
		this.yenCompra = yenCompra;
	}

	public String getYenVenta() {
		return yenVenta;
	}

	public void setYenVenta(String yenVenta) {
		this.yenVenta = yenVenta;
	}

	public String getEuroCompra() {
		return euroCompra;
	}

	public void setEuroCompra(String euroCompra) {
		this.euroCompra = euroCompra;
	}

	public String getEuroVenta() {
		return euroVenta;
	}

	public void setEuroVenta(String euroVenta) {
		this.euroVenta = euroVenta;
	}

	public String getLibraCompra() {
		return libraCompra;
	}

	public void setLibraCompra(String libraCompra) {
		this.libraCompra = libraCompra;
	}

	public String getLibraVenta() {
		return libraVenta;
	}

	public void setLibraVenta(String libraVenta) {
		this.libraVenta = libraVenta;
	}
	
	

}
