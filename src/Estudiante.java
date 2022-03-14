public class Estudiante extends Persona{
    
    private float promedio;

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    
    //Constructor Estudiante
    public Estudiante(String nombre, int edad, boolean sexo,float promedio) {
        super( nombre,edad,sexo );
        this.promedio = promedio;
    }
    
    
    //toString Estudiante
    @Override
    public String toString() {
        return "Estudiante = " + " promedio: " + promedio;
    }   
}
