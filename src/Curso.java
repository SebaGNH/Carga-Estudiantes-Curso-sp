
import java.util.ArrayList;

public class Curso {
    //Estudiante [] estudiantes;
    ArrayList <Persona> estudiantes;
    
    public Curso(){
        estudiantes = new ArrayList();
    }
    
    //Agregar Estudiantes
    public void agregarEstudiante(Persona p){
        estudiantes.add(p);
    }
    
    
    //Hacer un método que devuelva el PromedioGeneral del Curso.
    public float getPromedioGeneral(){
        float acumuladorPromedio = 0f;
        int contador = 0;
        for (Persona estudiante : estudiantes) {
            if(estudiante instanceof Estudiante){
                acumuladorPromedio += ((Estudiante) estudiante).getPromedio();
                contador ++;
            }
        }    
        return acumuladorPromedio / contador;
    }
    
    
}
