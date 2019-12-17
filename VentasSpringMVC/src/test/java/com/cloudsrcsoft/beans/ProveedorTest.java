/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.beans;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dayisboada
 */
public class ProveedorTest {
    
    public ProveedorTest() {
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
     * Test of getId_proveedor method, of class Proveedor.
     */
    @Test
    public void testGetId_proveedor() {
        System.out.println("getId_proveedor");
        Proveedor instance = new Proveedor();
        int expResult = 0;
        instance.setId_proveedor(0);
        int result = instance.getId_proveedor();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setId_proveedor method, of class Proveedor.
     */
    @Test
    public void testSetId_proveedor() {
        System.out.println("setId_proveedor");
        int id_proveedor = 0;
        Proveedor instance = new Proveedor();
        instance.setId_proveedor(id_proveedor);
        
    }

    /**
     * Test of getNombre method, of class Proveedor.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Proveedor instance = new Proveedor();
        String expResult = "";
        instance.setNombre("");
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class Proveedor.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Proveedor instance = new Proveedor();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getNit method, of class Proveedor.
     */
    @Test
    public void testGetNit() {
        System.out.println("getNit");
        Proveedor instance = new Proveedor();
        String expResult = "";
        instance.setNit("");
        String result = instance.getNit();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNit method, of class Proveedor.
     */
    @Test
    public void testSetNit() {
        System.out.println("setNit");
        String nit = "";
        Proveedor instance = new Proveedor();
        instance.setNit(nit);
        
    }

    /**
     * Test of getTelefono method, of class Proveedor.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Proveedor instance = new Proveedor();
        String expResult = "";
        instance.setTelefono("");
        String result = instance.getTelefono();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setTelefono method, of class Proveedor.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Proveedor instance = new Proveedor();
        instance.setTelefono(telefono);
       
    }

    /**
     * Test of getCorreo method, of class Proveedor.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Proveedor instance = new Proveedor();
        String expResult = "";
        instance.setCorreo("");
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCorreo method, of class Proveedor.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Proveedor instance = new Proveedor();
        instance.setCorreo(correo);
       
    }
    
}
