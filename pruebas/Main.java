package pruebas;

import componente.Componente;
import excepciones.AekiException;
import mueble.Mueble;

/**
 *
 * @author miriu
 */
public class Main {

    public static void main(String[] args) {
        try {
            Componente nuevo = new Componente(15, "Prueba", "Madera", 9);
            System.out.println(nuevo);
            nuevo.setCantidad(5);
            System.out.println(nuevo);
            Mueble silla = new Mueble(1, "Silla A");
            System.out.println(silla);
            silla.setModelo("Silla C");
            System.out.println(silla);

        } catch (AekiException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
