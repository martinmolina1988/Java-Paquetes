package paquete;

import java.io.FileWriter;

/**
 *
 * Esta clase solo recibe el arraylist de la clase procesar y lo imprime en el
 * fichero de salida
 *
 */
public class EscribirArchivo {

    private FileWriter salida;
    Proceso proceso = new Proceso();

    public void escribir() {

        try {
            //Se crea el fichero de salida en la ruta especificada
            salida = new FileWriter("c:/ficheros/paquetes/paquetes.out");
            int[] respuesta = proceso.proceso();

            salida.write(respuesta[0] + "\r\n");
            salida.write(respuesta[1] + "\r\n");

            salida.close();
        } catch (Exception e) {
        }
    }

}
