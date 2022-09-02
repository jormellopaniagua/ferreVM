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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MELLO
 */
public class ClienteRepository {

    public List<Cliente> getAll() {
        conexion con = new conexion();
        Connection conect = con.conect;
        List<Cliente> clientes = new ArrayList<Cliente>();
        Statement stm;
        try {
            stm = conect.createStatement();
            ResultSet rs = stm.executeQuery("select * from cliente");
            while (rs.next()) {
                Cliente client = new Cliente();
                client.setId(rs.getInt(1));
                client.setTipoId(rs.getString(2));
                client.setNombreCliente(rs.getString(3));
                client.setDireccion(rs.getString(4));
                client.setTelefono(rs.getString(5));
                clientes.add(client);
            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }

        return clientes;
    }

    public Cliente getbyId(Integer id) {
        conexion con = new conexion();
        Connection conect = con.conect;
        Cliente cliente = new Cliente();
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("select * from cliente where id=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                cliente.setId(rs.getInt(1));
                cliente.setTipoId(rs.getString(2));
                cliente.setNombreCliente(rs.getString(3));
                cliente.setDireccion(rs.getString(4));
                cliente.setTelefono(rs.getString(5));

            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
        return cliente;
    }

    public void insert(Cliente c) {
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("insert into cliente(id,tipo_id,nombre_cliente,direccion,telefono)VALUES(?,?,?,?,?)");
            pst.setInt(1, c.getId());
            pst.setString(2, c.getTipoId());
            pst.setString(3, c.getNombreCliente());
            pst.setString(4, c.getDireccion());
            pst.setString(5, c.getTelefono());
            int raw= pst.executeUpdate();
            if (raw != 0) {
                System.out.println("ingreso correcto");


            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
    }

    public void actualizar(Cliente c) {
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("update cliente set tipo_id=?,nombre_cliente=?,direccion=?,telefono=? where id=?");
            
            pst.setString(1, c.getTipoId());
            pst.setString(2, c.getNombreCliente());
            pst.setString(3, c.getDireccion());
            pst.setString(4, c.getTelefono());
            pst.setInt(5, c.getId());
            int raw= pst.executeUpdate();
            if (raw != 0) {
                System.out.println("actualizacion correcta");


            }
            conect.close();
        } catch (SQLException ex) {
            System.out.println("EX" + ex);
        }
    }

    public void eliminar(Cliente c) {
        conexion con = new conexion();
        Connection conect = con.conect;
        PreparedStatement pst;
        try {
            pst = conect.prepareStatement("delete from cliente where id=?");
            
            
            pst.setInt(1, c.getId());
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
