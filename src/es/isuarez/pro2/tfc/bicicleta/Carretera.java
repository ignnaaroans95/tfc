package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.*;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla.DiametroRuedaBicicleta;
import es.isuarez.pro2.tfc.bicicleta.enums.persona.Genero;

public class Carretera extends Bicicleta {


    private float pesoTotal;

    /**
     * Constructor de la clase con todos los atributos heredados de la clase padre y su específico
     * correspondiente
     **/
    public Carretera(String talla, boolean disponible, String pesoCuadro,
                     double precio, int id, int ultimoId, Fabricante fabricante, DiametroRuedaBicicleta diametrorueda,
                     Material material, Color color, Genero genero, float pesoTotal) {
        super(talla, disponible, pesoCuadro, precio, id, ultimoId, fabricante,diametrorueda, material, color, genero);
        this.pesoTotal = pesoTotal;
    }

    /**
     * Obtiene el valor del peso total de la bicicleta.
     *
     * @return el peso total de la bicicleta.
     */
    public float getPesoTotal() {
        return pesoTotal;
    }

    /**
     * Asigna el valor de la bicicleta en caso de que sea necesario
     *
     * @param pesoTotal el nuevo valor para el peso total.
     */

    public void setPesoTotal(float pesoTotal) {
        pesoTotal = pesoTotal;
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
