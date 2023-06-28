package com.proyecto.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.model.ClienteDTO;
import com.proyecto.model.DocumentoDTO;
import com.proyecto.model.EstadoDTO;
import com.proyecto.model.SolicitudEventoDTO;
import com.proyecto.service.ServiceDocEvento;
import com.proyecto.service.ServiceEstado;
import com.proyecto.service.serviceDocumentos;

@Controller
@RequestMapping("/lista")
public class EventoController {
	
	@Autowired
	private ServiceDocEvento servDocEvento;
	
	@Autowired
	private serviceDocumentos servDocumento;
	
	@Autowired	
	private ServiceEstado servEstado;

	@RequestMapping("/")
	public String listaEvento(Model model) {
		
		List<SolicitudEventoDTO> listaEvento = servDocEvento.listadoDOCEvento();
		
		List<DocumentoDTO> listaDocumento = servDocumento.listaDocumento();
		
		List<EstadoDTO> listaEstado = servEstado.listadoEstado();
		
		model.addAttribute("documento",listaDocumento);//lista los documentos
		model.addAttribute("estados", listaEstado);//lista de estado
		model.addAttribute("listaEventos", listaEvento);
		
		return "evento";
	}
	
	@RequestMapping("/registrar")
	public String registrar(@RequestParam("labo") int codigoSol,
			@RequestParam("codigoCliente") int codCli, @RequestParam("nro_invitado") int nrInviatado,
			@RequestParam("lugar_realizar") String lugar,@RequestParam("h_inicio") String h_inicio,
			@RequestParam("h_fin") String h_fin,@RequestParam("tipoEstado") int tipoEstado,
			@RequestParam("tipoSol") int tipoSol, @RequestParam("fecha") String fecha, Model rediModel) {
		
		try {
			SolicitudEventoDTO sol = new SolicitudEventoDTO();
			sol.setCodSolicitud(codigoSol);
			sol.setFecha(new SimpleDateFormat("yyyy-MM-dd").parse(fecha));
			sol.setNumeroDeInvitado(nrInviatado);
			sol.setLugarDeRealizacion(lugar);
			sol.setHoraInicio(h_inicio);
			sol.setHoraFin(h_fin);
			
			EstadoDTO es = new EstadoDTO();
			es.setCod_estado(tipoEstado);
			sol.setCodEstado(es);
			
			DocumentoDTO d = new DocumentoDTO();
			d.setCod_doc(tipoSol);
			
			sol.setCodDocumento(d);
			
			ClienteDTO cli = new ClienteDTO();
			cli.setCod_cliente(codCli);
			
			sol.setCodCliente(cli);
			
			servDocEvento.grabarDoc(sol);
			
			if(codigoSol==0) {
				System.out.print("Solicitud Registrado");
			}else {
				System.out.print("Solicitud Actualizado");
			}
			
			
		} catch (Exception e) {
			System.out.print("Error:" + e.getMessage());
		}
		
		
		return "forward:/lista/";
	}
	
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam("codigo") int codigo,Model rediModel) {
		servDocEvento.eliminar(codigo);
		
		return "forward:/lista/";
	}
	
	
	
}
