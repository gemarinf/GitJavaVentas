/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tprolate file, choose Tools | Tprolates
 * and open the tprolate in the editor.
 */
package com.cloudsrcsoft.springmvc;

import com.cloudsrcsoft.beans.Producto;
import com.cloudsrcsoft.dao.ProductoDao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Andres
 */
@Controller
public class ProductoController {

    @Autowired
    ProductoDao dao;

    @RequestMapping("/new_producto")
    public ModelAndView showform() {
        return new ModelAndView("new_producto", "command", new Producto());
    }

    @RequestMapping(value = "/saveProducto", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("pro") Producto pro) {
        dao.save(pro);
        return new ModelAndView("redirect:/viewProductos");
    }

    @RequestMapping("/viewProductos")
    public ModelAndView viewpro() {
        List<Producto> list = dao.getProductos();
        return new ModelAndView("viewProductos", "list", list);
    }

    @RequestMapping(value = "/editpro/{pKPDTProducto}")
    public ModelAndView edit(@PathVariable int pKPDTProducto) {
        Producto pro = dao.getProducto(pKPDTProducto);
        return new ModelAndView("edit_producto", "command", pro);
    }

    @RequestMapping(value = "/editsavePro", method = RequestMethod.POST)
    public ModelAndView editsave(@ModelAttribute("pro") Producto pro) {
        dao.update(pro);
        return new ModelAndView("redirect:/viewProductos");
    }

    @RequestMapping(value = "/deletepro/{pKPDTProducto}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable int pKPDTProducto) {
        dao.delete(pKPDTProducto);
        return new ModelAndView("redirect:/viewProductos");
    }

}
