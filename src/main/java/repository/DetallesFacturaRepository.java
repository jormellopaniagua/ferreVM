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
import model.DetallesFactura;
import model.Factura;
import java.util.Date;
import java.util.List;
import model.Cliente;
import model.Productos;


/**
 *
 * @author MELLO
 */
public class DetallesFacturaRepository {
    
    
    public List<DetallesFactura> getAll(){
        conexion con = new conexion();
        Connection conect = con.conect;
        List<DetallesFactura> dfacturas = new ArrayList<DetallesFactura>();
        Statement stm;
        try {
            stm = conect.createStatement();
            ResultSet rs = stm.executeQuery("select * from detalles_factura");
            while (rs.next()) {
                DetallesFactura dfactura = new DetallesFactura();
                dfactura.setId(rs.getInt(1));
                dfactura.setIdFactura((Factura) rs.getObject(2));
                dfactura.setCodProducto((Productos) rs.getObject(3));
                dfactura.setCantidad(rs.getInt(4));
                dfactura.setTotal(rs.getDouble(5));
              
                dfacturas.add(dfactura);
            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return dfacturas;
    }
    public DetallesFactura getbyId(Integer id){
        conexion con = new conexion();
        Connection conect = con.conect;
        DetallesFactura dfactura = new DetallesFactura();
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("select * from detalles_factura where id=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                dfactura.setId(rs.getInt(1));
                dfactura.setIdFactura((Factura) rs.getObject(2));
                dfactura.setCodProducto((Productos) rs.getObject(3));
                dfactura.setCantidad(rs.getInt(4));
                dfactura.setTotal(rs.getDouble(5));

            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return dfactura;
    }
    
    public void insert(DetallesFactura df){
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("insert into detalles_factura(id,id_factura,cod_producto,cantidad,total)VALUES(?,?,?,?,?)");
            pst.setInt(1, df.getId());
            pst.setInt(2, df.getIdFactura().getId());
            pst.setInt(3, df.getCodProducto().getCodigo());
            pst.setInt(4, df.getCantidad());
            pst.setDouble(5, df.getTotal());
            int raw= pst.executeUpdate();
            if (raw != 0) {
                System.out.println("ingreso correcto");


            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
    }
}
