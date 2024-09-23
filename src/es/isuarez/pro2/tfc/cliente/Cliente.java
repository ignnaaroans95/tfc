package es.isuarez.pro2.tfc.cliente;

import es.isuarez.pro2.tfc.bicicleta.Bicicleta;

/**
 * Clase que representa a un cliente en el sistema.
 * Contiene información del cliente, como su nombre, apellidos,
 * dirección y bicicleta preferida.
 * Además, se implementa un identificador único autoincremental para cada cliente.
 */
public class Cliente {

    private String nombre;
    private String apellidos;

    /**
     * Variable estática que lleva el registro del último ID generado
     * y garantiza que cada cliente tenga un identificador único.
     */
    private static int contador = 0;
    private int id;

    /**
     * Dirección del cliente, agregada por composición.
     */
    private Direccion direccion;

    /**
     * Bicicleta preferida del cliente, agregada por composición.
     */
    private Bicicleta bPreferida;

    /**
     * Constructor de la clase Cliente.
     * Inicializa el nombre, apellidos, dirección y bicicleta preferida del cliente,
     * y asigna automáticamente un identificador único autoincremental.
     *
     * @param nombre Nombre del cliente.
     * @param apellidos Apellidos del cliente.
     * @param direccion Dirección del cliente.
     * @param bPreferida Bicicleta preferida del cliente.
     */
    public Cliente(String nombre, String apellidos, Direccion direccion, Bicicleta bPreferida) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = ++contador;  // Incrementa y asigna el nuevo ID.
        this.direccion = direccion;
        this.bPreferida = bPreferida;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre Nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos del cliente.
     *
     * @return Apellidos del cliente.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del cliente.
     *
     * @param apellidos Apellidos a establecer.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene el identificador único del cliente.
     *
     * @return ID del cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del cliente.
     * Este método permite cambiar el ID, aunque no es recomendable
     * hacerlo en un contexto normal ya que el ID debe ser único y autogenerado.
     *
     * @param id ID a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return Dirección del cliente.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion Dirección a establecer.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la bicicleta preferida del cliente.
     *
     * @return Bicicleta preferida del cliente.
     */
    public Bicicleta getbPreferida() {
        return bPreferida;
    }

    /**
     * Establece la bicicleta preferida del cliente.
     *
     * @param bPreferida Bicicleta a establecer.
     */
    public void setbPreferida(Bicicleta bPreferida) {
        this.bPreferida = bPreferida;
    }

    /**
     * Retorna una representación en forma de cadena de los detalles del cliente,
     * incluyendo su nombre, apellidos, ID, bicicleta preferida y dirección.
     *
     * @return Cadena con los detalles del cliente.
     */
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() +
                "\nApellidos: " + this.getApellidos() +
                "\nId: " + this.getId() +
                "\nBicicleta: " + this.getbPreferida() +
                "\nDirección: " + this.getDireccion();
    }

}
