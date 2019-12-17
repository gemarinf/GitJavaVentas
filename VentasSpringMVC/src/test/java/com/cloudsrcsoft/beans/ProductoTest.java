/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.beans;

import java.math.BigDecimal;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dayisboada
 */
public class ProductoTest {
    
    public ProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getPKPDTProducto method, of class Producto.
     */
    @Test
    public void testGetPKPDTProducto() {
        System.out.println("getPKPDTProducto");
        Producto instance = new Producto();
        int expResult = 0;
        instance.setPKPDTProducto(0);
        int result = instance.getPKPDTProducto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPKPDTProducto method, of class Producto.
     */
    @Test
    public void testSetPKPDTProducto() {
        System.out.println("setPKPDTProducto");
        int pKPDTProducto = 0;
        Producto instance = new Producto();
        instance.setPKPDTProducto(pKPDTProducto);
       
    }

    /**
     * Test of getPDTNombre method, of class Producto.
     */
    @Test
    public void testGetPDTNombre() {
        System.out.println("getPDTNombre");
        Producto instance = new Producto();
        String expResult = "";
        instance.setPDTNombre("");
        String result = instance.getPDTNombre();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPDTNombre method, of class Producto.
     */
    @Test
    public void testSetPDTNombre() {
        System.out.println("setPDTNombre");
        String pDTNombre = "";
        Producto instance = new Producto();
        instance.setPDTNombre(pDTNombre);
        
    }

    /**
     * Test of getPDTMarca method, of class Producto.
     */
    @Test
    public void testGetPDTMarca() {
        System.out.println("getPDTMarca");
        Producto instance = new Producto();
        String expResult = "";
        instance.setPDTMarca("");
        String result = instance.getPDTMarca();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPDTMarca method, of class Producto.
     */
    @Test
    public void testSetPDTMarca() {
        System.out.println("setPDTMarca");
        String pDTMarca = "";
        Producto instance = new Producto();
        instance.setPDTMarca(pDTMarca);
       
    }

    /**
     * Test of getPDTPrecio method, of class Producto.
     */
    @Test
    public void testGetPDTPrecio() {
        System.out.println("getPDTPrecio");
        Producto instance = new Producto();
        BigDecimal bg = new BigDecimal(0);
        BigDecimal expResult = bg;
        instance.setPDTPrecio(bg);
        BigDecimal result = instance.getPDTPrecio();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPDTPrecio method, of class Producto.
     */
    @Test
    public void testSetPDTPrecio() {
        System.out.println("setPDTPrecio");
        BigDecimal pDTPrecio = null;
        Producto instance = new Producto();
        instance.setPDTPrecio(pDTPrecio);
       
    }

    /**
     * Test of getPDTCantidad method, of class Producto.
     */
    @Test
    public void testGetPDTCantidad() {
        System.out.println("getPDTCantidad");
        Producto instance = new Producto();
        int expResult = 0;
        instance.setPDTCantidad(0);
        int result = instance.getPDTCantidad();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPDTCantidad method, of class Producto.
     */
    @Test
    public void testSetPDTCantidad() {
        System.out.println("setPDTCantidad");
        int pDTCantidad = 0;
        Producto instance = new Producto();
        instance.setPDTCantidad(pDTCantidad);
       
    }

    /**
     * Test of getPDTPeso method, of class Producto.
     */
    @Test
    public void testGetPDTPeso() {
        System.out.println("getPDTPeso");
        Producto instance = new Producto();
        BigDecimal bg = new BigDecimal(0);
        BigDecimal expResult = bg;
        instance.setPDTPeso(bg);
        BigDecimal result = instance.getPDTPeso();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPDTPeso method, of class Producto.
     */
    @Test
    public void testSetPDTPeso() {
        System.out.println("setPDTPeso");
        BigDecimal pDTPeso = null;
        Producto instance = new Producto();
        instance.setPDTPeso(pDTPeso);
        
    }

    /**
     * Test of getPDTTamanio method, of class Producto.
     */
    @Test
    public void testGetPDTTamanio() {
        System.out.println("getPDTTamanio");
        Producto instance = new Producto();
        String expResult = "";
        instance.setPDTTamanio("");
        String result = instance.getPDTTamanio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPDTTamanio method, of class Producto.
     */
    @Test
    public void testSetPDTTamanio() {
        System.out.println("setPDTTamanio");
        String pDTTamanio = "";
        Producto instance = new Producto();
        instance.setPDTTamanio(pDTTamanio);
       
    }
    
}
