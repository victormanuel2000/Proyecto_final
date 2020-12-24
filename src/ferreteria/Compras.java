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
public class Compras {
    private String cod_compra;
    private String num_doc;
    private String cod_proveedor;
    private String cod_producto;
    private String nombre;
    private String modelo;
    private String unidades;
    private String precio_costo;
    private String subtotal;
    private String iva;
    private String Total;

    public Compras(String cod_compra, String num_doc, String cod_proveedor, String cod_producto, String nombre, String modelo, String unidades, String precio_costo, String subtotal, String iva, String Total) {
        this.cod_compra = cod_compra;
        this.num_doc = num_doc;
        this.cod_proveedor = cod_proveedor;
        this.cod_producto = cod_producto;
        this.nombre = nombre;
        this.modelo = modelo;
        this.unidades = unidades;
        this.precio_costo = precio_costo;
        this.subtotal = subtotal;
        this.iva = iva;
        this.Total = Total;
    }

    public String getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(String cod_compra) {
        this.cod_compra = cod_compra;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public String getCod_proveedor() {
        return cod_proveedor;
    }

    public void setCod_proveedor(String cod_proveedor) {
        this.cod_proveedor = cod_proveedor;
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
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    

}