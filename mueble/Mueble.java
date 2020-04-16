package mueble;

import componente.Componente;
import excepciones.AekiException;
import java.util.HashSet;

/**
 *
 * @author miriu
 */
public class Mueble {

    private Integer idMueble;
    private String modelo;
    private HashSet<Componente> piezasComponente;

    /*private ArrayDeque<Instrucciones> instruccionesEmpaquetamiento;
     */
    public Mueble(Integer idMueble, String modelo) throws AekiException {
        setIdMueble(idMueble);
        setModelo(modelo);
        piezasComponente = new HashSet();
        /*instruccionesEmpaquetamiento = new ArrayDeque();*/

    }

    public Integer getIdMueble() {
        return idMueble;
    }

    public void setIdMueble(Integer idMueble) throws AekiException {
        if (idMueble < 0) {
            throw new AekiException("El id del mueble no puede ser un número negativo");
        }
        this.idMueble = idMueble;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws AekiException {
        if (modelo.isEmpty()) {
            throw new AekiException("El nombre del modelo no puede estar vacío");
        }
        this.modelo = modelo;
    }

    public HashSet<Componente> getPiezasComponente() {
        return piezasComponente;
    }

    public void setPiezasComponente(HashSet<Componente> piezasComponente) {
        this.piezasComponente = piezasComponente;
    }

    @Override
    public String toString() {
        return "Mueble{" + "idMueble=" + idMueble + ", modelo=" + modelo + ", piezasComponente=" + piezasComponente + '}';
    }
}
