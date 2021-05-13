/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPaquetes;

import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author martin
 */
public class TestPaquetes {

    @Test
    public void testJuego() throws IOException {
        String urlTest = "c:/ficheros/paquetes/test.in";
        String urlSalida = "c:/ficheros/paquetes/paquetes.out";
        LeerTest leerTest = new LeerTest();
        List listaTest = leerTest.leerTest(urlTest);
        List listaSalida = leerTest.leerTest(urlSalida);
        for (int i = 0; i < listaTest.size(); i++) {
            System.out.println(listaTest.get(i) + " | " + listaSalida.get(i));
            assertEquals(listaTest.get(i), listaSalida.get(i));
        }

    }

}
