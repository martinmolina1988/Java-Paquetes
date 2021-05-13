package paquete;

public class Paquete {

    int altura;
    int ancho;
    int largo;
    int cantidad;

    public Paquete(int largo, int ancho, int altura, int cantidad) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
        this.cantidad = cantidad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
