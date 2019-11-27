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
    
        public int savePedido(Pedido p) {
		String sql = "insert into tbl_pedidos(id_producto,cantidad ,precio_total,id_empleado,estado) values("+ p.getId_producto()+","+p.getCantidad()+","+p.getPrecio_total()+","+p.getId_empleado()+",'"+p.getEstado()+"')";
		return template.update(sql);
	}
        
    public int updatePedido(Pedido p) {
		String sql = "update tbl_pedidos set id_producto=" + p.getId_producto() + ", cantidad=" + p.getCantidad() + ",precio_total="
				+ p.getPrecio_total() + ",id_empleado="+p.getId_empleado()+",estado='"+p.getEstado()+"' where id_pedido=" + p.getId_pedido() + "";
		return template.update(sql);
	}
    
    
    public int deletePedido(int id) {
		String sql = "delete from tbl_pedidos where id_pedido=" + id + "";
		return template.update(sql);
	}
    
    public Pedido getEmpByIdPedido(int id_pedido) {
		String sql = "select * from tbl_pedidos where id_pedido=?";
		return template.queryForObject(sql, new Object[] { id_pedido }, new BeanPropertyRowMapper<Pedido>(Pedido.class));
	}
    
    public List<Pedido> getEmployees() {
		return template.query("select * from tbl_pedidos", new RowMapper<Pedido>() {
			public Pedido mapRow(ResultSet rs, int row) throws SQLException {
				Pedido e = new Pedido();
				e.setId_pedido(rs.getInt(1));
				e.setId_producto(rs.getInt(2));
				e.setCantidad(rs.getInt(3));
				e.setPrecio_total(rs.getBigDecimal(4));
                                e.setId_empleado(rs.getInt(5));
                                e.setEstado(rs.getString(6));
//                                e.setDocumento(rs.getString(7));
                                
				return e;
			}
		});
	}
    
    
}
