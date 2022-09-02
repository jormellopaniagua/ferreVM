/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Factura;
import java.util.Date;
import java.util.List;
import model.Cliente;
import model.DetallesFactura;
import model.Productos;


/**
 *
 * @author MELLO
 */
public class FacturaRepository {
    
     
    
    public List<Factura> getAll(){
        conexion con = new conexion();
        Connection conect = con.conect;
        List<Factura> facturas = new ArrayList<Factura>();
        Statement stm;
        try {
            stm = conect.createStatement();
            ResultSet rs = stm.executeQuery("select * from factura");
            while (rs.next()) {
                Factura factura = new Factura();
                factura.setId(rs.getInt(1));
                factura.setIdCliente((Cliente) rs.getObject(2));
                factura.setFecha(rs.getDate(3));
                factura.setTotalFactura(rs.getDouble(4));
                factura.setGanancias(rs.getInt(5));
              
                facturas.add(factura);
            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return facturas;
    }
    public Factura getbyId(Integer id){
        conexion con = new conexion();
        Connection conect = con.conect;
        Factura factura=new Factura();
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("select * from factura where id=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                factura.setId(rs.getInt(1));
                factura.setIdCliente((Cliente) rs.getObject(2));
                factura.setFecha(rs.getDate(3));
                factura.setTotalFactura(rs.getDouble(4));
                factura.setGanancias(rs.getInt(5));

            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return factura;
    }
    public List<Factura> getbyFecha(Date date){
        conexion con = new conexion();
        Connection conect = con.conect;
        List<Factura> facturas = new ArrayList<Factura>();
         PreparedStatement pst;
        try {
            pst = conect.prepareStatement("select * from factura where fecha=?");
            pst.setDate(1, (java.sql.Date) date);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                
                Factura factura = new Factura();
                factura.setId(rs.getInt(1));
                factura.setIdCliente((Cliente) rs.getObject(2));
                factura.setFecha(rs.getDate(3));
                factura.setTotalFactura(rs.getDouble(4));
                factura.setGanancias(rs.getInt(5));
              
                facturas.add(factura);
            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return facturas;
    }
    public void insert(Factura f){
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("insert into facturas(id,id_cliente,fecha,total_factura,ganancias)VALUES(?,?,?,?,?)");
            pst.setInt(1, f.getId());
            pst.setInt(2, f.getIdCliente().getId());
            pst.setDate(3, (java.sql.Date) f.getFecha());
            pst.setDouble(4, f.getTotalFactura());
            pst.setInt(5, f.getGanancias());
            int raw= pst.executeUpdate();
            if (raw != 0) {
                System.out.println("ingreso correcto");


            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
    }
    public List<Factura> getbyMY(Integer mes, Integer anio){
        conexion con = new conexion();
        Connection conect = con.conect;
        List<Factura> facturas= new ArrayList<Factura>();
         PreparedStatement pst;
        try {
            pst = conect.prepareStatement("select * from factura where MONTH(fecha)=? AND YEAR(fecha)=?");
            pst.setInt(1, mes);
            pst.setInt(2, anio);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                
                Factura factura = new Factura();
                factura.setId(rs.getInt(1));
                factura.setIdCliente((Cliente) rs.getObject(2));
                factura.setFecha(rs.getDate(3));
                factura.setTotalFactura(rs.getDouble(4));
                factura.setGanancias(rs.getInt(5));
              
                facturas.add(factura);
            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        
        return facturas;
    
    }  
}
