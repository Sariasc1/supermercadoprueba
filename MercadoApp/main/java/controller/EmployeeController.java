package controller;

import model.EmployeeRepository;
import model.Empleado;
import java.util.List;

public class EmployeeController {
    private EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Empleado> obtenerPorCargo(String cargo) {
        return repo.findByCargo(cargo);
    }

    public List<Empleado> obtenerTodos() {
        return repo.findAll();
    }
}
