package com.cloudsrcsoft.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cloudsrcsoft.beans.Emp;

public class EmpDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Emp p) {
		String sql = "insert into persona(nombres, apellido,correo,direccion,tipodoc,documento) values('" + p.getNombres() + "','" + p.getApellido()
				+ "','" + p.getCorreo() + "','"+p.getDireccion()+"','"+p.getTipodoc()+"','"+p.getDocumento()+"')";
		return template.update(sql);
	}

	public int update(Emp p) {
		String sql = "update persona set nombres='" + p.getNombres() + "', apellido='" + p.getApellido() + "', correo='"
				+ p.getCorreo() + "',direccion='"+p.getDireccion()+"',tipodoc='"+p.getTipodoc()+"',documento='"+p.getDocumento()+"' where id=" + p.getId() + "";
		return template.update(sql);
	}

	public int delete(int id) {
		String sql = "delete from persona where id=" + id + "";
		return template.update(sql);
	}

	public Emp getEmpById(int id) {
		String sql = "select * from persona where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Emp>(Emp.class));
	}

	public List<Emp> getEmployees() {
		return template.query("select * from persona", new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setNombres(rs.getString(2));
				e.setApellido(rs.getString(3));
				e.setCorreo(rs.getString(4));
                                e.setDireccion(rs.getString(5));
                                e.setTipodoc(rs.getString(6));
                                e.setDocumento(rs.getString(7));
                                
				return e;
			}
		});
	}
}
