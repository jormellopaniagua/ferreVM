/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MELLO
 */

public class DetallesFactura  {

    
    private Integer id;
    
    private Integer cantidad;
    
    private Double total;
    
    private Factura idFactura;
    
    private Productos codProducto;

    public DetallesFactura() {
    }

    public DetallesFactura(Integer id) {
        this.id = id;
    }

    public DetallesFactura(Integer id, Integer cantidad, Double total, Factura idFactura, Productos codProducto) {
        this.id = id;
        this.cantidad = cantidad;
        this.total = total;
        this.idFactura = idFactura;
        this.codProducto = codProducto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Factura getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Factura idFactura) {
        this.idFactura = idFactura;
    }

    public Productos getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Productos codProducto) {
        this.codProducto = codProducto;
    }

    
    
}

