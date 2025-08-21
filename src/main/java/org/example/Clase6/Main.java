package org.example.Clase6;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        // Crear empleados
        Empleado e1 = new EmpleadoAComision(441245546, "Ana", "Flores", 2020, 20, 500);
        Empleado e2 = new EmpleadoAComision(456, "Luis", "Martínez", 2019,  45, 600);
        Empleado e7 = new EmpleadoAComision(45623, "Pablo", "Gimenez", 2013,  75, 800);

        Empleado e3 = new EmpleadoSalarioFijo(789, "María", "Gómez", 2018, 45000);
        Empleado e4 = new EmpleadoSalarioFijo(321, "Carlos", "Pérez", 2021, 40000);

        // Agregar empleados a la empresa
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);
        empresa.agregarEmpleado(e7);
        // Mostrar salarios
        empresa.mostrarSalarios();

        // Mostrar empleado con más clientes
        Empleado top = empresa.empleadoConMasClientes();
        if (top != null) {
            System.out.println("\nEmpleado con más clientes: " + top.getNombre() + " " + top.getApellido());
        }




    }
}
