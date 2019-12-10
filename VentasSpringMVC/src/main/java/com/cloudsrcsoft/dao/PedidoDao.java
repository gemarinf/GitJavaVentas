/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudsrcsoft.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.cloudsrcsoft.beans.Pedido;

/**
 *
 * @author dayisboada
 */
public class PedidoDao {
    JdbcTemplate template;
    
    public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
    
    public int savePedido(Pedido pe){
    
    String sql ="INSERT INTO tbl_pedidos( id_producto, cantidad, precio_total, id_empleado, estado) VALUES ("+pe.getId_producto()+","+pe.getCantidad()+","+pe.getPrecio_total()+","+pe.getId_empleado()+",'"+pe.getEstado()+"')";
    
    return template.update(sql);
    
    }
    public Pedido getPedById(int id) {
		String sql = " SELECT * FROM tbl_pedidos where id_pedido =?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Pedido>(Pedido.class));
	}
    public int update(Pedido p) {
		String sql = "UPDATE tbl_pedidos SET id_producto="+p.getId_producto()+",cantidad ="+p.getCantidad()+",precio_total="+p.getPrecio_total()+",id_empleado="+p.getId_empleado()+",estado='"+p.getEstado()+"' where id_pedido = "+p.getId_pedido()+"";
		return template.update(sql);
	}
    
    public List<Pedido> getPedido() {
		return template.query("SELECT pe.id_pedido as id_pedido, concat(pro.PDT_Nombre,' - ',pro.PDT_Marca) as producto, pe.cantidad as cantidad, pe.precio_total as precio_total, concat(p.nombres , ' - ',p.apellido) as empleado , pe.estado as estado FROM tbl_pedidos pe INNER JOIN persona p on pe.id_empleado = p.Id inner join TBL_Productos pro on pro.PK_PDT_PRODUCTO = pe.id_producto  ", new RowMapper<Pedido>() {
			public Pedido mapRow(ResultSet rs, int row) throws SQLException {
				Pedido pe = new Pedido();
				pe.setId_pedido(rs.getInt(1));
                                pe.setProducto(rs.getString(2));
                                pe.setCantidad(rs.getInt(3));
                                pe.setPrecio_total(rs.getBigDecimal(4));
                                pe.setEmpleado(rs.getString(5));
                                pe.setEstado(rs.getString(6));
                                
				return pe;
			}
		});
	}
    public int delete(int id_pedido) {
		String sql = "delete from tbl_pedidos where id_pedido=" + id_pedido + "";
		return template.update(sql);
	}
    public List<Pedido> getpro() {
		return template.query("SELECT PK_PDT_PRODUCTO as id_producto, CONCAT(PDT_Nombre,' - ',PDT_Marca) as producto FROM TBL_Productos ", new RowMapper<Pedido>() {
			public Pedido mapRow(ResultSet rs, int row) throws SQLException {
				Pedido pe = new Pedido();
				pe.setId_producto(rs.getInt(1));
                                pe.setProducto(rs.getString(2));
                                
				return pe;
			}
		});
	}
     public List<Pedido> getper() {
		return template.query("SELECT Id as id_empleado,concat(nombres,' - ',apellido) as empleado FROM persona", new RowMapper<Pedido>() {
			public Pedido mapRow(ResultSet rs, int row) throws SQLException {
				Pedido pe = new Pedido();
				pe.setId_empleado(rs.getInt(1));
                                pe.setEmpleado(rs.getString(2));
                                
				return pe;
			}
		});
	}
}
