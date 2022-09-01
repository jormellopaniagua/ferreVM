/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import model.Factura;
import java.util.Date;
import java.util.List;


/**
 *
 * @author MELLO
 */
public class FacturaRepository {
    
     
    
    public List<Factura> getAll(){
        
        return facturas;
    }
    public Factura getbyId(Integer id){
        
        return factura;
    }
    public List<Factura> getbyFecha(Date date){
        
        return factura;
    }
    public void insert(Factura f){
        
    }
    public List<Factura> getbyMY(Integer mes, Integer anio){
        
        return factura;
    
    }  
}
