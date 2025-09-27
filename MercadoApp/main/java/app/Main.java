package app;

import model.EmployeeRepository;
import controller.EmployeeController;
import view.EmployeeView;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository repo = new EmployeeRepository();
        EmployeeController controller = new EmployeeController(repo);
        EmployeeView view = new EmployeeView(controller);

        view.mostrarMenu();
    }
}
