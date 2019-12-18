/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.dao;

import com.cloudsrcsoft.beans.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Andres
 */
public class UsuarioDao {

    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Usuario u) {
        String sql = "INSERT INTO TBL_Usuarios(USU_Usuario,USU_Password,FK_Persona,USU_Tipo) values('" + u.getUSUUsuario()+ "','" + u.getUSUPassword()
                + "'," + u.getFKPersona()+ ",'" + u.getUSUTipo()+ "')";
        return template.update(sql);
    }

    public Usuario login(String usu, String pass) {
        try {
            String sql = "SELECT * FROM tbl_usuarios where usu_usuario = '" + usu + "' and usu_password = '" + pass + "' limit 1;";
            return template.queryForObject(sql,new UsuarioRowMapper());
        } catch (DataAccessException dataAccessException) {
            Usuario  usu1 = new Usuario();
            usu1.setUSUUsuario("Incorrecto");
            return usu1;
        }
    } 
    
    
    
    public class UsuarioRowMapper implements RowMapper<Usuario> {

        @Override
        public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {

            Usuario p = new Usuario();
            p.setFKPersona(rs.getInt(1));
            p.setUSUUsuario(rs.getString(2));
            p.setUSUPassword(rs.getString(3));
            p.setFKPersona(rs.getInt(4));
            p.setUSUTipo(rs.getString(5));
            return p;

        }
    }

}
