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
        System.out.println("tamanuio" + p.getpDTTamanio());
        String sql = "INSERT INTO TBL_Productos(PDT_Nombre,PDT_Marca,FK_Proveedor,PDT_Precio,PDT_Cantidad,PDT_Peso,PDT_Tamanio) values('" + p.getpDTNombre() + "','" + p.getpDTMarca()
                + "'," + p.getfK_Proveedor() + "," + p.getpDTPrecio() + "," + p.getpDTCantidad() + "," + p.getpDTPeso() + ",'" + p.getpDTTamanio() + "')";
        return template.update(sql);
    }

    public int update(Producto p) {
        String sql = "UPDATE TBL_Productos SET PDT_Nombre='" + p.getpDTNombre() + "', PDT_Marca='" + p.getpDTMarca() + "', PDT_Precio="
                + p.getpDTPrecio() + ",PDT_Cantidad=" + p.getpDTCantidad() + ",PDT_Peso=" + p.getpDTPeso() + ",PDT_Tamanio='" + p.getpDTTamanio() + "',FK_Proveedor=" + p.getfK_Proveedor() + " WHERE PK_PDT_Producto=" + p.getpKPDTProducto() + "";
        return template.update(sql);
    }

    public int delete(int pk) {
        String sql = "DELETE FROM TBL_Productos WHERE PK_PDT_Producto =" + pk + "";
        return template.update(sql);
    }

    public Producto getProducto(int pKPDTProducto) {
        String sql = "SELECT * FROM TBL_Productos WHERE PK_PDT_Producto = ?";
        return template.queryForObject(sql, new Object[]{pKPDTProducto}, new ProductoRowMapper());

    }

    public class ProductoRowMapper implements RowMapper<Producto> {

        @Override
        public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {

            Producto p = new Producto();
            p.setpKPDTProducto(rs.getInt(1));
            p.setpDTNombre(rs.getString(2));
            p.setpDTMarca(rs.getString(3));
            p.setpDTPrecio(rs.getBigDecimal(4));
            p.setpDTCantidad(rs.getInt(5));
            p.setpDTPeso(rs.getBigDecimal(6));
            p.setpDTTamanio(rs.getString(7));
            p.setProveedor(rs.getString(8));
            return p;

        }
    }

    public List<Producto> getProductos() {
        return template.query("select pro.PK_PDT_PRODUCTO,pro.PDT_Nombre,pro.PDT_Marca,pro.PDT_Precio,pro.PDT_Cantidad,pro.PDT_Peso,pro.PDT_Tamanio, concat(p.nombre,' - ',p.nit) as proveedor from TBL_Productos pro inner join tbl_proveedor p on pro.FK_Proveedor = p.id_proveedor ", new RowMapper<Producto>() {
            public Producto mapRow(ResultSet rs, int row) throws SQLException {
                Producto e = new Producto();
                e.setpKPDTProducto(rs.getInt(1));
                e.setpDTNombre(rs.getString(2));
                e.setpDTMarca(rs.getString(3));
                e.setpDTPrecio(rs.getBigDecimal(4));
                e.setpDTCantidad(rs.getInt(5));
                e.setpDTPeso(rs.getBigDecimal(6));
                e.setpDTTamanio(rs.getString(7));
                e.setProveedor(rs.getString(8));

                return e;
            }
        });
    }

    public List<Producto> getProveedor() {
        return template.query("SELECT id_proveedor , concat(nombre, ' - ',nit) as proveedor FROM tbl_proveedor", new RowMapper<Producto>() {
            public Producto mapRow(ResultSet rs, int row) throws SQLException {
                Producto e = new Producto();
                e.setfK_Proveedor(rs.getInt(1));
                e.setProveedor(rs.getString(2));

                return e;
            }
        });
    }

}
