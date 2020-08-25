package com.cotizaciones.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import java.io.IOException;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import com.cotizaciones.entidad.CotizacionSET;

/**
 * Session Bean implementation class LibroFacade
 */
@Stateless
public class CotizacionSetFacade {

	public List<CotizacionSET> listar() throws IOException {

		List<CotizacionSET> list = new ArrayList<CotizacionSET>();

		Document doc = Jsoup.connect(
				"https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2020/h-mes-de-agosto&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2020/H%20-%20Mes%20de%20Agosto")
				.get();
		Elements elements = doc.select("div#UIPage div.webContentInformation table tbody tr td");

		for (int i = 20; i < elements.size(); i = i + 13) {
			String fecha = elements.get(i).text();

			String dolarCompra = elements.get(i + 1).text();

			String dolarVenta = elements.get(i + 2).text();

			String realCompra = elements.get(i + 3).text();

			String realVenta = elements.get(i + 4).text();

			String pesoArgCompra = elements.get(i + 5).text();

			String pesoArgVenta = elements.get(i + 6).text();

			String yenCompra = elements.get(i + 7).text();

			String yenVenta = elements.get(i + 8).text();

			String euroCompra = elements.get(i + 9).text();

			String euroVenta = elements.get(i + 10).text();

			String libraCompra = elements.get(i + 11).text();

			String libraVenta = elements.get(i + 12).text();

			list.add(new CotizacionSET(fecha, dolarCompra, dolarVenta, realCompra, realVenta, pesoArgCompra,
					pesoArgVenta, yenCompra, yenVenta, euroCompra, euroVenta, libraCompra, libraVenta));
		}

		// list.add(new CotizacionSET("01"));
		return list;
	}

}
