package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public abstract class Estudiante {

private int id;
private String nombre;
private String identificador;
private String programa;
private int semestre;
private Carrera ownedByCarrera;
private ArrayList<Materia> listaMaterias;

public Estudiante(int id, String nombre, String identificador, String programa, int semestre, Carrera ownedByCarrera) {
    this.id = id;
    this.nombre = nombre;
    this.identificador = identificador;
    this.programa = programa;
    this.semestre = semestre;
    this.ownedByCarrera = ownedByCarrera;
    this.listaMaterias = new ArrayList<>();
}

public Carrera getOwnedByCarrera() {
    return ownedByCarrera;
}

public void setOwnedByCarrera(Carrera ownedByCarrera) {
    this.ownedByCarrera = ownedByCarrera;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getIdentificador() {
    return identificador;
}

public void setIdentificador(String identificador) {
    this.identificador = identificador;
}

public String getPrograma() {
    return programa;
}

public void setPrograma(String programa) {
    this.programa = programa;
}

public int getSemestre() {
    return semestre;
}

public void setSemestre(int semestre) {
    this.semestre = semestre;
}

public ArrayList<Materia> getListaMaterias() {
    return listaMaterias;
}

public void setListaMaterias(ArrayList<Materia> listaMaterias) {
    this.listaMaterias = listaMaterias;
}

public int totalCreditos() {
    return listaMaterias.stream().mapToInt(Materia::getCreditos).sum();
}


@Override
public String toString() {
    return "Estudiante [id=" + id + ", nombre=" + nombre + ", identificador=" + identificador + ", programa=" + programa
            + ", semestre=" + semestre + ", ownedByCarrera=" + ownedByCarrera + ", listaMaterias=" + listaMaterias + "]";
}

}