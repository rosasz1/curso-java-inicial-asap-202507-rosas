package org.example.Clase6;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
   private List<Empleado> empleados;

   public Empresa() {
      this.empleados = new ArrayList<>();
   }


   public void agregarEmpleado(Empleado emp){
      this.empleados.add(emp);
   }


   public void mostrarSalarios(){
      for (Empleado empleado : this.empleados){
         System.out.println(empleado.getNombreCompleto() + " " + empleado.calcularSalario());
      }
   }

   public Empleado empleadoConMasClientes(){

      EmpleadoAComision empMasClientes = null;
      int maxClientes = -1;

      for (Empleado emp : this.empleados){
         if (emp instanceof EmpleadoAComision){
            //aplicando downcasting
            EmpleadoAComision empAComision= (EmpleadoAComision) emp;
            if (empAComision.getClientesCaptados() > maxClientes){
               maxClientes = empAComision.getClientesCaptados();
               empMasClientes = empAComision;
            }
         }
      }
      return empMasClientes;
   }


}
