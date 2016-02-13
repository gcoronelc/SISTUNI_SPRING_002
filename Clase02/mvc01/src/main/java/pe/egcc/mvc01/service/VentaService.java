package pe.egcc.mvc01.service;

import org.springframework.stereotype.Service;

import pe.egcc.mvc01.dto.VentaDto;

@Service
public class VentaService {

	public void procesar(VentaDto ventaDto) {
		// Variables
		double importe, impuesto, total;
		// calculos
		importe = ventaDto.getPrecio() * ventaDto.getCant();
		impuesto = importe - 0.18;
		total = importe + impuesto;
		// Reporte
		ventaDto.setImporte(importe);
		ventaDto.setImpuesto(impuesto);
		ventaDto.setTotal(total);
	}

}
