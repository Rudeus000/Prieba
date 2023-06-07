package com.example.persona.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Ingreso")
@Table(name = "ingreso")
public class Ingreso {
	@Id
	String idproveedor;
	String tipo_comprobante;
	String num_comprobante;
	String fecha_hora;
	String impuesto_decima;
	String estado_varchar;
	
	public Ingreso() {
		super();
	}
	public Ingreso(String idproveedor, String tipo_comprobante, String num_comprobante, String fecha_hora,
			String impuesto_decima, String estado_varchar) {
		super();
		this.idproveedor = idproveedor;
		this.tipo_comprobante = tipo_comprobante;
		this.num_comprobante = num_comprobante;
		this.fecha_hora = fecha_hora;
		this.impuesto_decima = impuesto_decima;
		this.estado_varchar = estado_varchar;
	}
	public String getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(String idproveedor) {
		this.idproveedor = idproveedor;
	}
	public String getTipo_comprobante() {
		return tipo_comprobante;
	}
	public void setTipo_comprobante(String tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
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
	public String getImpuesto_decima() {
		return impuesto_decima;
	}
	public void setImpuesto_decima(String impuesto_decima) {
		this.impuesto_decima = impuesto_decima;
	}
	public String getEstado_varchar() {
		return estado_varchar;
	}
	public void setEstado_varchar(String estado_varchar) {
		this.estado_varchar = estado_varchar;
	}
	

}
