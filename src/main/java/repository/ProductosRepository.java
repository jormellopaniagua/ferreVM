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

public class ProductosRepository {
    
    
    
    
    public List<Productos> getAll(){
        
        return productos;
    }
    public Productos getbyId(Integer id){
        
        return producto;
    }
    public List<Productos> getbyTipo(String tipo){
        
        return producto;
    }
    public void insert(Productos p){
        
    }
    
   public void actualizar(Productos p){
       
       
   }
   public void eliminar(Productos p){
       
   }
}