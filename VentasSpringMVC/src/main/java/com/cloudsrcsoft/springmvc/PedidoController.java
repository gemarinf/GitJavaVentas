/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.cloudsrcsoft.beans.Pedido;
import com.cloudsrcsoft.dao.PedidoDao;
import com.cloudsrcsoft.dao.EmpDao;
import java.util.List;

/**
 *
 * @author dayisboada
 */
@Controller
public class PedidoController {
   
    @Autowired
    PedidoDao Pedao;
   
    
    @RequestMapping("/new_pedido")
	public ModelAndView showform() {
		ModelAndView mv = new ModelAndView();
                
                mv.addObject("command", new Pedido());
                mv.addObject("pro", Pedao.getpro());
                mv.addObject("list", Pedao.getper());
                
                mv.setViewName("new_pedido");
                return mv;
	}
        
        @RequestMapping(value = "/savePedido", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("pe") Pedido pe) {
		Pedao.savePedido(pe);
		return new ModelAndView("redirect:/viewemp");
	}
    
        @RequestMapping("/view_pedido")
	public ModelAndView viewpedido() {
		List<Pedido> list = Pedao.getPedido();
		return new ModelAndView("view_pedido", "list", list);
	}
        
        @RequestMapping(value = "/deletepedido/{id_pedido}", method = RequestMethod.GET)
	public ModelAndView deletePedido(@PathVariable int id_pedido) {
		Pedao.delete(id_pedido);
		return new ModelAndView("redirect:/view_pedido");
	}
        @RequestMapping(value = "/editpedido/{id_pedido}")
	public ModelAndView edit(@PathVariable int id_pedido) {
            
		Pedido emp = Pedao.getPedById(id_pedido);
                ModelAndView mv = new ModelAndView();
                mv.addObject("pro", Pedao.getpro());
                mv.addObject("list", Pedao.getper());
                mv.addObject("command", emp);     
                mv.setViewName("edit_Pedido");
                return mv;
	}
        
        @RequestMapping(value = "/editsavePe", method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("pe") Pedido pe) {
		Pedao.update(pe);
		return new ModelAndView("redirect:/view_pedido");
	}
        
        
}
