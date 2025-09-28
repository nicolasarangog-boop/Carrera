package co.edu.uniquindio.poo.model;

public class ProfesorCatedra extends Profesor {

    private int horasContrato;
    private boolean empresaExterna;
    
    public ProfesorCatedra(String nombre, int id, String titulo, int aniosXp, Carrera ownedByCarrera, int horasContrato,
            boolean empresaExterna) {
        super(nombre, id, titulo, aniosXp, ownedByCarrera);
        this.horasContrato = horasContrato;
        this.empresaExterna = empresaExterna;
    }

    public int getHorasContrato() {
        return horasContrato;
    }

    public void setHorasContrato(int horasContrato) {
        this.horasContrato = horasContrato;
    }

    public boolean isEmpresaExterna() {
        return empresaExterna;
    }

    public void setEmpresaExterna(boolean empresaExterna) {
        this.empresaExterna = empresaExterna;
    }
     
@Override
public String toString() {
    return super.toString() + String.format(", Horas Contrato: %d, Empresa Externa: %b", horasContrato, empresaExterna);
}

}