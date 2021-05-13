package testPaquetes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase LeerTest tiene un metodo leerTest que lee el fichero test.in y lo
 * convierte en un arrayList y lo devuelve en ese formato
 *
 */
public class LeerTest {

    private FileReader entrada;
    private List listaTest = new ArrayList<>();

    public List<String> leerTest(String url) throws IOException {

        try {
            entrada = new FileReader(url);
            //Guarda en miBuffer una copia del archivo
            BufferedReader miBuffer = new BufferedReader(entrada);

            String linea = "";

            while (linea != null) {
                linea = miBuffer.readLine();

                //Si llego a null es por que finalizo el recorrido por el fichero
                if (linea != null) {
                    this.listaTest.add(linea);

                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.listaTest;
    }
}
