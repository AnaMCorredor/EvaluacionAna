package com.example.demo.Controlador;
import com.example.demo.Entidad.Empleados;
import com.example.demo.Servicio.ServvicioEm;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController

public class ControladorEm {
    ServvicioEm servicio = new ServvicioEm();

    @GetMapping("/listarempleados")
    public ArrayList<Empleados> listarempleados(){ return servicio.mostrarEmpleado();}

    @GetMapping("/buscarempleado/{ced}")
    public Empleados buscar(@PathVariable("ced")int cedula){
        return servicio.buscarempleado(cedula);
    }

    @PutMapping("/actualizar")
    public String actualizar(@RequestBody Empleados newem){
        return servicio.actualizar(newem);
    }

    @GetMapping("/suma")
    public ArrayList<Empleados> suma(){

        return servicio.BuscarTotal();

    }

}
