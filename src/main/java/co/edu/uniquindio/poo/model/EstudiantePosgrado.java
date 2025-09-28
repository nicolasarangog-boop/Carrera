package co.edu.uniquindio.poo.model;

public class EstudiantePosgrado extends Estudiante{

private TipoEstudioPosgrado tipoEstudio;
private String temaInvestigacion;

public EstudiantePosgrado(int id, String nombre, String identificador, String programa, int semestre,
        Carrera ownedByCarrera, TipoEstudioPosgrado tipoEstudio, String temaInvestigacion) {
    super(id, nombre, identificador, programa, semestre, ownedByCarrera);
    this.tipoEstudio = tipoEstudio;
    this.temaInvestigacion = temaInvestigacion;
}

public TipoEstudioPosgrado getTipoEstudio() {
    return tipoEstudio;
}

public void setTipoEstudio(TipoEstudioPosgrado tipoEstudio) {
    this.tipoEstudio = tipoEstudio;
}

public String getTemaInvestigacion() {
    return temaInvestigacion;
}

public void setTemaInvestigacion(String temaInvestigacion) {
    this.temaInvestigacion = temaInvestigacion;
}

@Override
public String toString() {
    return "EstudiantePosgrado [tipoEstudio=" + tipoEstudio + ", temaInvestigacion=" + temaInvestigacion + "]";
}

}