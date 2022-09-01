/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import model.DetallesFactura;
import model.Factura;
import model.Productos;
import model.TOFactura;
import repository.FacturaRepository;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MELLO
 */
public class FacturaControlador {
    FacturaRepository facturarepository = new FacturaRepository();
    ProductosControlador productosctrl = new ProductosControlador();
    DetallesFacturaControlador detallesctrl = new DetallesFacturaControlador();
    public List<Factura> getAll(){
        return facturarepository.getAll();
    }
    public Factura getById(Integer id){
        return facturarepository.getbyId(id);
    }
    public List<Factura> getByFecha(Date date){
        return facturarepository.getbyFecha(date);
    }
    public void save(Factura  f,List<TOFactura> list){
        try{
            
            facturarepository.insert(f);
            List<Factura> facturas= facturarepository.getAll();
            Factura factura = facturas.get(facturas.size()-1);
            
            for(TOFactura tof:list){
                Productos producto = productosctrl.getById(tof.getId_codigo());
                Integer unidades = producto.getExistencia()-tof.getCantidad();
                producto.setExistencia(unidades);
                productosctrl.actualizar(producto);
                DetallesFactura dtlFactura = new DetallesFactura(null,tof.getCantidad(),tof.getTotal(),factura,producto);
                detallesctrl.save(dtlFactura);
                
            }
            
            
            JOptionPane.showMessageDialog(null,"Factura registrada correctamente", "Correcto"
                    , JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
               JOptionPane.showMessageDialog(null,"Error al registrar el Factura", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
        
    }
    public List<Factura> getByMY(int i, int e){
        
        return facturarepository.getbyMY(i, e);
    }
    
}
