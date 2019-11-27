/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.springmvc;

import com.cloudsrcsoft.beans.Emp;
import com.cloudsrcsoft.dao.EmpDao;
import com.cloudsrcsoft.dao.PedidoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.cloudsrcsoft.beans.Pedido;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author dayisboada
 */
@Controller
public class PedidoController {
    
    @Autowired
	EmpDao daoE;
    PedidoDao dao;
    
    @RequestMapping("/new_pedido")
	public ModelAndView showform() {
		return new ModelAndView("new_pedido", "command", new Pedido());
	}

    @RequestMapping(value = "/savePedido", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("pedido") Pedido pedido) {
		dao.savePedido(pedido);
		return new ModelAndView("redirect:/viewpedido");
	}
    @RequestMapping(value = "/editPedido/{id_pedido}")
	public ModelAndView edit(@PathVariable int id_pedido) {
		Pedido pedido = dao.getEmpByIdPedido(id_pedido);
		return new ModelAndView("edit_pedido", "command",pedido );
	}
        
        @RequestMapping(value = "/editsavePedido", method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("pedido") Pedido pedido) {
		dao.updatePedido(pedido);
		return new ModelAndView("redirect:/viewpedido");
                
	}
        @RequestMapping(value = "/deletePedido/{id_pedido}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id_pedido) {
		dao.deletePedido(id_pedido);
		return new ModelAndView("redirect:/viewpedido");
	}
@RequestMapping("/viewpedido")
	public ModelAndView viewemp() {
		List<Pedido> list = dao.getEmployees();
		return new ModelAndView("viewpedido", "list", list);
	}
        
}
