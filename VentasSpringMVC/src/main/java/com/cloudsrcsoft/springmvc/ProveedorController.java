/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.springmvc;
import com.cloudsrcsoft.beans.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cloudsrcsoft.beans.Proveedor;
import com.cloudsrcsoft.dao.ProveedorDao;
import java.util.List;

/**
 *
 * @author dayisboada
 */
@Controller
public class ProveedorController {
    @Autowired
    ProveedorDao Pdao;
    
        @RequestMapping("/new_proveedor")
	public ModelAndView showform() {
		return new ModelAndView("new_proveedor", "command", new Proveedor());
	}
        
        @RequestMapping(value = "/saveProve", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("pro") Proveedor pro) {
		Pdao.save(pro);
		return new ModelAndView("redirect:/view_proveedor");
	}
        
        @RequestMapping("/view_proveedor")
	public ModelAndView viewemp() {
		List<Proveedor> list = Pdao.getProveedor();
		return new ModelAndView("view_proveedor", "list", list);
	}
        
        @RequestMapping(value = "/editproveedor/{id_proveedor}")
	public ModelAndView edit(@PathVariable int id_proveedor) {
		Proveedor emp = Pdao.getProveedorById(id_proveedor);
		return new ModelAndView("edit_proveedor", "command", emp);
	}
        
        @RequestMapping(value = "/editsaveProve", method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("pro") Proveedor pro) {
		Pdao.update(pro);
		return new ModelAndView("redirect:/view_proveedor");
	}
        
        @RequestMapping(value = "/deleteProvee/{id_proveedor}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id_proveedor) {
		Pdao.delete(id_proveedor);
		return new ModelAndView("redirect:/view_proveedor");
	}

}
