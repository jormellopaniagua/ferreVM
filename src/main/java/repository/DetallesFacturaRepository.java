/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import model.DetallesFactura;
import model.Factura;
import java.util.Date;
import java.util.List;


/**
 *
 * @author MELLO
 */
public class DetallesFacturaRepository {
    
    
    public List<DetallesFactura> getAll(){
        
        return dfacturas;
    }
    public DetallesFactura getbyId(Integer id){
        
        return dfactura;
    }
    
    public void insert(DetallesFactura df){
        
    }
}
