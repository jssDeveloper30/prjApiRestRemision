package com.JRE.biblioteca.entity;

import jakarta.persistence.*;

@Entity
@Table(name="remision")
public class Remision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fecha;
    private int nit;
    private String nombre_proveedor;
    private String direccion;
    private String correo;
    private int OM;
    private String referencia;
    private int cantidad;
    private String descripcion;

    public Remision() {
    }

    public Remision(Integer id, String fecha, int nit, String nombre_proveedor, String direccion, String correo, int OM, String referencia, int cantidad, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.nit = nit;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion = direccion;
        this.correo = correo;
        this.OM = OM;
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getOM() {
        return OM;
    }

    public void setOM(int OM) {
        this.OM = OM;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
