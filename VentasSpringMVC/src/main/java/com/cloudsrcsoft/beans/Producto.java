/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.beans;

import java.math.BigDecimal;

/**
 *
 * @author dayisboada
 */
public class Producto {
     private int pKPDTProducto;
    private String pDTNombre;
    private String pDTMarca;
    private BigDecimal pDTPrecio;
    private int pDTCantidad;
    private BigDecimal pDTPeso;
    private String pDTTamanio;
    private int fK_Proveedor;
    private String proveedor;

    public int getpKPDTProducto() {
        return pKPDTProducto;
    }

    public void setpKPDTProducto(int pKPDTProducto) {
        this.pKPDTProducto = pKPDTProducto;
    }

    public String getpDTNombre() {
        return pDTNombre;
    }

    public void setpDTNombre(String pDTNombre) {
        this.pDTNombre = pDTNombre;
    }

    public String getpDTMarca() {
        return pDTMarca;
    }

    public void setpDTMarca(String pDTMarca) {
        this.pDTMarca = pDTMarca;
    }

    public BigDecimal getpDTPrecio() {
        return pDTPrecio;
    }

    public void setpDTPrecio(BigDecimal pDTPrecio) {
        this.pDTPrecio = pDTPrecio;
    }

    public int getpDTCantidad() {
        return pDTCantidad;
    }

    public void setpDTCantidad(int pDTCantidad) {
        this.pDTCantidad = pDTCantidad;
    }

    public BigDecimal getpDTPeso() {
        return pDTPeso;
    }

    public void setpDTPeso(BigDecimal pDTPeso) {
        this.pDTPeso = pDTPeso;
    }

    public String getpDTTamanio() {
        return pDTTamanio;
    }

    public void setpDTTamanio(String pDTTamanio) {
        this.pDTTamanio = pDTTamanio;
    }

    public int getfK_Proveedor() {
        return fK_Proveedor;
    }

    public void setfK_Proveedor(int fK_Proveedor) {
        this.fK_Proveedor = fK_Proveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    
    
}
