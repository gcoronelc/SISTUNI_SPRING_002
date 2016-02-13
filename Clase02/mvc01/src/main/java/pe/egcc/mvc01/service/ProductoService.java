package pe.egcc.mvc01.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import pe.egcc.mvc01.dto.ProductoDto;


@Service
public class ProductoService {

	private List<ProductoDto> lista;
	
	@PostConstruct
	private void initBean(){
		lista = new ArrayList<>();
		lista.add(new ProductoDto("Agua Cielo",1.50,200));
		lista.add(new ProductoDto("CocaCola",2.50,100));
		lista.add(new ProductoDto("Cerveza",7.50,500));
		lista.add(new ProductoDto("Chicha Morada",4.0,300));
		lista.add(new ProductoDto("Helado",9.50,180));
	}
	
	public List<ProductoDto> getAll(){
		return lista;
	}
	
	public ProductoDto get(int i){
		return lista.get(i);
	}
	
}
