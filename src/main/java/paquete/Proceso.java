package paquete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Proceso {

    //En "listaObjetos" se almacenan todos los objetos de tipo "Carton"
    ArrayList<Object> listaObjetos = new ArrayList<>();

    //Se va a utilizar para separar cada linea del arraylist generado por el metodo "leerArchivo()"
    Separo separo = new Separo();

    public int[] proceso() throws IOException {

        LeerArchivo leer = new LeerArchivo();
        List lista = leer.leerArchivo();
// Creo una instancia "paquete" donde se almacenara un objeto de tipo "Paquete"
        Paquete paquete = separo.primerFila((String) lista.get(0));

        for (int i = 1; i <= paquete.getCantidad(); i++) {
            //Se crean los objetos de tipo "Carton" y luego se almacenan en "listaObjetos"
            Carton carton = separo.separoCarton((String) lista.get(i));
            listaObjetos.add(carton);
        }

        int rotados = 0;
        int cantidadDePaquetes = 0;
        int sumatoria = 0;
        int[] respuesta = new int[2];

        for (int i = 0; i < listaObjetos.size(); i++) {
            //Tomo cada objeto de la lista y pregunto si su ancho supera al ancho del paquete, de ser verdadero se suma en 1 la variable rotados
            Carton carton = (Carton) listaObjetos.get(i);
            if (carton.getAncho() >= paquete.getAncho()) {
                rotados++;
            }

            //Cada vez que entra al for se suma en el acumulador sumatoria la suma de las alturas de los cartones
            sumatoria += carton.getAltura();

            if (sumatoria > paquete.getAltura()) {
                //Si la sumatoria supera a la altura del paquete se incrementa en 1 la cantidad de paquetes
                cantidadDePaquetes++;
                //Si la sumatoria es igual a la altura del paquete se resetea la sumatoria
                if (sumatoria == paquete.getAltura()) {
                    sumatoria = 0;
                } else if (sumatoria > paquete.getAltura()) {
                    //En caso de que la sumatoria supere a la altura, la sumatoria toma el valor de la altura del carton de la iteracion
                    sumatoria = carton.getAltura();
                }

            }
        }

        //Pasado el for, si el resto sigue teniendo valor, quiere decir que se utiliza para un paquete mas
        if (sumatoria > 0) {
            cantidadDePaquetes++;

        }

        respuesta[0] = rotados;
        respuesta[1] = cantidadDePaquetes;

        return respuesta;
    }

}
