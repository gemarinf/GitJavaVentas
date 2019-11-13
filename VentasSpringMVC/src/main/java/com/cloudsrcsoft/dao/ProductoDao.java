/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cloudsrcsoft.beans.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
        String sql = "INSERT INTO TBL_Productos(PDT_Nombre,PDT_Marca,PDT_Precio,PDT_Cantidad,PDT_Peso,PDT_Tamaño) values('" + p.getPDTNombre() + "','" + p.getPDTMarca()
                + "'," + p.getPDTPrecio() + "," + p.getPDTCantidad() + "," + p.getPDTPeso() + ",'" + p.getPDTTamaño() + "')";
        return template.update(sql);
    }

    public int update(Producto p) {
        String sql = "UPDATE TBL_Productos SET PDT_Nombre='" + p.getPDTNombre() + "', PDT_Marca='" + p.getPDTMarca() + "', PDT_Precio="
                + p.getPDTPrecio() + ",PDT_Cantidad=" + p.getPDTCantidad() + ",PDT_Peso=" + p.getPDTPeso() + ",PDT_Tamaño='" + p.getPDTTamaño() + "' WHERE PK_PDT_Producto=" + p.getPKPDTProducto() + "";
        return template.update(sql);
    }

    public int delete(int pk) {
        String sql = "DELETE FROM TBL_Productos WHERE PK_PDT_Producto =" + pk + "";
        return template.update(sql);
    }

    public class ProductoRowMapper implements RowMapper<Producto> {

        @Override
        public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {

            Producto p = new Producto();
            p.setPKPDTProducto(rs.getInt(1));
            p.setPDTNombre(rs.getString(2));
            p.setPDTMarca(rs.getString(3));
            p.setPDTPrecio(rs.getBigDecimal(4));
            p.setPDTCantidad(rs.getInt(5));
            p.setPDTPeso(rs.getBigDecimal(6));
            p.setPDTTamaño(rs.getString(7));
            return p;

        }
    }

    public Producto getProducto(int pKPDTProducto) {
        String sql = "SELECT * FROM TBL_Productos WHERE PK_PDT_Producto = ?";
        return template.queryForObject(sql, new Object[]{pKPDTProducto}, new ProductoRowMapper());

    }

    public List<Producto> getProductos() {
        return template.query("SELECT * FROM TBL_Productos", new RowMapper<Producto>() {
            public Producto mapRow(ResultSet rs, int row) throws SQLException {
                Producto p = new Producto();
                p.setPKPDTProducto(rs.getInt(1));
                p.setPDTNombre(rs.getString(2));
                p.setPDTMarca(rs.getString(3));
                p.setPDTPrecio(rs.getBigDecimal(4));
                p.setPDTCantidad(rs.getInt(5));
                p.setPDTPeso(rs.getBigDecimal(6));
                p.setPDTTamaño(rs.getString(7));
                return p;
            }
        });
    }
}
