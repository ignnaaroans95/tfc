package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.bicicleta.enums.Color;
import es.isuarez.pro2.tfc.bicicleta.enums.Fabricante;
import es.isuarez.pro2.tfc.bicicleta.enums.Material;
import es.isuarez.pro2.tfc.bicicleta.enums.Sexo;

public class Carretera extends Bicicleta {


    private float PesoTotal;

    /**
     * Constructor de la clase con todos los atributos heredados de la clase padre y su específico
     * correspondiente
     **/
    public Carretera(String talla, boolean disponible, String pesoCuadro,
                     double precio, int id, int ultimoId, Fabricante fabricante,
                     Material material, Color color, Sexo sexo, float pesoTotal) {
        super(talla, disponible, pesoCuadro, precio, id, ultimoId, fabricante, material, color, sexo);
        PesoTotal = pesoTotal;
    }

    /**
     * Obtiene el valor del peso total de la bicicleta.
     *
     * @return el peso total de la bicicleta.
     */
    public float getPesoTotal() {
        return PesoTotal;
    }

    /**
     * Asigna el valor de la bicicleta en caso de que sea necesario
     *
     * @param pesoTotal el nuevo valor para el peso total.
     */

    public void setPesoTotal(float pesoTotal) {
        PesoTotal = pesoTotal;
    }

    /**
     * Método toString() con validador implementado para evitar el NullPointerExceotion.En caso
     * de que el valor sea nulo
     **/
    @Override
    public String toString() {
        try {

            if (this.getPesoTotal() == Float.parseFloat(null)) {
                return "Peso total no disponible";
            }

            return super.toString() + "Peso total de la bicicleta: " + this.getPesoTotal();
        } catch (NullPointerException e) {
            // Capturar y manejar la excepción
            return "Error: No se ha podido obtener el peso de la bicicleta";
        }
    }


}
