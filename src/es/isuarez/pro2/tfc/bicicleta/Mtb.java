package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.*;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla.DiametroRuedaBicicleta;
import es.isuarez.pro2.tfc.bicicleta.enums.persona.Genero;
import es.isuarez.pro2.tfc.bicicleta.enums.tipoMTB.*;


public class Mtb extends Bicicleta{


/***En este caso nos cevolverá  así como el diámetro de la rueda y la cantidad de platos el tipo de mtb,  los cuales,
 *  serán devuelto como una constante, ya que son  tipos diferenciados y todos están estandarizados ..*/


    private CantidadPlatos platos;
    protected tipoMTB mtb;



    /**
     * Constructor de la clase.Hereda todos los atributos de la clase padre -> Bicicleta . Además está compuesto
     * por los atributos propios de la clase.
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
     * @param genero
     */
    public Mtb(String talla, boolean disponible, String pesoCuadro, double precio, int id, int ultimoId, Fabricante fabricante, Material material, Color color, Genero genero, CantidadPlatos platos, DiametroRuedaBicicleta diametroRueda, tipoMTB mtb) {
        super(talla, disponible, pesoCuadro, precio, id, ultimoId, fabricante,diametroRueda, material, color, genero);
        this.platos=platos;
        this.mtb=mtb;

    }
    /**
     *
     * @return Nos retorna la cantidad de platos de la bicicleta como una constante.
     */
    public CantidadPlatos getPlatos() {
        return platos;
    }
    /**
     *

    /**
    /***
     *
     * @return el tipo de mountain bike como una constante
     */
    public tipoMTB getMtb() {
        return mtb;
    }

    /**
     *
     *Método de sobreescritura que nos mostrará todos los datos de la clase y clase padre.
     *
     * **/
    @Override
   public String toString(){

        return super.toString() + "\nPlatos: " + this.getPlatos() + "\nDiámetro de la rueda: " + this.getDiametroRueda() +
                "\nTipo de MTB " + this.mtb;


    }
}
