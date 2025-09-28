package co.edu.uniquindio.poo.model;

public class ProfesorPlanta extends Profesor {

private TipoTiempoTrabajo tiempoTrabajo;
private boolean proyectos;

public ProfesorPlanta(String nombre, int id, String titulo, int añosXp, Carrera ownedByCarrera, TipoTiempoTrabajo tiempoTrabajo,
        boolean proyectos) {
    super(nombre, id, titulo, añosXp, ownedByCarrera);
    this.tiempoTrabajo = tiempoTrabajo;
    this.proyectos = proyectos;
}

public TipoTiempoTrabajo getTiempoTrabajo() {
    return tiempoTrabajo;
}

public void setTiempoTrabajo(TipoTiempoTrabajo tiempoTrabajo) {
    this.tiempoTrabajo = tiempoTrabajo;
}

public boolean isProyectos() {
    return proyectos;
}

public void setProyectos(boolean proyectos) {
    this.proyectos = proyectos;
}

@Override
public String toString() {
    return super.toString() + String.format(", Tiempo Trabajo: %s, Proyectos: %b", tiempoTrabajo, proyectos);
}



}