package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRepository {
    private List<Empleado> empleados = new ArrayList<>();

    public EmployeeRepository() {
        empleados.add(new Empleado(1, "Sebastian Arias", "Desarrollador", 30, 3000));
        empleados.add(new Empleado(2, "Camilo Gomez", "Tester", 25, 2500));
        empleados.add(new Empleado(3, "Omar lopez", "Desarrollador", 35, 3500));
        empleados.add(new Empleado(4, "Marta López", "Gerente", 40, 5000));
    }

    public List<Empleado> findAll() {
        return empleados;
    }

    public List<Empleado> findByCargo(String cargo) {
        return empleados.stream()
                .filter(e -> e.getCargo().equalsIgnoreCase(cargo))
                .collect(Collectors.toList());
    }
}
