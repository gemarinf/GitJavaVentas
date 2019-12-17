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
public class PedidoTest {
    
    public PedidoTest() {
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
     * Test of getId_pedido method, of class Pedido.
     */
    @Test
    public void testGetId_pedido() {
        System.out.println("getId_pedido");
        Pedido instance = new Pedido();
        int expResult = 0;
        instance.setId_pedido(0);
        int result = instance.getId_pedido();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setId_pedido method, of class Pedido.
     */
    @Test
    public void testSetId_pedido() {
        System.out.println("setId_pedido");
        int id_pedido = 0;
        Pedido instance = new Pedido();
        instance.setId_pedido(id_pedido);
       
    }

    /**
     * Test of getId_producto method, of class Pedido.
     */
    @Test
    public void testGetId_producto() {
        System.out.println("getId_producto");
        Pedido instance = new Pedido();
        int expResult = 0;
        instance.setId_producto(0);
        int result = instance.getId_producto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_producto method, of class Pedido.
     */
    @Test
    public void testSetId_producto() {
        System.out.println("setId_producto");
        int id_producto = 0;
        Pedido instance = new Pedido();
        instance.setId_producto(id_producto);
       
    }

    /**
     * Test of getCantidad method, of class Pedido.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Pedido instance = new Pedido();
        int expResult = 0;
        instance.setCantidad(0);
        int result = instance.getCantidad();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCantidad method, of class Pedido.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Pedido instance = new Pedido();
        instance.setCantidad(cantidad);
        
    }

    /**
     * Test of getPrecio_total method, of class Pedido.
     */
    @Test
    public void testGetPrecio_total() {
        System.out.println("getPrecio_total");
        Pedido instance = new Pedido();
        BigDecimal bg = new BigDecimal(0);
        BigDecimal expResult = bg;
        instance.setPrecio_total(bg);
        BigDecimal result = instance.getPrecio_total();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPrecio_total method, of class Pedido.
     */
    @Test
    public void testSetPrecio_total() {
        System.out.println("setPrecio_total");
        BigDecimal precio_total = null;
        Pedido instance = new Pedido();
        instance.setPrecio_total(precio_total);
       
    }

    /**
     * Test of getId_empleado method, of class Pedido.
     */
    @Test
    public void testGetId_empleado() {
        System.out.println("getId_empleado");
        Pedido instance = new Pedido();
        int expResult = 0;
        instance.setId_empleado(0);
        int result = instance.getId_empleado();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setId_empleado method, of class Pedido.
     */
    @Test
    public void testSetId_empleado() {
        System.out.println("setId_empleado");
        int id_empleado = 0;
        Pedido instance = new Pedido();
        instance.setId_empleado(id_empleado);
       
    }

    /**
     * Test of getEstado method, of class Pedido.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Pedido instance = new Pedido();
        String expResult = "";
        instance.setEstado("");
        String result = instance.getEstado();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setEstado method, of class Pedido.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Pedido instance = new Pedido();
        instance.setEstado(estado);
        
    }

    /**
     * Test of getProducto method, of class Pedido.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        Pedido instance = new Pedido();
        String expResult = "";
        instance.setProducto("");
        String result = instance.getProducto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setProducto method, of class Pedido.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        String producto = "";
        Pedido instance = new Pedido();
        instance.setProducto(producto);
        
    }

    /**
     * Test of getEmpleado method, of class Pedido.
     */
    @Test
    public void testGetEmpleado() {
        System.out.println("getEmpleado");
        Pedido instance = new Pedido();
        String expResult = "";
        instance.setEmpleado("");
        String result = instance.getEmpleado();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setEmpleado method, of class Pedido.
     */
    @Test
    public void testSetEmpleado() {
        System.out.println("setEmpleado");
        String empleado = "";
        Pedido instance = new Pedido();
        instance.setEmpleado(empleado);
       
    }
    
}
