package com.proyecto.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tb_solicitud_evento")
public class SolicitudEventoDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_soli_evento")
	private Integer codSolicitud;
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_realizado")
	private Date fecha;
	@Column(name="nro_invitados")
	private Integer numeroDeInvitado;
	@Column(name="lugar_realizacion")
	private String lugarDeRealizacion;
	@Temporal(TemporalType.TIME)
	@Column(name="hora_inicio")
	private String horaInicio;
	@Temporal(TemporalType.TIME)
	@Column(name="hora_fin")
	private String horaFin;
	
	//bi-direccional
	//rel estado
	@ManyToOne
	@JoinColumn(name="cod_estado")
	private EstadoDTO codEstado; //asoc
	
	//rel documento
	@ManyToOne
	@JoinColumn(name="cod_documento")
	private DocumentoDTO codDocumento;
	
	//rel cliente
	@ManyToOne
	@JoinColumn(name="cod_cliente")
	private ClienteDTO codCliente;
	
	
	
	


	public ClienteDTO getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(ClienteDTO codCliente) {
		this.codCliente = codCliente;
	}

	public Integer getCodSolicitud() {
		return codSolicitud;
	}

	public void setCodSolicitud(Integer codSolicitud) {
		this.codSolicitud = codSolicitud;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getNumeroDeInvitado() {
		return numeroDeInvitado;
	}

	public void setNumeroDeInvitado(Integer numeroDeInvitado) {
		this.numeroDeInvitado = numeroDeInvitado;
	}

	public String getLugarDeRealizacion() {
		return lugarDeRealizacion;
	}

	public void setLugarDeRealizacion(String lugarDeRealizacion) {
		this.lugarDeRealizacion = lugarDeRealizacion;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public EstadoDTO getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(EstadoDTO codEstado) {
		this.codEstado = codEstado;
	}

	public DocumentoDTO getCodDocumento() {
		return codDocumento;
	}

	public void setCodDocumento(DocumentoDTO codDocumento) {
		this.codDocumento = codDocumento;
	}
	

	
	


}
