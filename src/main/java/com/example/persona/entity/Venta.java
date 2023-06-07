package com.example.persona.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Venta")
@Table(name="venta")
public class Venta {
	@Id
	String idcliente;
	String tipo_comprobante;
	String serie_comprobante;
	String num_comprobante;
	String fecha_hora;
	String impuesto;
	String total_venta;
	String estado;
	
	public Venta() {
		super();
	}
	public Venta(String idcliente, String tipo_comprobante, String serie_comprobante, String num_comprobante,
			String fecha_hora, String impuesto, String total_venta, String estado) {
		super();
		this.idcliente = idcliente;
		this.tipo_comprobante = tipo_comprobante;
		this.serie_comprobante = serie_comprobante;
		this.num_comprobante = num_comprobante;
		this.fecha_hora = fecha_hora;
		this.impuesto = impuesto;
		this.total_venta = total_venta;
		this.estado = estado;
	}
	public String getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}
	public String getTipo_comprobante() {
		return tipo_comprobante;
	}
	public void setTipo_comprobante(String tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
	}
	public String getSerie_comprobante() {
		return serie_comprobante;
	}
	public void setSerie_comprobante(String serie_comprobante) {
		this.serie_comprobante = serie_comprobante;
	}
	public String getNum_comprobante() {
		return num_comprobante;
	}
	public void setNum_comprobante(String num_comprobante) {
		this.num_comprobante = num_comprobante;
	}
	public String getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public String getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(String impuesto) {
		this.impuesto = impuesto;
	}
	public String getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(String total_venta) {
		this.total_venta = total_venta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
