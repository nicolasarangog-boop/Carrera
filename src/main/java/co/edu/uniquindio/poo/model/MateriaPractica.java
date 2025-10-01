package co.edu.uniquindio.poo.model;

public class MateriaPractica extends Materia {

  private int noHorasPractica;
  private int noHorasLaboratorio;
  
  public MateriaPractica(int codigo, String nombre, int numeroHoras, int creditos, int semestre, Carrera ownedByCarrera,
      Profesor profesor, int noHorasPractica, int noHorasLaboratorio) {
    super(codigo, nombre, numeroHoras, creditos, semestre, ownedByCarrera, profesor);
    
    if (noHorasPractica < 0) throw new IllegalArgumentException("El numero de horas de practica no puede ser negativo");
    
    this.noHorasPractica = noHorasPractica;
    this.noHorasLaboratorio = noHorasLaboratorio;
  }

  public int getNoHorasPractica() {
    return noHorasPractica;
  }

  public void setNoHorasPractica(int noHorasPractica) {
    this.noHorasPractica = noHorasPractica;
  }

  public int getNoHorasLaboratorio() {
    return noHorasLaboratorio;
  }

  public void setNoHorasLaboratorio(int noHorasLaboratorio) {
    this.noHorasLaboratorio = noHorasLaboratorio;
  }

  public int calcularHorasSemanales() {
  return getNumeroHoras() + noHorasPractica;
  }

  @Override
  public String toString() {
    return String.format("Codigo: %d, Nombre: %s, Numero Horas: %d, Creditos: %d, Semestre: %d, No Horas Practica: %d, No Horas Laboratorio: %d, Profesor: %s", 
        getCodigo(), getNombre(), getNumeroHoras(), getCreditos(), getSemestre(), 
        noHorasPractica, noHorasLaboratorio,
        getProfesor() != null ? getProfesor().getNombre() : "No asignado");
  }

}