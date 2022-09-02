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
import model.Cliente;
import model.Productos;
import java.util.List;
import model.DetallesFactura;

/**
 *
 * @author MELLO
 */
public class ProductosRepository {

    public List<Productos> getAll() {
        List<Productos> productos = new ArrayList<Productos>();
        conexion con = new conexion();
        Connection conect = con.conect;
        Statement stm;
        try {
            stm = conect.createStatement();
            ResultSet rs = stm.executeQuery("select * from productos");
            while (rs.next()) {
                Productos prod = new Productos();
                prod.setCodigo(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setMedida(rs.getString(3));
                prod.setTipo(rs.getString(4));
                prod.setExistencia(rs.getInt(5));
                prod.setUnidad(rs.getString(6));
                prod.setPrecioVenta(rs.getDouble(7));
                prod.setPrecioCompra(rs.getDouble(8));
                productos.add(prod);
            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return productos;
    }

    public Productos getbyId(Integer id) {
        Productos producto = new Productos();
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("select * from productos where codigo=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                producto.setCodigo(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setMedida(rs.getString(3));
                producto.setTipo(rs.getString(4));
                producto.setExistencia(rs.getInt(5));
                producto.setUnidad(rs.getString(6));
                producto.setPrecioVenta(rs.getDouble(7));
                producto.setPrecioCompra(rs.getDouble(8));

            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return producto;
    }

    public List<Productos> getbyTipo(String tipo) {
        List<Productos> producto = new ArrayList<Productos>();
        conexion con = new conexion();
        Connection conect = con.conect;
        Statement stm;
        try {
            stm = conect.createStatement();
            ResultSet rs = stm.executeQuery("select * from productos where tipo=?");
            while (rs.next()) {
                Productos prod = new Productos();
                prod.setCodigo(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setMedida(rs.getString(3));
                prod.setTipo(rs.getString(4));
                prod.setExistencia(rs.getInt(5));
                prod.setUnidad(rs.getString(6));
                prod.setPrecioVenta(rs.getDouble(7));
                prod.setPrecioCompra(rs.getDouble(8));
                producto.add(prod);
            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return producto;
    }

    public void insert(Productos p) {
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("insert into productos(nombre,medida,tipo,existencia,unidad,precio_venta,precio_compra)VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, p.getNombre());
            pst.setString(2, p.getMedida());
            pst.setString(3, p.getTipo());
            pst.setInt(4, p.getExistencia());
            pst.setString(5, p.getUnidad());
            pst.setDouble(6, p.getPrecioVenta());
            pst.setDouble(7, p.getPrecioCompra());
            int raw = pst.executeUpdate();
            if (raw != 0) {
                System.out.println("ingreso correcto");

            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
    }

    public void actualizar(Productos p) {
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("update productos set nombre=?,medida=?,tipo=?,existencia=?,unidad=?,precio_venta=?,precio_compra=? where codigo=?");
            
            pst.setString(1, p.getNombre());
            pst.setString(2, p.getMedida());
            pst.setString(3, p.getTipo());
            pst.setInt(4, p.getExistencia());
            pst.setString(5, p.getUnidad());
            pst.setDouble(6, p.getPrecioVenta());
            pst.setDouble(7, p.getPrecioCompra());
            
            int raw= pst.executeUpdate();
            if (raw != 0) {
                System.out.println("actualizacion correcta");


            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
    }

    public void eliminar(Productos p) {
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("delete from productos where codigo=?");
            
            
            pst.setInt(1, p.getCodigo());
            int raw= pst.executeUpdate();
            if (raw != 0) {
                System.out.println("borrado correcto");


            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
    }
}
