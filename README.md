#Curso

En un proyecto nuevo haga la clase persona con los siguientes atributos:
•	Nombre
•	Edad
•	Sexo


-Haga una Clase llamada Estudiante, que herede de Persona y Agréguele el atributo de tipo float Promedio.

-Que la clase Persona quede como Abstracta.

-Hacer una clase Curso:

-Cree un ArrayList estudiantes;

-Un constructor.

-Un método void AgregarEstudiante(Persona p){estudiantes.add(p);}

-Hacer un método que devuelva el PromedioGeneral del Curso.



-Crear una interface grafica para cargar Personas, 
    cada vez que se cargue una Persona tiene que aparecer un MensajeBox que indique que la cargar fue exitosa 
    y concatenar con el toString() de Persona.

-Luego, al aceptar el cuadro de dialogo se deben Limpiar los campos y darle foco a la primera caja de texto.
(this.txtNombre.getFocus())

-Mostrar en una label(etiqueta) el Promedio General del curso: El promedio General es:”   “. (+curso.PromedioGeneral()).

-Agregarle la función ValidarCampos() para que no se pueda cargar si falta rellenar algún campo.
