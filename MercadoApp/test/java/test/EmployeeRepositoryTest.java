import model.EmployeeRepository;
import model.Empleado;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryTest {

    @Test
    void testFindAll() {
        EmployeeRepository repo = new EmployeeRepository();
        List<Empleado> empleados = repo.findAll();
        assertFalse(empleados.isEmpty(), "La lista no debería estar vacía");
    }

    @Test
    void testFindByCargo() {
        EmployeeRepository repo = new EmployeeRepository();
        List<Empleado> desarrolladores = repo.findByCargo("Desarrollador");
        assertFalse(desarrolladores.isEmpty(), "Debe haber al menos un desarrollador");

        for (Empleado e : desarrolladores) {
            assertEquals("Desarrollador", e.getCargo());
        }
    }
}
