/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import model.Empleados;
import model.Productos;
import java.util.List;

/**
 *
 * @author MELLO
 */
public class EmpleadosRepository {
    
    
    
    public List<Empleados> getAll(){
        
        return empleados;
    }
     public Empleados getbyId(Integer id){
        
        return empleado;
    }
    public Empleados loginEmpleado(String nombre, String password){
        
        return empleado;
    }
    
    public void insert(Empleados e){
        
    }
    
   public void actualizar(Empleados e){
       
       
   }
   public void eliminar(Empleados e){
       
   }
    
}