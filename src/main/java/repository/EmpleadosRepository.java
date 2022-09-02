/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import model.Empleados;
import model.Productos;
import java.util.List;
import model.DetallesFactura;

/**
 *
 * @author MELLO
 */
public class EmpleadosRepository {
    
    
    
    public List<Empleados> getAll(){
        List<Empleados> empleados= new ArrayList<Empleados>();
        return empleados;
    }
     public Empleados getbyId(Integer id){
        Empleados empleado=new Empleados();
        return empleado;
    }
    public Empleados loginEmpleado(String nombre, String password){
        Empleados empleado=new Empleados();
        return empleado;
    }
    
    public void insert(Empleados e){
        
    }
    
   public void actualizar(Empleados e){
       
       
   }
   public void eliminar(Empleados e){
       
   }
    
}