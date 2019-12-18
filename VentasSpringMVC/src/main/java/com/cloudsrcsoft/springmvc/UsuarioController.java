/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.springmvc;

import com.cloudsrcsoft.beans.Usuario;
import com.cloudsrcsoft.dao.UsuarioDao;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Andres
 */
@Controller
@SessionAttributes("user")
public class UsuarioController {

    @Autowired
    UsuarioDao dao;

    private Usuario usuario;

    @ModelAttribute("user")
    public Usuario setUpUserForm() {
        return new Usuario();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("user") Usuario user) {
        user = dao.login(user.getUSUUsuario(), user.getUSUPassword());
        usuario = user;
        if (user.getUSUUsuario().equals("Incorrecto")) {
           return new ModelAndView("index", "command", user).addObject("message", "Login Incorrecto");
        } else {
//        request.getSession().setAttribute("user", user);
            return new ModelAndView("index", "command", user);
        }
    }

    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public ModelAndView newUser(@ModelAttribute("userr") Usuario userr) {
        dao.save(userr);
        return new ModelAndView("index", "command", usuario);
    }

}
