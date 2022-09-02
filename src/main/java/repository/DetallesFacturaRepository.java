/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
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
        List<DetallesFactura> dfacturas= new ArrayList<DetallesFactura>();
        return dfacturas;
    }
    public DetallesFactura getbyId(Integer id){
        DetallesFactura dfactura=new DetallesFactura();
        return dfactura;
    }
    
    public void insert(DetallesFactura df){
        
    }
}
