package co.edu.uniquindio.poo.app;
import co.edu.uniquindio.poo.model.*;

public class App {
    public static void main(String[] args) {
    Carrera carrera1 = new Carrera("Ingenieria de Sistemas", "Armenia", "12345");

    ProfesorPlanta profesorPlanta = new ProfesorPlanta("Juan Perez", 123456789, "Ingeniero", 5, carrera1, TipoTiempoTrabajo.TIEMPOCOMPLETO, true);
    ProfesorCatedra profesorCatedra = new ProfesorCatedra("Ana Gomez", 987654321, "Licenciada", 3, carrera1, 20, false);

    System.out.println(carrera1.agregarProfesor(profesorCatedra));
    System.out.println(carrera1.agregarProfesor(profesorPlanta));
    System.out.println(carrera1.agregarProfesor(profesorCatedra));

    MateriaPractica materiaPractica = new MateriaPractica(101, "Programacion I", 4, 3, 1, carrera1, null, 2, 1);
    MateriaTeorica materiaTeorica = new MateriaTeorica(102, "Matematicas I", 3, 3, 1, carrera1, null);

    System.out.println(carrera1.agregarMateria(materiaPractica));
    System.out.println(carrera1.agregarMateria(materiaTeorica));

    System.out.println(carrera1.asignarProfesorMateria(101, 123456789));
    System.out.println(carrera1.asignarProfesorMateria(102, 987654321));

    EstudiantePregrado estudiante1 = new EstudiantePregrado(111222333, "Carlos Lopez", "E001", "Programa Diurno", 1, carrera1, false, 3.5);
    EstudiantePosgrado estudiante2 = new EstudiantePosgrado(222333444, "Maria Gomez", "E002", "Programa Nocturno", 1, carrera1, TipoEstudioPosgrado.MAESTRIA, "Inteligencia Artificial");

    System.out.println(carrera1.agregarEstudiante(estudiante1));
    System.out.println(carrera1.agregarEstudiante(estudiante2));

    System.out.println(carrera1.inscribirEstudianteMateria(estudiante1.getIdentificador(), 101));
    System.out.println(carrera1.inscribirEstudianteMateria(estudiante2.getIdentificador(), 102));
    System.out.println(carrera1.inscribirEstudianteMateria(estudiante1.getIdentificador(), 102));

    System.out.println("\n MATERIAS SEMESTRE 1:");
    carrera1.materiasSemestreEspecifico(1).forEach(System.out::println);

    System.out.println("\n ESTUDIANTES INSCRITOS EN 102:");
    carrera1.listarEstudiantesMateria(102).forEach(System.out::println);

    System.out.println("\n HORAS SEMANALES EN 102:");
    System.out.println(carrera1.calcularHorasSemanalesMateria(102));

    System.out.println("\n MATERIAS DICTADAS POR: " + profesorCatedra.getNombre());
    profesorCatedra.getListaMaterias().forEach(System.out::println);
    }
}
