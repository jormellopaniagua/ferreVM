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
public class TOFactura {
   private Integer id_codigo;
    private Integer cantidad;
    private double total;
    private double ganancia;

    public TOFactura(Integer id_codigo, Integer cantidad, double total, double ganancia) {
        this.id_codigo = id_codigo;
        this.cantidad = cantidad;
        this.total = total;
        this.ganancia = ganancia;
    }

    public Integer getId_codigo() {
        return id_codigo;
    }

    public void setId_codigo(Integer id_codigo) {
        this.id_codigo = id_codigo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
     
}
