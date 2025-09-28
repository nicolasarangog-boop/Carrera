package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Carrera {

    private String nombre;
    private String direccion;
    private String nit;
    private ArrayList <Materia> listaMaterias;
    private ArrayList<Profesor> listaProfesores;
    private ArrayList <Estudiante> listaEstudiantes;

    public Carrera(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.listaMaterias = new ArrayList<>();
        this.listaProfesores = new ArrayList<>();
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

   public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

/**
 * Agregar Materias a la Carrera
 */
 public String agregarMateria(Materia nuevaMateria){
    String mensaje="";
    Optional<Materia> materiaExistente= buscarMateria(nuevaMateria.getCodigo());
    if(materiaExistente.isPresent()){
        mensaje="La materia con el codigo: " + nuevaMateria.getCodigo() + " ya existe en la carrera";
    }else{
        listaMaterias.add(nuevaMateria);
        mensaje="La materia " + nuevaMateria.getNombre() + " fue agregada exitosamente";
    }
    return mensaje;
}

/**
 * Metodo para buscar Materias
 */
public Optional buscarMateria(int codigo){
    return listaMaterias.stream().filter(Materia -> Materia.getCodigo() == codigo).findFirst();
}

/**
 * Metodo para actualizar Materias en la carrera
 */
 public String actualizarMateria (int codigo, String nuevoNombre, int nuevoNumeroHoras, int nuevoCreditos, int nuevoSemestre){
    String mensaje="";
    Optional <Materia> materiaExistente= buscarMateria(codigo);
    if(materiaExistente.isPresent()){
        materiaExistente.get().setNombre(nuevoNombre);
        materiaExistente.get().setNumeroHoras(nuevoNumeroHoras);
        materiaExistente.get().setCreditos(nuevoCreditos);
        materiaExistente.get().setSemestre(nuevoSemestre);
        mensaje="La Materia con codigo: " + codigo + " fue actualizada correctamente";
    }else{
        mensaje="La Materia no existe en la Carrera";
    }
    return mensaje;
}

/**
 * Metodo para eliminar Materias de la Carrera
 */
public String eliminarMateria(int codigo){
    String mensaje="";
    Optional<Materia> materiaExistente= buscarMateria(codigo);
    if(materiaExistente.isPresent()){
        listaMaterias.remove(materiaExistente.get());
        mensaje="La Materia con codigo: " + codigo + " fue eliminada exitosamente";
    }else{
        mensaje="La Materia no existe en la Carrera";
    }
    return mensaje;
}

/**
 * Metodo para agregar Profesores a la Carrera
 */
 public String agregarProfesor(Profesor nuevoProfesor){
    String mensaje="";
    Optional<Profesor> profesorExistente= buscarProfesor(nuevoProfesor.getId());
    if(profesorExistente.isPresent()){
        mensaje="El Profesor con codigo: " + nuevoProfesor.getId() + " ya existe en la carrera";
    }else{
        listaProfesores.add(nuevoProfesor);
        mensaje="El Profesor " + nuevoProfesor.getNombre() + " fue agregado exitosamente";
    }
    return mensaje;
}

/**
 * Metodo para buscar Profesores
 */
public Optional buscarProfesor(int id){
    return listaProfesores.stream().filter(Profesor -> Profesor.getId() == id).findFirst();
}

/**
 * Metodo para actualizar Profesores en la carrera
 */
 public String actualizaeProfesor (int id, String nuevoNombre, int nuevoAniosXp, String nuevoTitulo){
    String mensaje="";
    Optional <Profesor> profesorExistente= buscarProfesor(id);
    if(profesorExistente.isPresent()){
        profesorExistente.get().setNombre(nuevoNombre);
        profesorExistente.get().setAniosXp(nuevoAniosXp);
        profesorExistente.get().setTitulo(nuevoTitulo);
        mensaje="El Profesor con codigo: " + id + " fue actualizado correctamente";
    }else{
        mensaje="El Profesor no existe en la Carrera";
    }
    return mensaje;
}

/**
 * Metodo para eliminar profesores de la Carrera
 */
public String eliminarProfesor(int id){
    String mensaje="";
    Optional<Profesor> profesorExistente= buscarProfesor(id);
    if(profesorExistente.isPresent()){
        listaProfesores.remove(profesorExistente.get());
        mensaje="El Profesor con codigo: " + id + " fue eliminado exitosamente";
    }else{
        mensaje="El Profesor no existe en la Carrera";
    }
    return mensaje;
}

/**
 * Metodo para agregar Estudiantes a la Carrera
 */
public String agregarEstudiante(Estudiante nuevoEstudiante){
        String resultado=" ";
        Optional <Estudiante> estudianteExistente= buscarEstudiante(nuevoEstudiante.getIdentificador());
        if(estudianteExistente.isEmpty()){
            listaEstudiantes.add(nuevoEstudiante);
            resultado= "El estudiante"  + nuevoEstudiante.getNombre() + " fue agregado exitosamente";
        }else{
            resultado="El estudiante con el codigo:  "+nuevoEstudiante.getIdentificador() + " ya existe en la carrera";
        }
        return resultado;
    }

/**
 * Metodo para buscar Estudiantes
 */
public Optional<Estudiante> buscarEstudiante (String identificador){
        return listaEstudiantes.stream().filter(Estudiante-> Estudiante.getIdentificador() == identificador).findFirst();
    }

    /**
 * Metodo para actualizar Estudiantes en la carrera
 */
public String actualizarEstudiante(String identificador, String nuevoNombre, String nuevoPrograma, int nuevoSemestre){
        String resultado=" ";
        Optional <Estudiante> estudianteExistente= buscarEstudiante(identificador);
        if(estudianteExistente.isPresent()){
            estudianteExistente.get().setNombre(nuevoNombre);
            estudianteExistente.get().setPrograma(nuevoPrograma);
            estudianteExistente.get().setSemestre(nuevoSemestre);
            resultado="El Estudiante con codigo: "+ identificador + " fue actualizado correctamente";
        }else{
            resultado="El Estudiante no existe en la Carrera";
        }
        return resultado;
    }

/**
 * Metodo para eliminar Estudiantes de la Carrera
 */
public String eliminarEstudiante(String identificador){
        String resultado=" ";
        Optional <Estudiante> estudianteExistente=buscarEstudiante(identificador);
        if(estudianteExistente.isPresent()){
            listaEstudiantes.remove(estudianteExistente.get());
            resultado="El estudiante con codigo: " + identificador + " fue eliminado exitosamente";
        }else{
            resultado="El estudiante con codigo: " + identificador + " no existe en la carrera";
        }
        return resultado;
    }

/** Metodo para consultar Materias de un semestre especifico
 */
public List<Materia> materiasSemestreEspecifico(int semestre){
    return listaMaterias.stream().filter(Materia -> Materia.getSemestre() == semestre).collect(Collectors.toList());
}

/**
 * Metodo para asociar un profesor a una materia
 */
public String asignarProfesorMateria(int codigo, int id){
    String mensaje="";
    Optional<Materia> materiaExistente= buscarMateria(codigo);
    Optional<Profesor> profesorExistente= buscarProfesor(id);
    if(materiaExistente.isPresent() && profesorExistente.isPresent()){
        materiaExistente.get().setProfesor(profesorExistente.get());
        profesorExistente.get().getListaMaterias().add(materiaExistente.get());
        mensaje="El profesor " + profesorExistente.get().getNombre() + " fue asignado a la materia " + materiaExistente.get().getNombre() + " exitosamente";
    }else{
        mensaje="La materia o el profesor no existen en la carrera";
    }
    return mensaje;
}

/**
 * Metodo para inscribir un estudiante a varias materias
 */
public String inscribirEstudianteMateria(String identificador, int codigo){
    String mensaje="";
    Optional<Estudiante> estudianteExistente= buscarEstudiante(identificador);
    Optional<Materia> materiaExistente= buscarMateria(codigo);
    if(estudianteExistente.isPresent() && materiaExistente.isPresent()){
        estudianteExistente.get().getListaMaterias().add(materiaExistente.get());
        materiaExistente.get().getListaEstudiantes().add(estudianteExistente.get());
        mensaje="El estudiante " + estudianteExistente.get().getNombre() + " fue inscrito a la materia " + materiaExistente.get().getNombre() + " exitosamente";
    }else{
        mensaje="La materia o el estudiante no existen en la carrera";
    }
    return mensaje;
}

/**
 * listar estudiantes de una materia
 */
public ArrayList<Estudiante> listarEstudiantesMateria(int codigo){
    ArrayList<Estudiante> estudiantesMateria= new ArrayList<>();
    Optional<Materia> materiaExistente= buscarMateria(codigo);
    if(materiaExistente.isPresent()){
        estudiantesMateria=materiaExistente.get().getListaEstudiantes();
    }
    return estudiantesMateria;
}

/**
 * Calcular horas semanales de una materia
 */
public int calcularHorasSemanalesMateria(int codigo){
    Optional<Materia> materiaExistente= buscarMateria(codigo);
        return materiaExistente.get().calcularHorasSemanales();
    }

@Override
    public String toString() {
        return "Carrera nombre=" + nombre + ", direccion=" + direccion + ", nit=" + nit + ", listaMaterias="
                + listaMaterias + ", listaProfesores=" + listaProfesores + ", listaEstudiantes=" + listaEstudiantes;
    }

  }
