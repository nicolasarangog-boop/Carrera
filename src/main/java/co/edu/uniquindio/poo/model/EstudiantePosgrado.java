package co.edu.uniquindio.poo.model;
import java.util.Objects;

public class EstudiantePosgrado extends Estudiante{

private TipoEstudioPosgrado tipoEstudio;
private String temaInvestigacion;

public EstudiantePosgrado(int id, String nombre, String identificador, String programa, int semestre,
        Carrera ownedByCarrera, TipoEstudioPosgrado tipoEstudio, String temaInvestigacion) {
    super(id, nombre, identificador, programa, semestre, ownedByCarrera);
    this.tipoEstudio = tipoEstudio;
    this.temaInvestigacion = Objects.requireNonNull(temaInvestigacion, "El tema de investigacion no puede ser nulo");
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
    return String.format("ID: %d, Nombre: %s, Identificador: %s, Programa: %s, Semestre: %d, Tipo Estudio: %s, Tema Investigacion: %s", 
        getId(), getNombre(), getIdentificador(), getPrograma(), getSemestre(), 
        tipoEstudio, temaInvestigacion);
}

}