package co.edu.uniquindio.poo.model;

public class MateriaPractica extends Materia {

  private int noHorasPractica;
  private int noLaboratorio;
  
  public MateriaPractica(int codigo, String nombre, int numeroHoras, int creditos, int semestre, Carrera ownedByCarrera,
      Profesor profesor, int noHorasPractica, int noLaboratorio) {
    super(codigo, nombre, numeroHoras, creditos, semestre, ownedByCarrera, profesor);
    this.noHorasPractica = noHorasPractica;
    this.noLaboratorio = noLaboratorio;
  }

  public int getNoHorasPractica() {
    return noHorasPractica;
  }

  public void setNoHorasPractica(int noHorasPractica) {
    this.noHorasPractica = noHorasPractica;
  }

  public int getNoLaboratorio() {
    return noLaboratorio;
  }

  public void setNoLaboratorio(int noLaboratorio) {
    this.noLaboratorio = noLaboratorio;
  }

  public int calcularHorasSemanales() {
  return getNumeroHoras() + noHorasPractica;
  }

  @Override
  public String toString() {
    return "Practica [noHorasPractica=" + noHorasPractica + ", noLaboratorio=" + noLaboratorio + "]";
  }

}