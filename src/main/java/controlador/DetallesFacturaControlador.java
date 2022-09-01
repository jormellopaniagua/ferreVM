/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import model.DetallesFactura;
import model.Factura;
import repository.DetallesFacturaRepository;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MELLO
 */
public class DetallesFacturaControlador {
    DetallesFacturaRepository detallesrepo = new DetallesFacturaRepository();
    
    public List<DetallesFactura> getAll(){
        return detallesrepo.getAll();
    }
    public DetallesFactura getById(Integer id){
        return detallesrepo.getbyId(id);
    }
    
    public void save(DetallesFactura df){
        try{
            
            detallesrepo.insert(df);
            
        } catch(Exception e){
               
        }
        
    }
    
}
