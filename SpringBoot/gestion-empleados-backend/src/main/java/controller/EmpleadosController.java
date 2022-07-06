package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Repository.EmpleadoRepository;
import entity.Empleados;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadosController {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	@GetMapping("/empleadosback")
	public List<Empleados> listarTodosLosEmpleados() {
		return empleadoRepository.findAll();
	}

}
