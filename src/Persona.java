public abstract class Persona  {
    private String nombre;
    private int edad;
    private boolean sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
    //Constructor Persona
    public Persona(String nombre, int edad, boolean sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    
    //toString Persona
    @Override
    public String toString() {
        return "Persona =" + " nombre: " + nombre + ", edad: " + edad + ", sexo: " + getSexoString();
    }
    
    public String getSexoString(){        
        if(this.sexo){
            return "Masculino";
        }
        return "Femenino";
    }
}