
package controlador;

import model.Cliente;
import model.Empleados;
import repository.EmpleadosRepository;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author MELLO
 */

public class EmpleadosControlador {

    EmpleadosRepository empleadosrepository = new EmpleadosRepository();
    public List<Empleados> getAll(){
        return empleadosrepository.getAll();
    }
    public Empleados getLogin(String nombreEmpleado, String contrasena){
        return empleadosrepository.loginEmpleado(nombreEmpleado,contrasena);
    }
    public Empleados getById(Integer id){
        return empleadosrepository.getbyId(id);
    }
    public void save(Empleados e){
        try{
            
            empleadosrepository.insert(e);
            JOptionPane.showMessageDialog(null,"Empleado registrado correctamente", "Correcto"
                    , JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception x){
               JOptionPane.showMessageDialog(null,"Error al registrar el empleado", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
        
    }
    public void actualizar(Empleados e){
        try{
            empleadosrepository.actualizar(e);
            JOptionPane.showMessageDialog(null,"Empleado actualizado correctamente", "Correcto"
                    , JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null,"Error al actualizar el empleado", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
    }
    public void borrar(Empleados e){
        try {
            empleadosrepository.eliminar(e);
            JOptionPane.showMessageDialog(null,"Empleado borrado correctamente", "Correcto"
                    , JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null,"Error al borrar el empleado", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
    }
}
