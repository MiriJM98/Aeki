package componente;

import excepciones.AekiException;

/**
 *
 * @author miriu
 */
public class Componente {

    private Integer idComponente;
    private String nombreComponente;
    private String material;
    private Integer cantidad;

    public Componente(Integer idComponente, String nombreComponente, String material, Integer cantidad) throws AekiException {
        setIdComponente(idComponente);
        setNombreComponente(nombreComponente);
        setMaterial(material);
        setCantidad(cantidad);
    }

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) throws AekiException {
        if (idComponente < 0) {
            throw new AekiException("El id del componente no puede ser un número negativo");
        }
        this.idComponente = idComponente;
    }

    public String getNombreComponente() {
        return nombreComponente;
    }

    public void setNombreComponente(String nombreComponente) throws AekiException {
        if (nombreComponente.isEmpty()) {
            throw new AekiException("El nombre del componente no puede estar vacío");
        }
        this.nombreComponente = nombreComponente;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) throws AekiException {
        if (material.isEmpty()) {
            throw new AekiException("El material no puede estar vacío");
        }
        this.material = material;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) throws AekiException {
        if (cantidad < 0) {
            throw new AekiException("La cantidad del componente no puede ser negativa");
        }
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Componente{" + "idComponente=" + idComponente + ", nombreComponente=" + nombreComponente + ", material=" + material + ", cantidad=" + cantidad + '}';
    }
}
