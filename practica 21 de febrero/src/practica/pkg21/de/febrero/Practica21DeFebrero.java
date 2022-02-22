/*
1.REFACTORIZACIÓN (4 ptos)

·  Añadir un parámetro cash  al método  GMonedero  de tipo
   double y con un valor por defecto 2500.

2.     GIT  (4 ptos)

Crea un repositorio Git para el proyecto tarea4 en la propia
carpeta donde lo tengas. Crea un repositorio público en GitHub.
Realiza una operación commit.
Copia el código siguiente dentro del módulo Gmonedero, 
que se hizo anteriormente  y guarda el proyecto.
try {

    System.out.println(" Modificación 1");

    mimonedero.recargar(200);

} catch (Exception e) {

    System.out.print("Ha fallado la recarga");

}

Muestra con Git/Show-Changes los cambios producidos en el fichero
Main.java,  explora y comenta el resultado.
Realiza otra modificación sobre el proyecto, 
p.e: hacer una recarga de 10 y etiquétala con el mensaje
Modificación 2. Haz un commit. 

Muestra con Git/Show-Changes los cambios producidos en el fichero
Main.java,  explora y comenta el resultado.

 

3.     JAVADOC (2 ptos)

Inserta comentarios Javadoc en la clase Emonedero.

Genera documentación Javadoc para todo el proyecto.

Comprueba y refleja que la documentación generada por Javadoc
abarca todos los métodos y atributos de la clase Emonedero.



Una vez realizada la tarea elaborarás un archivo comprimido con:

Un  documento en formato word donde figuren las respuestas
correspondientes junto a la  explicación de todo el proceso
con las  capturas de pantalla asociadas. En todas las capturas
debe ser posible comprobar la identificación del alumno

Una carpeta donde  debe ir el proyecto completo y los documentos
que se generen .


*/
package practica.pkg21.de.febrero;

public class Practica21DeFebrero {

    
public class Main { 

    public void main(String[] args) {

        Emonedero mycash;

        double dinero;

        mycash = new Emonedero("Nombre y apellidos del Alumno",500, "dni del alumno");

        try 

        {

            mycash.pagar(200);

        } catch (Exception e)

        {

            System.out.print("No se puede pagar  ");

        }

        try

        {

            System.out.println("Debes recargar monedero");

                GMonedero(mycash);

        } catch (Exception e)

        {

            System.out.print("Error al recargar");

        }

        double SDisp = mycash.efectivo();

        System.out.println("El efectivo del monedero es  "+ SDisp );

    }

        public void GMonedero(Emonedero mycash) throws Exception {
            mycash.recargar(300);
            try {
	 System.out.println(" Modificación 1");
	 mycash.recargar(200);
        } catch (Exception e) {
	System.out.print("Ha fallado la recarga");
        }
        }

}
    
}
