/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import model.Factura;
import java.util.Date;
import java.util.List;
import model.DetallesFactura;


/**
 *
 * @author MELLO
 */
public class FacturaRepository {
    
     
    
    public List<Factura> getAll(){
        List<Factura> facturas= new ArrayList<Factura>();
        return facturas;
    }
    public Factura getbyId(Integer id){
        Factura factura=new Factura();
        return factura;
    }
    public List<Factura> getbyFecha(Date date){
        List<Factura> facturas= new ArrayList<Factura>();
        return facturas;
    }
    public void insert(Factura f){
        
    }
    public List<Factura> getbyMY(Integer mes, Integer anio){
        List<Factura> facturas= new ArrayList<Factura>();
        return facturas;
    
    }  
}
