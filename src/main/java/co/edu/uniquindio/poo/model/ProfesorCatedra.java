package co.edu.uniquindio.poo.model;

public class ProfesorCatedra extends Profesor {

    private int horasContrato;
    private boolean empresaExterna;
    
    public ProfesorCatedra(String nombre, int id, String titulo, int añosXp, Carrera ownedByCarrera, int horasContrato,
            boolean empresaExterna) {
        super(nombre, id, titulo, añosXp, ownedByCarrera);
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
     
}