package modelos;

import java.util.Objects;

public class Cliente {
    private int identificador;
    private String dni;
    private String apellidos;
    private String direccion;
    private TipoCliente tipocliente;

    public Cliente(int identificador, String dni, String apellidos, String direccion, TipoCliente tipocliente) {
        this.identificador = identificador;
        this.dni = dni;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.tipocliente = tipocliente;
    }

    public Cliente() {

    }

    public Cliente(Cliente objCliente) {
        this.identificador = objCliente.identificador;
        this.dni = objCliente.dni;
        this.apellidos = objCliente.apellidos;
        this.direccion = objCliente.direccion;
        this.tipocliente = objCliente.tipocliente;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoCliente getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(TipoCliente tipocliente) {
        this.tipocliente = tipocliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return identificador == cliente.identificador && Objects.equals(dni, cliente.dni) && Objects.equals(apellidos, cliente.apellidos) && Objects.equals(direccion, cliente.direccion) && tipocliente == cliente.tipocliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, dni, apellidos, direccion, tipocliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "identificador=" + identificador +
                ", dni='" + dni + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipocliente=" + tipocliente +
                '}';
    }
}