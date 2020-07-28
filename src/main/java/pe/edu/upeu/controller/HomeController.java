package pe.edu.upeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.entity.Libro;
import pe.edu.upeu.service.LibroService;

@RestController
public class HomeController {
	@Autowired
	private LibroService libroService;
	@GetMapping("/libro")
	public List<Libro> libro() {
		return libroService.readAll();
	}
}
