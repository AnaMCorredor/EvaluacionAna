package com.example.demo.Entidad;

public class Empleados {
    private int cedula;
    private String nombbre;
    private String apellido;
    private String cargo;
    private int salario;
    private  int[] exnocturna=new int[5];
    private int[] exfestivas=new int[5];
    private int[] ventas=new int[5];
    private int comision;



    public Empleados(int cedula, String nombbre, String apellido, String cargo, int salario, int[] exnocturna, int[] exfestivas, int[] ventas) {
        this.cedula = cedula;
        this.nombbre = nombbre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.exnocturna = exnocturna;
        this.exfestivas = exfestivas;
        this.ventas = ventas;
    }


    public Empleados() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombbre() {
        return nombbre;
    }

    public void setNombbre(String nombbre) {
        this.nombbre = nombbre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int[] getExnocturna() {
        return exnocturna;
    }

    public void setExnocturna(int[] exnocturna) {
        this.exnocturna = exnocturna;
    }

    public int[] getExfestivas() {
        return exfestivas;
    }

    public void setExfestivas(int[] exfestivas) {
        this.exfestivas = exfestivas;
    }

    public int[] getVentas() {
        return ventas;
    }

    public void setVentas(int[] ventas) {
        this.ventas = ventas;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }


}
