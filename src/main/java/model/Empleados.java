/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author MELLO
 */

public class Empleados  {

    
    private Integer idCedula;
    
    private String nombreEmpleado;
    
    private String cargo;
    
    private Date fechaNacimiento;
    
    private String direccion;
    
    private String telefono;
    
    private String contrasena;

    public Empleados() {
    }

    public Empleados(Integer idCedula) {
        this.idCedula = idCedula;
    }

    public Integer getIdCedula() {
        return idCedula;
    }

    public void setIdCedula(Integer idCedula) {
        this.idCedula = idCedula;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}