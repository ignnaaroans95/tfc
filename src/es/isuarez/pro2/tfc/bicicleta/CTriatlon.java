package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.bicicleta.enums.Color;
import es.isuarez.pro2.tfc.bicicleta.enums.Fabricante;
import es.isuarez.pro2.tfc.bicicleta.enums.Material;

public class CTriatlon extends Carretera{
    /**
     * Constructor de la clase con todos los atributos heredados de la clase padre y su específico
     * correspondiente
     *
     * @param talla
     * @param disponible
     * @param pesoCuadro
     * @param precio
     * @param id
     * @param ultimoId
     * @param fabricante
     * @param material
     * @param color
     * @param pesoTotal
     */
    public CTriatlon(String talla, boolean disponible, String pesoCuadro, double precio, int id, int ultimoId, Fabricante fabricante, Material material, Color color, float pesoTotal) {
        super(talla, disponible, pesoCuadro, precio, id, ultimoId, fabricante, material, color, pesoTotal);
    }
}
