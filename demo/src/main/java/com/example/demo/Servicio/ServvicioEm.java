package com.example.demo.Servicio;
import com.example.demo.Entidad.Empleados;
import java.util.ArrayList;


public class ServvicioEm {
    private ArrayList<Empleados> lista = new ArrayList<>();


    public ServvicioEm(){
        lista.add(new Empleados(12345,"Erik","Cantor","vendedor", 900000,new int[]{1,5,4,6,3},new int[]{1,1,5,3,2},new int[]{500000}));
        lista.add(new Empleados(56789,"Ana","Corredor","Administrador", 1000000,new int[]{1,5,4,6,3},new int[]{1,1,5,3,2},new int[]{500000}));
        lista.add(new Empleados(10111,"Laura","Lopez","jefe", 1500000,new int[]{1,5,4,6,3},new int[]{1,1,5,3,2},new int[]{500000}));
        lista.add(new Empleados(12131,"Brayan","Quiroga","vendedor", 900000,new int[]{1,5,4,6,3},new int[]{1,1,5,3,2},new int[]{500000}));
        lista.add(new Empleados(14151,"Silkey","Ramos","Administrador", 1000000,new int[]{1,5,4,6,3},new int[]{1,1,5,3,2},new int[]{500000}));
        lista.add(new Empleados(16171,"Omar","Diaz","ayudante", 700000,new int[]{1,5,4,6,3},new int[]{1,1,5,3,2},new int[]{500000}));
        lista.add(new Empleados(18192,"Maik","Lozano","vendedor", 900000,new int[]{1,5,4,6,3},new int[]{1,1,5,3,2},new int[]{500000}));
        lista.add(new Empleados(20212,"Andres","Numpaque","Administrador", 1000000,new int[]{1,5,4,6,3},new int[]{1,1,5,3,2},new int[]{500000}));
        lista.add(new Empleados(22232,"Juan","Rodri","ayudante", 700000,new int[]{1,5,4,6,3},new int[]{1,1,5,3,2},new int[]{500000}));
        lista.add(new Empleados(24252,"Felipe","Quesada","Administrador", 1000000,new int[]{1,5,4,6,3},new int[]{1,1,5,3,2},new int[]{500000}));

    }

    public ArrayList<Empleados> mostrarEmpleado(){
        return lista;
    }

    public String actualizar(Empleados empleado){
        for (Empleados newemp: lista){
            if (newemp.getCedula() == empleado.getCedula()){
                newemp.setNombbre(empleado.getNombbre());
                newemp.setApellido(empleado.getApellido());
                newemp.setCargo(empleado.getCargo());
                newemp.setSalario(empleado.getSalario());
                newemp.setExnocturna(empleado.getExnocturna());
                newemp.setExfestivas(empleado.getExfestivas());
                newemp.setVentas(empleado.getVentas());
            }
        }
        return "Se actualizo con exito";
    }

    public Empleados buscarempleado(int cedula){
        for (Empleados bus: lista){
            if (bus.getCedula() == cedula){
                return bus;
            }
        }
        return null;
    }


    public ArrayList<Empleados> BuscarTotal(){

        int suma = 0;
        int multi = 0;
        for(Empleados u : lista){
            for (int i = 0; i < 5;i++){

                    suma = u.getExnocturna()[0] + u.getExnocturna()[1] + u.getExnocturna()[2] + u.getExnocturna()[3] + u.getExnocturna()[4];
                    multi = suma * 5800;
                    u.setComision(multi);

            }
        }
        return lista;
    }



}
