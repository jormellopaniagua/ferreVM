/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Empleados;
import java.util.List;
import model.DetallesFactura;

/**
 *
 * @author MELLO
 */
public class EmpleadosRepository {
    
    
    
    public List<Empleados> getAll(){
        List<Empleados> empleados= new ArrayList<Empleados>();
        conexion con = new conexion();
        Connection conect = con.conect;
        Statement stm;
        try {
            stm = conect.createStatement();
            ResultSet rs = stm.executeQuery("select * from empleados");
            while (rs.next()) {
                Empleados emp = new Empleados();
                emp.setIdCedula(rs.getInt(1));
                emp.setNombreEmpleado(rs.getString(2));
                emp.setCargo(rs.getString(3));
                emp.setFechaNacimiento(rs.getDate(4));
                emp.setDireccion(rs.getString(5));
                emp.setTelefono(rs.getString(6));
                emp.setContrasena(rs.getString(7));
                empleados.add(emp);
            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return empleados;
    }
     public Empleados getbyId(Integer id){
        Empleados empleado=new Empleados();
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("select * from empleados where id=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                empleado.setIdCedula(rs.getInt(1));
                empleado.setNombreEmpleado(rs.getString(2));
                empleado.setCargo(rs.getString(3));
                empleado.setFechaNacimiento(rs.getDate(4));
                empleado.setDireccion(rs.getString(5));
                empleado.setTelefono(rs.getString(6));
                empleado.setContrasena(rs.getString(7));

            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return empleado;
    }
    
    
    public void insert(Empleados e){
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("insert into empleados(id_cedula,nombreEmpleado,cargo,fechaNacimiento,direccion,telefono,contrasena)VALUES(?,?,?,?,?,?,?)");
            pst.setInt(1, e.getIdCedula());
            pst.setString(2, e.getNombreEmpleado());
            pst.setString(3, e.getCargo());
            pst.setDate(4, (Date) e.getFechaNacimiento());
            pst.setString(5, e.getDireccion());
            pst.setString(6, e.getTelefono());
            pst.setString(7, e.getContrasena());
            int raw= pst.executeUpdate();
            if (raw != 0) {
                System.out.println("ingreso correcto");


            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
    }
    
   public void actualizar(Empleados e){
       conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("update empleados set nombreEmpleado=?,cargo=?,fechaNacimiento=?,direccion=?,telefono=?,contrasena=? where id_cedula=?");
            
            
            pst.setString(1, e.getNombreEmpleado());
            pst.setString(2, e.getCargo());
            pst.setDate(3, (Date) e.getFechaNacimiento());
            pst.setString(4, e.getDireccion());
            pst.setString(5, e.getTelefono());
            pst.setString(6, e.getContrasena());
            pst.setInt(7, e.getIdCedula());
            int raw= pst.executeUpdate();
            if (raw != 0) {
                System.out.println("actualizacion correcta");


            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
       
   }
   public void eliminar(Empleados e){
       conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("delete from empleados where id_cedula=?");
            
            
            pst.setInt(1, e.getIdCedula());
            int raw= pst.executeUpdate();
            if (raw != 0) {
                System.out.println("borrado correcto");


            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
   }
   public Empleados loginEmpleado(String nombre, String password){
        Empleados empleado=new Empleados();
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("select * from empleados where nombreEmpleado=? and contrasena=?");
            pst.setString(1, nombre);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                empleado.setIdCedula(rs.getInt(1));
                empleado.setNombreEmpleado(rs.getString(2));
                empleado.setCargo(rs.getString(3));
                empleado.setFechaNacimiento(rs.getDate(4));
                empleado.setDireccion(rs.getString(5));
                empleado.setTelefono(rs.getString(6));
                empleado.setContrasena(rs.getString(7));

            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return empleado;
    }
    
}