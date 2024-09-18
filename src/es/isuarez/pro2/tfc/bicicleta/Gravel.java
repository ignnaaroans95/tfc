package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.*;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla.DiametroRuedaBicicleta;
import es.isuarez.pro2.tfc.bicicleta.enums.persona.Genero;

public class Gravel extends Bicicleta {

    /**
     * Característica específica de la bicicleta de gravel.
     * He optado por unboolean ya que algunos modelos ofrecen esta característica.
     **/

    private boolean tieneSuspension;

    /***
     *  Constructor de la clase.Hereda todos los atributos de la clase padre -> Bicicleta . Además está compuesto
     *  por los atributos propios de la clase.
     * */

    public Gravel(String talla, boolean disponible, String pesoCuadro, double precio, int id, int ultimoId,
                  Fabricante fabricante, DiametroRuedaBicicleta diametroRueda, Material material, Color color, Genero genero, boolean tieneSuspension) {
        super(talla, disponible, pesoCuadro, precio, id, ultimoId, fabricante, diametroRueda, material, color, genero);

        this.tieneSuspension = tieneSuspension;
    }
    /**
     * @return Método que nos determina si el modeki tiene suspensión o no
     */
    public boolean isTieneSuspension() {
        return tieneSuspension;
    }
    public void setTieneSuspension(boolean tieneSuspension) {
        this.tieneSuspension = tieneSuspension;
    }
    @Override
    public String toString() {

        return super.toString() + "\n¿Este modelo tiene suspensión?" + tieneSuspension;

    }
}
