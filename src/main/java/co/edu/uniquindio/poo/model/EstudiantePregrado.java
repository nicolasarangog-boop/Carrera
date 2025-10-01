package co.edu.uniquindio.poo.model;

public class EstudiantePregrado extends Estudiante {

    private boolean beca;
    private double promedio;

    public EstudiantePregrado(int id, String nombre, String identificador, String programa, int semestre, Carrera ownedByCarrera,
            boolean beca, double promedio) {
        super(id, nombre, identificador, programa, semestre, ownedByCarrera);
       
       if (promedio < 0.0 || promedio > 5.0) throw new IllegalArgumentException("El promedio debe estar entre 0.0 y 5.0");
       
        this.beca = beca;
        this.promedio = promedio;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nombre: %s, Identificador: %s, Programa: %s, Semestre: %d, Beca: %b, Promedio: %.2f", 
            getId(), getNombre(), getIdentificador(), getPrograma(), getSemestre(), 
            beca, promedio);
    }

}