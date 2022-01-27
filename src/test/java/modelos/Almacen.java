package modelos;

public class Almacen {
    private int identificador;
    private String nombre;
    private int capacidad;

    public Almacen(int identificador, String nombre, int capacidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public Almacen() {

    }

    public Almacen(Almacen objAlmacen) {
        this.identificador = objAlmacen.identificador;
        this.nombre = objAlmacen.nombre;
        this.capacidad = objAlmacen.capacidad;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
