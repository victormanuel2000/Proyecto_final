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
public class Pedidos {
     private int cod_pedido;
    private int unidades;
    private int precio;
    private int total;

    public int getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Pedidos(int cod_pedido, int unidades, int precio, int total) {
        this.cod_pedido = cod_pedido;
        this.unidades = unidades;
        this.precio = precio;
        this.total = total;
    }
    
}
