/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author MELLO
 */
public class Factura {

    private Integer id;

    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    private Double totalFactura;

    private Integer ganancias;

    private Cliente idCliente;

    public Factura() {
    }

    public Factura(Integer id, Cliente idCliente, Date fecha, Double totalFactura, Integer ganancias) {
        this.id = id;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.totalFactura = totalFactura;
        this.ganancias = ganancias;
    }

    public Factura(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(Double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Integer getGanancias() {
        return ganancias;
    }

    public void setGanancias(Integer ganancias) {
        this.ganancias = ganancias;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

}
