/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import model.Cliente;
import model.Productos;
import repository.ClienteRepository;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MELLO
 */
public class ClienteControlador {
    ClienteRepository repository  = new ClienteRepository();
    
    public List<Cliente> getAll(){
        return repository.getAll();
    }
    public Cliente getById(Integer id){
        return repository.getbyId(id);
    }
    public void save(Cliente  c){
        try{
            
            repository.insert(c);
            JOptionPane.showMessageDialog(null,"Cliente registrado correctamente", "Correcto"
                    , JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
               JOptionPane.showMessageDialog(null,"Error al registrar el cliente", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
        
    }
    public void actualizar(Cliente c){
        try{
            repository.actualizar(c);
            JOptionPane.showMessageDialog(null,"Cliente actualizado correctamente", "Correcto"
                    , JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al actualizar el cliente", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
    }
    public void borrar(Cliente c){
        try {
            repository.eliminar(c);
            JOptionPane.showMessageDialog(null,"Cliente borrado correctamente", "Correcto"
                    , JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al borrar el Cliente", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
    }
}
