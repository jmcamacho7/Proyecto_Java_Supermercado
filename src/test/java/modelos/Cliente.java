package modelos;

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
}