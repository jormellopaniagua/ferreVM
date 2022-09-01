
package controlador;

import model.Productos;
import repository.ProductosRepository;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MELLO
 */
public class ProductosControlador {
    ProductosRepository productosrepo = new ProductosRepository();
    
    public List<Productos> getAll(){
        return productosrepo.getAll();
    }
    public Productos getById(Integer id){
        return productosrepo.getbyId(id);
    }
    public List<Productos> getByTipo(String tipo){
        return productosrepo.getbyTipo(tipo);
    }
    public void save(Productos  p){
        try{
            
            productosrepo.insert(p);
            JOptionPane.showMessageDialog(null,"Producto registrado correctamente", "Correcto"
                    , JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
               JOptionPane.showMessageDialog(null,"Error al registrar el producto", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
        
    }
    public void actualizar(Productos p){
        try{
            
            
            productosrepo.actualizar(p);
            JOptionPane.showMessageDialog(null,"Producto actualizado correctamente", "Correcto"
                    , JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al actualizar el producto", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
    }
    public void borrar(Productos p){
        try {
            productosrepo.eliminar(p);
            JOptionPane.showMessageDialog(null,"Producto borrado correctamente", "Correcto"
                    , JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al borrar el producto", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
    }
    
}
