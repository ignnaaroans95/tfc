package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.CantidadPlatos;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.Color;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.Fabricante;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.Material;
import es.isuarez.pro2.tfc.bicicleta.enums.persona.Sexo;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla.DiametroRueda;
import es.isuarez.pro2.tfc.bicicleta.enums.tipoMTB.*;


public class Mtb extends Bicicleta{


/***En este caso nos cevolverá  así como el diámetro de la rueda y la cantidad de platos el tipo de mtb,  los cuales,
 *  serán devuelto como una constante, ya que son  tipos diferenciados y todos están estandarizados ..*/


    private CantidadPlatos platos;
    private DiametroRueda diametroRueda;
    protected tipoMTB mtb;



    /**
     * Constructor de la clase.Hereda todos los atributos de la clase padre -> Bicicleta . Además está compuesto
     * por los atributos de la clase padre
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
     * @param sexo
     */
    public Mtb(String talla, boolean disponible, String pesoCuadro, double precio, int id, int ultimoId, Fabricante fabricante, Material material, Color color, Sexo sexo, CantidadPlatos platos, DiametroRueda diametroRueda, tipoMTB mtb) {
        super(talla, disponible, pesoCuadro, precio, id, ultimoId, fabricante, material, color, sexo);
        this.platos=platos;
        this.diametroRueda=diametroRueda;
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
     * Nos retornará el diámetro de la rueda como una constante
     * @return
     */
    public DiametroRueda getDiametroRueda() {
        return diametroRueda;
    }
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
