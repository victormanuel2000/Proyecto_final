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
public class Proveedor {
    private String cod_proveedor;
    private String cod_producto;
    private String nombre;
    private String rut;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String fax;
    private String email;
    private String formula;
    private String factor;

    public Proveedor(String cod_proveedor, String cod_producto, String nombre, String rut, String direccion, String ciudad, String telefono, String fax, String email, String formula, String factor) {
        this.cod_proveedor = cod_proveedor;
        this.cod_producto = cod_producto;
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.fax = fax;
        this.email = email;
        this.formula = formula;
        this.factor = factor;
    }

   


     
    

   
    

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getCod_proveedor() {
        return cod_proveedor;
    }

    public void setCod_proveedor(String cod_proveedor) {
        this.cod_proveedor = cod_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }
    
    
    
}
