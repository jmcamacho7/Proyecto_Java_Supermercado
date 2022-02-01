import modelos.Almacen;
import modelos.Cliente;
import modelos.Producto;

import java.sql.SQLOutput;

public class PruebaV1 {
    public static void main(String[] args) {
       Producto objproducto = new Producto();
        System.out.println(objproducto.toString());

        Almacen objalmacen = new Almacen();
        System.out.println(objalmacen.toString());

        Cliente objcliente = new Cliente();
        System.out.println(objcliente.toString());



    }
}
