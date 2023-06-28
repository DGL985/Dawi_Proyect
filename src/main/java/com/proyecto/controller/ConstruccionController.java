package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.model.Construccion;
import com.proyecto.model.DocumentoDTO;
import com.proyecto.model.EstadoDTO;
import com.proyecto.service.ServiceConstruccion;
import com.proyecto.service.ServiceEstado;
import com.proyecto.service.serviceDocumentos;


@Controller
@RequestMapping("/lista")
public class ConstruccionController {
	
	//OBJETOS DE REPOSITORIO
	@Autowired
	private ServiceConstruccion servConstruccion;
	
	@Autowired
	private ServiceEstado servEstado;
	
	@Autowired
	private serviceDocumentos servDocumento;
	
	@RequestMapping("/")
	public String listaConstruccion(Model model) {
		List<Construccion> listaConstruccion =  servConstruccion.listadoDocConstruccion();
		List<DocumentoDTO> listaDocumento = servDocumento.listaDocumento();
		List<EstadoDTO> listaEstado = servEstado.listadoEstado();
		
		model.addAttribute("documento",listaDocumento);//lista los documentos
		model.addAttribute("estados", listaEstado);//lista de estado
		model.addAttribute("listaEventos", listaConstruccion);
		
		return "soliConstruccion";
		
	}
	
	@RequestMapping("/registrar")
	public String registrar(
			@RequestParam("codigo") int codigoSol,
			@RequestParam("codCliente") int codCli, 
			@RequestParam("numeroPartida") String nmrPartida,
			@RequestParam("NumeroAsiento") String numAsiento,
			@RequestParam("NumParElectro") String numElectro,
			@RequestParam("NumeroFicha") String numFicha,
			@RequestParam("NumeroExpediente") String numExpedi,
			@RequestParam("DocumentoSimple") int docSimple, 
			@RequestParam("TipoDocumento") int tipDoc, 
			@RequestParam("Estado") int estado, Model model) {
		
		try {
			Construccion sol = new Construccion();
			sol.setCod_soli_const(codigoSol);
			sol.setNro_partida(nmrPartida);
			sol.setNro_asiento(numAsiento);
			sol.setNro_partida_electronica(numElectro);
			sol.setNro_ficha(numFicha);
			sol.setNro_expediente(numExpedi);
			
			EstadoDTO es = new EstadoDTO();
			es.setCod_estado(estado);
			sol.setCodEstado(es);
			
			DocumentoDTO d = new DocumentoDTO();
			d.setCod_doc(tipDoc);
			sol.setCodDocumento(d);
			
			servConstruccion.grabarDoc(sol);
			System.out.print("Bingo");
			
		} catch (Exception e) {
			System.out.print("Error");
		}
		
		
		return "forward:/lista/";
	}
	
	
//	@GetMapping("/Construccion")
//	public String cargarPagSoliConstruccion(Model model) {
//		
//		model.addAttribute("construccion", new Construccion());
//		//ENVIAR LISTADO PARA GENERAR LOS COMBOS
//		model.addAttribute("lstEstado", repoEstado.findAll());
//		model.addAttribute("lstDocumento", repoDocumento.findAll());
//		return "soliConstruccion";
//	}
//	
//	@PostMapping("/leer")
//	public String leerDatosConstruccion(@ModelAttribute Construccion construccion, Model model) {
//		System.out.println(construccion);
//		//GIARDA EN LA TABLA USANDO REPOSITORY
//		try {
//			repoConstruccion.save(construccion);
//			model.addAttribute("mensaje", "Registro de Solictud OK");
//			model.addAttribute("claseMensaje", "alert alert-sucess");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			model.addAttribute("mensaje", "Error en el Registro");
//			model.addAttribute("claseMensaje", "alert alert-danger");
//		}
//		return "soliConstruccion";
//	}

}
