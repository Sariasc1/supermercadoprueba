package view;

import controller.EmployeeController;
import model.Empleado;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private EmployeeController controller;
    private Scanner scanner = new Scanner(System.in);

    public EmployeeView(EmployeeController controller) {
        this.controller = controller;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Consulta de Empleados por Cargo ---");
            System.out.println("1. Listar todos los empleados");
            System.out.println("2. Consultar por cargo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> listarEmpleados();
                case 2 -> consultarPorCargo();
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }

    private void listarEmpleados() {
        List<Empleado> empleados = controller.obtenerTodos();
        empleados.forEach(System.out::println);
    }

    private void consultarPorCargo() {
        System.out.print("Ingrese el cargo: ");
        String cargo = scanner.nextLine();
        List<Empleado> empleados = controller.obtenerPorCargo(cargo);
        if (empleados.isEmpty()) {
            System.out.println("No se encontraron empleados con ese cargo.");
        } else {
            empleados.forEach(System.out::println);
        }
    }
}
