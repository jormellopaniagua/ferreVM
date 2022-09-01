/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MELLO
 */
public class conexion {

    Connection conect;
//"jdbc:mysql://localhost:3306/sisproferre"
    public conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conect=DriverManager.getConnection("jdbc:mysql://localhost:3306/sisproferre", "root", "omar2014");
            System.out.println("conexion establecida");
        } catch (Exception e) {
            System.out.println("conexion fallida"+e);
        }
    }
}
