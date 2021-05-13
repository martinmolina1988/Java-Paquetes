package paquete;

import java.util.List;

public class Separo {

    public Separo() {
    }

    List lista;

    Carton carton;
//Toma un string los separa con el metodo split por espacios, y almacena en un array los valores devueltos

    public Paquete primerFila(String fila) {
        String primer[] = fila.split(" ");
        //Se crea un objeto de tipo paquete, casteando los valores del array de string
        Paquete paquete = new Paquete(Integer.parseInt(primer[0]), Integer.parseInt(primer[1]), Integer.parseInt(primer[2]), Integer.parseInt(primer[3]));
        return paquete;
    }

    public Carton separoCarton(String fila) {
        String primer[] = fila.split(" ");
        Carton reina = new Carton(Integer.parseInt(primer[0]), Integer.parseInt(primer[1]), Integer.parseInt(primer[2]));
        return reina;
    }

}
