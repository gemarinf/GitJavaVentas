/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cloudsrcsoft.beans.Proveedor;
/**
 *
 * @author dayisboada
 */
public class ProveedorDao {
    JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
        
        public int save(Proveedor p) {
		String sql = "INSERT INTO tbl_proveedor( nombre, nit, telefono, correo) VALUES ('"+p.getNombre()+"','"+p.getNit()+"','"+p.getTelefono()+"','"+p.getCorreo()+"')";
		return template.update(sql);
	}
        
        public int update(Proveedor p) {
		String sql = "UPDATE tbl_proveedor SET nombre='"+p.getNombre()+"',nit='"+p.getNit()+"',telefono='"+p.getTelefono()+"',correo='"+p.getCorreo()+"' WHERE id_proveedor ="+p.getId_proveedor()+"";
		return template.update(sql);
	}
        public int delete(int id) {
		String sql = "delete from tbl_proveedor where id_proveedor=" + id + "";
		return template.update(sql);
	}
        public Proveedor getProveedorById(int id) {
		String sql = "select * from tbl_proveedor where id_proveedor=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Proveedor>(Proveedor.class));
	}
        
        	public List<Proveedor> getProveedor() {
		return template.query("select * from tbl_proveedor", new RowMapper<Proveedor>() {
			public Proveedor mapRow(ResultSet rs, int row) throws SQLException {
				Proveedor e = new Proveedor();
				e.setId_proveedor(rs.getInt(1));
				e.setNombre(rs.getString(2));
				e.setNit(rs.getString(3));
				e.setCorreo(rs.getString(5));
                                e.setTelefono(rs.getString(4));
                                
                                
				return e;
			}
		});
	}
}
