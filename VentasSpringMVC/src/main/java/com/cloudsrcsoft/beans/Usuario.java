/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.beans;

/**
 *
 * @author Andres
 */
public class Usuario {

    private int pKUsuario;
    private String uSUUsuario;
    private String uSUPassword;
    private int fKPersona;
    private String uSUTipo;

    public int getPKUsuario() {
        return pKUsuario;
    }

    public void setPKUsuario(int pKUsuario) {
        this.pKUsuario = pKUsuario;
    }

    public String getUSUUsuario() {
        return uSUUsuario;
    }

    public void setUSUUsuario(String uSUUsuario) {
        this.uSUUsuario = uSUUsuario;
    }

    public String getUSUPassword() {
        return uSUPassword;
    }

    public void setUSUPassword(String uSUPassword) {
        this.uSUPassword = uSUPassword;
    }

    public int getFKPersona() {
        return fKPersona;
    }

    public void setFKPersona(int fKPersona) {
        this.fKPersona = fKPersona;
    }

    public String getUSUTipo() {
        return uSUTipo;
    }

    public void setUSUTipo(String uSUTipo) {
        this.uSUTipo = uSUTipo;
    }

}
