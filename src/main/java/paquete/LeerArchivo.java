package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase toma el archivo en la ruta especifica y devuelve en su metodo
 * leerArchivo un objeto de tipo Listas donde en el se almacenan los principales
 * datos del ejercicio
 *
 *
 */
public class LeerArchivo {

    private FileReader entrada;

    public LeerArchivo() {
    }

    List<String> lista = new ArrayList<>();

    public List<String> leerArchivo() throws IOException {

        try {

            entrada = new FileReader("c:/ficheros/paquetes/saturacion.in");
            //Guarda en miBuffer una copia del archivo
            BufferedReader miBuffer = new BufferedReader(entrada);

            String linea = "";

            while (linea != null) {
                linea = miBuffer.readLine();
                //Si llego a null es por que finalizo el recorrido por el fichero
                if (linea != null) {
                    lista.add(linea);

                }

            }

            //Se cierra el fichero
            entrada.close();
        } catch (IOException e) {
            System.out.println("El fichero no existe");
        }

        // Retorna el objero listas donde se guardaron todos los datos
        return lista;
    }

}
