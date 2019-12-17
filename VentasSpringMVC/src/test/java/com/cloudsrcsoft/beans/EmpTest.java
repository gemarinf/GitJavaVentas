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
public class EmpTest {
    
    public EmpTest() {
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
     * Test of getId method, of class Emp.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Emp instance = new Emp();
        int expResult = 0;
        instance.setId(0);
        int result = instance.getId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setId method, of class Emp.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Emp instance = new Emp();
        instance.setId(id);
       
    }

    /**
     * Test of getNombres method, of class Emp.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Emp instance = new Emp();
        String expResult = "";
        instance.setNombres("");
        String result = instance.getNombres();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNombres method, of class Emp.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Emp instance = new Emp();
        instance.setNombres(nombres);
       
    }

    /**
     * Test of getApellido method, of class Emp.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Emp instance = new Emp();
        String expResult = "";
        instance.setApellido("");
             
        String result = instance.getApellido();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setApellido method, of class Emp.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Emp instance = new Emp();
        instance.setApellido(apellido);
      
    }

    /**
     * Test of getCorreo method, of class Emp.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Emp instance = new Emp();
        String expResult = "";
        instance.setCorreo("");
        String result = instance.getCorreo();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCorreo method, of class Emp.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Emp instance = new Emp();
        instance.setCorreo(correo);
       
    }

    /**
     * Test of getDireccion method, of class Emp.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Emp instance = new Emp();
        String expResult = "";
        instance.setDireccion("");
        String result = instance.getDireccion();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDireccion method, of class Emp.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Emp instance = new Emp();
        instance.setDireccion(direccion);
      
    }

    /**
     * Test of getTipodoc method, of class Emp.
     */
    @Test
    public void testGetTipodoc() {
        System.out.println("getTipodoc");
        Emp instance = new Emp();
        String expResult = "";
        instance.setTipodoc("");
        String result = instance.getTipodoc();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setTipodoc method, of class Emp.
     */
    @Test
    public void testSetTipodoc() {
        System.out.println("setTipodoc");
        String tipodoc = "";
        Emp instance = new Emp();
        instance.setTipodoc(tipodoc);
      
    }

    /**
     * Test of getDocumento method, of class Emp.
     */
    @Test
    public void testGetDocumento() {
        System.out.println("getDocumento");
        Emp instance = new Emp();
        String expResult = "";
        instance.setDocumento("");
        String result = instance.getDocumento();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDocumento method, of class Emp.
     */
    @Test
    public void testSetDocumento() {
        System.out.println("setDocumento");
        String documento = "";
        Emp instance = new Emp();
        instance.setDocumento(documento);
       
    }
    
}
