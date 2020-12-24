/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria;

/**
 *
 * @author Victor
 */
public class Productos {
    private String cod_producto;
    private String nombre;
    private String modelo;
    private String unidades;
    private String precio_costo;
    private String precio_venta;
    private String total;
    private String stock;
    private String margen;

    public Productos(String cod_producto, String nombre, String modelo, String unidades, String precio_costo, String precio_venta, String total, String stock, String margen) {
        this.cod_producto = cod_producto;
        this.nombre = nombre;
        this.modelo = modelo;
        this.unidades = unidades;
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.total = total;
        this.stock = stock;
        this.margen = margen;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(String precio_costo) {
        this.precio_costo = precio_costo;
    }

    public String getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getMargen() {
        return margen;
    }

    public void setMargen(String margen) {
        this.margen = margen;
    }
    
    
    
    
}
