package pe.edu.upeu.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.dao.LibroDao;
import pe.edu.upeu.entity.Libro;

@Repository
public class LibroDaoImp implements LibroDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select*from libro", 
				BeanPropertyRowMapper.newInstance(Libro.class));
	}

}
