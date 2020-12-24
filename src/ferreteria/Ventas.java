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
public class Ventas {
    private String cod_venta;
    private String cod_producto;
    private String uunidades;
    private String precio_venta;
    private String subtotal;
    private String iva;
    private String total;

    public Ventas(String cod_venta, String cod_producto, String uunidades, String precio_venta, String subtotal, String iva, String total) {
        this.cod_venta = cod_venta;
        this.cod_producto = cod_producto;
        this.uunidades = uunidades;
        this.precio_venta = precio_venta;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    public String getCod_venta() {
        return cod_venta;
    }

    public void setCod_venta(String cod_venta) {
        this.cod_venta = cod_venta;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getUunidades() {
        return uunidades;
    }

    public void setUunidades(String uunidades) {
        this.uunidades = uunidades;
    }

    public String getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
}
