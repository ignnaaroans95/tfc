package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.*;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla.DiametroRuedaBicicleta;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla.TallaMTB;
import es.isuarez.pro2.tfc.bicicleta.enums.persona.Genero;
import es.isuarez.pro2.tfc.bicicleta.enums.tipoMTB.*;

/**
 * La clase {@code Mtb} representa una bicicleta de montaña, que hereda de la clase {@link Bicicleta}.
 * Incluye atributos específicos para bicicletas de montaña como la cantidad de platos, el tipo de MTB, y la talla específica.
 */
public class Mtb extends Bicicleta {

    /**
     * Atributo que define la cantidad de platos de la bicicleta de montaña.
     */
    private CantidadPlatos platos;

    /**
     * Atributo que define el tipo de bicicleta de montaña, basado en la enumeración {@link tipoMTB}.
     */
    protected tipoMTB mtb;

    /**
     * Atributo que define la talla específica para bicicletas de montaña, basado en la enumeración {@link TallaMTB}.
     */
    private TallaMTB tallaMtb;

    /**
     * Constructor de la clase {@code Mtb}. Hereda los atributos de la clase padre {@link Bicicleta}
     * y define los atributos propios de las bicicletas de montaña.
     *
     * @param talla        la talla general de la bicicleta
     * @param disponible   si la bicicleta está disponible para la venta
     * @param pesoCuadro   el peso del cuadro de la bicicleta
     * @param precio       el precio de la bicicleta
     * @param id           el identificador único de la bicicleta
     * @param ultimoId     el último identificador utilizado
     * @param fabricante   el fabricante de la bicicleta
     * @param material     el material del cuadro de la bicicleta
     * @param color        el color de la bicicleta
     * @param genero       el género para el cual está diseñada la bicicleta
     * @param platos       la cantidad de platos de la bicicleta
     * @param diametroRueda el diámetro de las ruedas de la bicicleta
     * @param mtb          el tipo de bicicleta de montaña
     * @param tallaMtb     la talla específica para bicicletas de montaña
     */
    public Mtb(String talla, boolean disponible, String pesoCuadro, double precio, int id, int ultimoId,
               Fabricante fabricante, Material material, Color color, Genero genero, CantidadPlatos platos,
               DiametroRuedaBicicleta diametroRueda, tipoMTB mtb, TallaMTB tallaMtb) {
        super(talla, disponible, pesoCuadro, precio, id, ultimoId, fabricante, diametroRueda, material, color, genero);
        this.platos = platos;
        this.mtb = mtb;
        this.tallaMtb = tallaMtb;
    }

    /**
     * Devuelve la cantidad de platos de la bicicleta de montaña.
     *
     * @return un valor de {@link CantidadPlatos} que indica la cantidad de platos.
     */
    public CantidadPlatos getPlatos() {
        return platos;
    }

    /**
     * Establece la cantidad de platos de la bicicleta de montaña.
     *
     * @param platos el número de platos, basado en {@link CantidadPlatos}.
     */
    public void setPlatos(CantidadPlatos platos) {
        this.platos = platos;
    }

    /**
     * Devuelve el tipo de bicicleta de montaña.
     *
     * @return un valor de {@link tipoMTB} que indica el tipo de MTB.
     */
    public tipoMTB getMtb() {
        return mtb;
    }

    /**
     * Establece el tipo de bicicleta de montaña.
     *
     * @param mtb el tipo de bicicleta, basado en {@link tipoMTB}.
     */
    public void setMtb(tipoMTB mtb) {
        this.mtb = mtb;
    }

    /**
     * Devuelve la talla específica para bicicletas de montaña.
     *
     * @return un valor de {@link TallaMTB} que indica la talla de la MTB.
     */
    public TallaMTB getTallaMtb() {
        return tallaMtb;
    }

    /**
     * Establece la talla específica para bicicletas de montaña.
     *
     * @param tallaMtb la talla de la bicicleta, basada en {@link TallaMTB}.
     */
    public void setTallaMtb(TallaMTB tallaMtb) {
        this.tallaMtb = tallaMtb;
    }

    /**
     * Método sobrescrito que devuelve una representación en cadena de los datos de la bicicleta de montaña,
     * incluyendo los atributos heredados de {@link Bicicleta} y los propios de la clase {@code Mtb}.
     *
     * @return una cadena que representa la información detallada de la bicicleta de montaña.
     */
    @Override
    public String toString() {
        return super.toString() + "\nPlatos: " + this.getPlatos() +
                "\nDiámetro de la rueda: " + this.getDiametroRueda() +
                "\nTipo de MTB: " + this.mtb +
                "\nTalla: " + this.getTallaMtb();
    }
}
