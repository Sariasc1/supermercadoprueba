package model;

public class Empleado {
    private int id;
    private String nombre;
    private String cargo;
    private int edad;
    private double salario;

    public Empleado(int id, String nombre, String cargo, int edad, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.edad = edad;
        this.salario = salario;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }
    public int getEdad() { return edad; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        return String.format("[id=%d] %s - %s (edad: %d, salario: %.2f)", id, nombre, cargo, edad, salario);
    }
}
