package co.edu.uniquindio.poo.model;

public class MateriaTeorica extends Materia{

public MateriaTeorica(int codigo, String nombre, int numeroHoras, int creditos, int semestre, Carrera ownedByCarrera,
    Profesor profesor) {
  super(codigo, nombre, numeroHoras, creditos, semestre, ownedByCarrera, profesor);
}

public int calcularHorasSemanales() {
  return getNumeroHoras();
}

@Override
public String toString() {
  return String.format("Codigo: %d, Nombre: %s, Numero Horas: %d, Creditos: %d, Semestre: %d, Profesor: %s", 
      getCodigo(), getNombre(), getNumeroHoras(), getCreditos(), getSemestre(), 
      getProfesor() != null ? getProfesor().getNombre() : "No asignado");
}

}