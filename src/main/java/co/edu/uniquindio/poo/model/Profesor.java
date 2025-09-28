package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public abstract class Profesor {

    private String nombre;
    private int id;
    private String titulo;
    private int aniosXp;
    private ArrayList <Materia> listaMaterias= new ArrayList<>();
    private Carrera ownedByCarrera;
    
    public Profesor(String nombre, int id, String titulo, int aniosXp, Carrera ownedByCarrera) {
        this.nombre = nombre;
        this.id = id;
        this.titulo = titulo;
        this.aniosXp = aniosXp;
        this.ownedByCarrera = ownedByCarrera;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public Carrera getOwnedByCarrera() {
        return ownedByCarrera;
    }

    public void setOwnedByCarrera(Carrera ownedByCarrera) {
        this.ownedByCarrera = ownedByCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosXp() {
        return aniosXp;
    }

    public void setAniosXp(int aniosXp) {
        this.aniosXp = aniosXp;
    }

    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + ", id=" + id + ", titulo=" + titulo + ", aniosXp=" + aniosXp
                + ", listaMaterias=" + listaMaterias + ", ownedByCarrera=" + ownedByCarrera + "]";
    }

}