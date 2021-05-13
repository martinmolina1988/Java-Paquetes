package paquete;

public class Carton {

    int largo;
    int ancho;
    int altura;

    public Carton(int largo, int ancho, int altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
