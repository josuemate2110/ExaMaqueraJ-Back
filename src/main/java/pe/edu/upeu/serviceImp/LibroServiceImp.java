package pe.edu.upeu.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.LibroDao;
import pe.edu.upeu.entity.Libro;
import pe.edu.upeu.service.LibroService;
@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	private LibroDao libroDao;
	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return libroDao.readAll();
	}

}
