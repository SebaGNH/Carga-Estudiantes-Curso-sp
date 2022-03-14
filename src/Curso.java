public class Curso {
    Estudiante [] estudiantes;
    
    Curso(int cantEstudiantes){
        estudiantes = new Estudiante[cantEstudiantes];
    }
    
    //Agregar Estudiantes
    public void agregarEstudiante(Estudiante e){
        for (int i = 0; i < estudiantes.length; i++) {
            if(estudiantes[i] == null){
                estudiantes[i] = e;
                break;
            }
        }
    }
    
    
    //Hacer un método que devuelva el PromedioGeneral del Curso.
    public float getPromedioGeneral(){
        float promedioGeneral = 0f;
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if(estudiante != null){
                promedioGeneral += estudiante.getPromedio();
                contador ++;
            }
        }    
        return promedioGeneral / contador;
    }
    
    
}
