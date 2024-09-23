package es.isuarez.pro2.tfc.cliente;

/**
 * Clase que representa una dirección postal.
 * Contiene información sobre la calle, número, código postal, localidad y ciudad.
 */
public class Direccion {

    private String calle;
    private int numero;
    private int cP;  // Código postal.
    private String localidad;
    private String ciudad;

    /**
     * Constructor de la clase Direccion.
     * Inicializa todos los campos de la dirección.
     *
     * @param calle Nombre de la calle.
     * @param numero Número de la calle.
     * @param cP Código postal.
     * @param localidad Localidad o barrio de la dirección.
     * @param ciudad Ciudad de la dirección.
     */
    public Direccion(String calle, int numero, int cP, String localidad, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.cP = cP;
        this.localidad = localidad;
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el nombre de la calle.
     *
     * @return Nombre de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el nombre de la calle.
     *
     * @param calle Nombre de la calle a establecer.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el número de la calle.
     *
     * @return Número de la calle.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el número de la calle.
     *
     * @param numero Número a establecer.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el código postal.
     *
     * @return Código postal.
     */
    public int getcP() {
        return cP;
    }

    /**
     * Establece el código postal.
     *
     * @param cP Código postal a establecer.
     */
    public void setcP(int cP) {
        this.cP = cP;
    }

    /**
     * Obtiene la localidad o barrio.
     *
     * @return Localidad de la dirección.
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Establece la localidad o barrio.
     *
     * @param localidad Localidad a establecer.
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Obtiene la ciudad.
     *
     * @return Ciudad de la dirección.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece la ciudad.
     *
     * @param ciudad Ciudad a establecer.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Retorna una representación en forma de cadena de la dirección,
     * incluyendo calle, número, código postal, localidad y ciudad.
     *
     * @return Cadena con los detalles de la dirección.
     */
    @Override
    public String toString() {
        return "Calle: " + this.getCalle() +
                "\nNúmero: " + this.getNumero() +
                "\nCódigo Postal: " + this.getcP() +
                "\nLocalidad: " + this.getLocalidad() +
                "\nCiudad: " + this.getCiudad();
    }

}
