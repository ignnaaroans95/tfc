package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.*;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla.DiametroRuedaBicicleta;
import es.isuarez.pro2.tfc.bicicleta.enums.persona.Genero;


/**
 * Clase principal,cuyos artículos serñan gestionados por la tienda
 * De dicha clase , heredarán los tipos disponibles de la tienda.
 * En lo referente a los atributos, agruparemos las marcas en una ENUM ,
 * así como el material y el color en sus correspondientes agrupaciones.
 * El precio, será un tipo double, ya que manejará decimales
 **/

public class Bicicleta {
    private String talla;
    private boolean disponible;
    private String pesoCuadro;
    private double precio;

    /**
     * La idea es crear un id autoincremental del id del artículo a través del constructor
     **/
    private int id;
    private int ultimoId;
    /**
     * Estos atributos irán agrupados en constantes ENUMS,puesto que son características
     * innmutables de los propios artículos.
     **/
    private Fabricante fabricante;
    private DiametroRuedaBicicleta diametroRueda;
    private Material material;
    private Color color;
    private Genero genero;


    /**
     * Constructor de la clase.
     **/

    public Bicicleta(String talla, boolean disponible, String pesoCuadro, double precio, int id, int ultimoId,
                     Fabricante fabricante,DiametroRuedaBicicleta diametroRueda, Material material, Color color, Genero genero) {
        this.talla = talla;
        this.disponible = disponible;
        this.pesoCuadro = pesoCuadro;
        this.precio = precio;
        this.id = ++ultimoId;
        this.fabricante = fabricante;
        this.diametroRueda = diametroRueda;
        this.material = material;
        this.color = color;
        this.genero = genero;
    }


    /**
     * @return isDisponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * @param disponible
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @returnUltimoId
     */
    public int getUltimoId() {
        return ultimoId;
    }

    /**
     * @param ultimoId
     */
    public void setUltimoId(int ultimoId) {
        this.ultimoId = ultimoId;
    }

    /**
     * @return talla
     */
    public String getTalla() {
        return talla;
    }

    /**
     * @param talla
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * @return pesoCuadro
     */
    public String getPesoCuadro() {
        return pesoCuadro;
    }

    /**
     * @param pesoCuadro
     */
    public void setPesoCuadro(String pesoCuadro) {
        this.pesoCuadro = pesoCuadro;
    }

    /**
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return fabricante
     */
    public Fabricante getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante
     */
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return material
     */
    public Material getMaterial() {
        return material;
    }

    public DiametroRuedaBicicleta getDiametroRueda() {
        return diametroRueda;
    }

    public void setDiametroRueda(DiametroRuedaBicicleta diametroRueda) {
        this.diametroRueda = diametroRueda;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * @param material
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * @return color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color
     */

    public void setColor(Color color) {
        this.color = color;
    }


    /**
     * Método que nos devuelve impresos todos los atributos del artículo.
     ***/

    @Override
    public String toString() {

        return "Datos del artículo: " + "\nTalla de la bicicleta: " + this.getTalla() +
                "\nPeso del cuadro: " + this.getPesoCuadro() +
                "\nPrecio: " + this.getPrecio() +
                "\nId: " + this.getId() +
                "\nUltimo Id: " + this.getUltimoId() +
                "\nFabricante: " + this.getFabricante() +
                "\nDiametro de la rueda: " + this.getDiametroRueda() +
                "\nMaterial: " + this.getMaterial() +
                "\nColor: " + this.getColor() +
                "\nGénero: " + this.getGenero();


    }


}






