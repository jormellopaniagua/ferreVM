/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import model.Cliente;
import model.Productos;
import java.util.List;
import model.DetallesFactura;

/**
 *
 * @author MELLO
 */

public class ProductosRepository {
    
    
    
    
    public List<Productos> getAll(){
        List<Productos> productos= new ArrayList<Productos>();
        return productos;
    }
    public Productos getbyId(Integer id){
        Productos producto= new Productos();
        return producto;
    }
    public List<Productos> getbyTipo(String tipo){
        List<Productos> producto= new ArrayList<Productos>();
        return producto;
    }
    public void insert(Productos p){
        
    }
    
   public void actualizar(Productos p){
       
       
   }
   public void eliminar(Productos p){
       
   }
}