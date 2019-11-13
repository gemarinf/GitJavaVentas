/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.beans;

import java.math.BigDecimal;

/**
 *
 * @author Andres
 */
public class Producto {

    private int pKPDTProducto;
    private String pDTNombre;
    private String pDTMarca;
    private BigDecimal pDTPrecio;
    private int pDTCantidad;
    private BigDecimal pDTPeso;
    private String pDTTamaño;

    public int getPKPDTProducto() {
        return pKPDTProducto;
    }

    public void setPKPDTProducto(int pKPDTProducto) {
        this.pKPDTProducto = pKPDTProducto;
    }

    public String getPDTNombre() {
        return pDTNombre;
    }

    public void setPDTNombre(String pDTNombre) {
        this.pDTNombre = pDTNombre;
    }

    public String getPDTMarca() {
        return pDTMarca;
    }

    public void setPDTMarca(String pDTMarca) {
        this.pDTMarca = pDTMarca;
    }

    public BigDecimal getPDTPrecio() {
        return pDTPrecio;
    }

    public void setPDTPrecio(BigDecimal pDTPrecio) {
        this.pDTPrecio = pDTPrecio;
    }

    public int getPDTCantidad() {
        return pDTCantidad;
    }

    public void setPDTCantidad(int pDTCantidad) {
        this.pDTCantidad = pDTCantidad;
    }

    public BigDecimal getPDTPeso() {
        return pDTPeso;
    }

    public void setPDTPeso(BigDecimal pDTPeso) {
        this.pDTPeso = pDTPeso;
    }

    public String getPDTTamaño() {
        return pDTTamaño;
    }

    public void setPDTTamaño(String pDTTamaño) {
        this.pDTTamaño = pDTTamaño;
    }
    
    

}
