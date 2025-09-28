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
  return  "Teorica []";
}

}