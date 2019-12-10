/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.dao;


import com.cloudsrcsoft.beans.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Andres
 */
public class ProductoDao {

    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Producto p) {
        String sql = "INSERT INTO TBL_Productos(PDT_Nombre,PDT_Marca,PDT_Precio,PDT_Cantidad,PDT_Peso,PDT_Tamanio) values('" + p.getPDTNombre() + "','" + p.getPDTMarca()
                + "'," + p.getPDTPrecio() + "," + p.getPDTCantidad() + "," + p.getPDTPeso() + ",'" + p.getPDTTamanio()+ "')";
        return template.update(sql);
    }

    public int update(Producto p) {
        String sql = "UPDATE TBL_Productos SET PDT_Nombre='" + p.getPDTNombre() + "', PDT_Marca='" + p.getPDTMarca() + "', PDT_Precio="
                + p.getPDTPrecio() + ",PDT_Cantidad=" + p.getPDTCantidad() + ",PDT_Peso=" + p.getPDTPeso() + ",PDT_Tamanio='" + p.getPDTTamanio()+ "' WHERE PK_PDT_Producto=" + p.getPKPDTProducto() + "";
        return template.update(sql);
    }

    public int delete(int pk) {
        String sql = "DELETE FROM TBL_Productos WHERE PK_PDT_Producto =" + pk + "";
        return template.update(sql);
    }

   

    public Producto getProducto(int pKPDTProducto) {
        String sql = "SELECT * FROM TBL_Productos WHERE PK_PDT_Producto = ?";
        return template.queryForObject(sql, new Object[]{pKPDTProducto},  new BeanPropertyRowMapper<Producto>(Producto.class));

    }
public List<Producto> getProductos() {
		return template.query("select * from TBL_Productos", new RowMapper<Producto>() {
			public Producto mapRow(ResultSet rs, int row) throws SQLException {
				Producto e = new Producto();
				e.setPKPDTProducto(rs.getInt(1));
				e.setPDTNombre(rs.getString(2));
				e.setPDTMarca(rs.getString(3));
				e.setPDTPrecio(rs.getBigDecimal(4));
                                e.setPDTCantidad(rs.getInt(5));
                                e.setPDTPeso(rs.getBigDecimal(6));
                                e.setPDTTamanio(rs.getString(7));
                                
				return e;
			}
		});
	}
    
    
}
