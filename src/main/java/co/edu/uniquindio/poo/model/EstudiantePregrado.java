package co.edu.uniquindio.poo.model;

public class EstudiantePregrado extends Estudiante {

    private boolean beca;
    private double promedio;

    public EstudiantePregrado(int id, String nombre, String identificador, String programa, int semestre, Carrera ownedByCarrera,
            boolean beca, double promedio) {
        super(id, nombre, identificador, programa, semestre, ownedByCarrera);
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
        return "Pregrado [beca=" + beca + ", promedio=" + promedio + "]";
    }

}