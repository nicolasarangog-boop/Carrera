package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public abstract class Materia {

    private int codigo;
    private String nombre;
    private int numeroHoras;
    private int creditos;
    private int semestre;
    private Carrera ownedByCarrera;
    private Profesor profesor;
    private ArrayList<Estudiante> listaEstudiantes;

    public Materia(int codigo, String nombre, int numeroHoras, int creditos, int semestre, Carrera ownedByCarrera, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
        this.creditos = creditos;
        this.semestre = semestre;
        this.ownedByCarrera = ownedByCarrera;
        this.profesor = profesor;
        this.ownedByCarrera = ownedByCarrera;
        this.listaEstudiantes = new ArrayList<>();
    }

    public Carrera getOwnedByCarrera() {
        return ownedByCarrera;
    }

    public void setOwnedByCarrera(Carrera ownedByCarrera) {
        this.ownedByCarrera = ownedByCarrera;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public abstract int calcularHorasSemanales();

    @Override
    public String toString() {
        return "Materia [codigo=" + codigo + ", nombre=" + nombre + ", numeroHoras=" + numeroHoras + ", creditos="
                + creditos + ", semestre=" + semestre + ", ownedByCarrera=" + ownedByCarrera + ", profesor=" + profesor + "]";
    }
}