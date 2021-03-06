package modelos;

import modelos.Almacen;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {
    private int identificador;
    private String codigo;
    private String descripcion;
    private LocalDate fechacaducidad;
    private TipoProducto tipoproducto2;
    private Almacen almacen;

    public Producto(int identificador, String codigo, String descripcion, LocalDate fechacaducidad, TipoProducto tipoproducto2, Almacen almacen) {
        this.identificador = identificador;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechacaducidad = fechacaducidad;
        this.tipoproducto2 = tipoproducto2;
        this.almacen = almacen;
    }

    public Producto() {

    }

    public Producto(Producto objProducto) {
        this.identificador = objProducto.identificador;
        this.codigo = objProducto.codigo;
        this.descripcion = objProducto.descripcion;
        this.fechacaducidad = objProducto.fechacaducidad;
        this.tipoproducto2 = objProducto.tipoproducto2;
        this.almacen = objProducto.almacen;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(LocalDate fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public TipoProducto getTipoproducto2() {
        return tipoproducto2;
    }

    public void setTipoproducto2(TipoProducto tipoproducto2) {
        this.tipoproducto2 = tipoproducto2;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return identificador == producto.identificador && Objects.equals(codigo, producto.codigo) && Objects.equals(descripcion, producto.descripcion) && Objects.equals(fechacaducidad, producto.fechacaducidad) && tipoproducto2 == producto.tipoproducto2 && Objects.equals(almacen, producto.almacen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigo, descripcion, fechacaducidad, tipoproducto2, almacen);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "identificador=" + identificador +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechacaducidad=" + fechacaducidad +
                ", tipoproducto2=" + tipoproducto2 +
                ", almacen=" + almacen +
                '}';
    }
}


