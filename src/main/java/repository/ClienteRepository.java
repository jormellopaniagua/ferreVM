/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import model.Cliente;
import model.Productos;
import java.util.List;


/**
 *
 * @author MELLO
 */
public class ClienteRepository {
    
    
    public List<Cliente> getAll(){
        
        return clientes;
    }
    
    public Cliente getbyId(Integer id){
        
        return cliente;
    }
    
    public void insert(Cliente c){
        
    }
    
   public void actualizar(Cliente c){
       
       
   }
   public void eliminar(Cliente c){
       
   }
}