package com.proyecto;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proyecto.model.ClienteDTO;
import com.proyecto.model.SolicitudEventoDTO;
import com.proyecto.service.ServiceCliente;
import com.proyecto.service.ServiceDocEvento;

@SpringBootTest
class DawiProyectoDataExpressApplicationTests {

	@Autowired
	private ServiceCliente serv;
	
	@Test
	void test()throws ParseException {
		List<ClienteDTO> lista =  serv.listaCliente();
		
		lista.forEach((cliente)-> System.out.print(cliente.getNom_cliente()));
		

	}
	
	@Test
	void tests() throws ParseException{
		
	}

}
