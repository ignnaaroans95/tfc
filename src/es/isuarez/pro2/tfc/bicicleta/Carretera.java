package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.*;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla.DiametroRuedaBicicleta;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla.TallaCarretera;
import es.isuarez.pro2.tfc.bicicleta.enums.persona.Genero;

/**
 * La clase {@code Carretera} representa una bicicleta de carretera, que hereda de la clase {@link Bicicleta}.
 * Añade atributos específicos para este tipo de bicicleta como el peso total y la talla de carretera.
 */
public class Carretera extends Bicicleta {

    /**
     * Peso total de la bicicleta de carretera.
     */
    private float pesoTotal;

    /**
     * Talla específica para bicicletas de carretera, basada en la enumeración {@link TallaCarretera}.
     */
    private TallaCarretera tallaCarretera;

    /**
     * Constructor de la clase {@code Carretera}. Hereda los atributos de la clase {@link Bicicleta}
     * y añade los atributos específicos de bicicletas de carretera.
     *
     * @param talla          la talla general de la bicicleta
     * @param disponible     si la bicicleta está disponible para la venta
     * @param pesoCuadro     el peso del cuadro de la bicicleta
     * @param precio         el precio de la bicicleta
     * @param id             el identificador único de la bicicleta
     * @param ultimoId       el último identificador utilizado
     * @param fabricante     el fabricante de la bicicleta
     * @param diametrorueda  el diámetro de las ruedas de la bicicleta
     * @param material       el material del cuadro de la bicicleta
     * @param color          el color de la bicicleta
     * @param genero         el género para el cual está diseñada la bicicleta
     * @param pesoTotal      el peso total de la bicicleta
     * @param tallaCarretera la talla específica para bicicletas de carretera
     */
    public Carretera(String talla, boolean disponible, String pesoCuadro, double precio, int id, int ultimoId,
                     Fabricante fabricante, DiametroRuedaBicicleta diametrorueda, Material material, Color color,
                     Genero genero, float pesoTotal, TallaCarretera tallaCarretera) {
        super(talla, disponible, pesoCuadro, precio, id, ultimoId, fabricante, diametrorueda, material, color, genero);
        this.pesoTotal = pesoTotal;
        this.tallaCarretera = tallaCarretera;
    }

    /**
     * Obtiene el peso total de la bicicleta de carretera.
     *
     * @return el peso total de la bicicleta.
     */
    public float getPesoTotal() {
        return pesoTotal;
    }

    /**
     * Establece un nuevo valor para el peso total de la bicicleta.
     *
     * @param pesoTotal el nuevo valor para el peso total.
     */
    public void setPesoTotal(float pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    /**
     * Obtiene la talla específica de la bicicleta de carretera.
     *
     * @return un valor de {@link TallaCarretera} que indica la talla de la bicicleta.
     */
    public TallaCarretera getTallaCarretera() {
        return tallaCarretera;
    }

    /**
     * Establece la talla específica de la bicicleta de carretera.
     *
     * @param tallaCarretera la talla de la bicicleta, basada en {@link TallaCarretera}.
     */
    public void setTallaCarretera(TallaCarretera tallaCarretera) {
        this.tallaCarretera = tallaCarretera;
    }

    /**
     * Método sobrescrito que devuelve una representación en cadena de los datos de la bicicleta de carretera,
     * incluyendo los atributos heredados de {@link Bicicleta} y los propios de la clase {@code Carretera}.
     * Se implementa un manejador para evitar un {@link NullPointerException} si alguno de los valores es nulo.
     *
     * @return una cadena que representa la información detallada de la bicicleta de carretera.
     */
    @Override
    public String toString() {
        try {
            // Validación para evitar errores en caso de valor nulo
            if (this.getPesoTotal() == Float.parseFloat(null)) {
                return "Peso total no disponible";
            }

            return super.toString() + "\nPeso total de la bicicleta: " + this.getPesoTotal() +
                    "\nTalla de la bicicleta: " + this.getTallaCarretera();
        } catch (NullPointerException e) {
            // Captura de la excepción en caso de que algún valor no esté inicializado
            return "Error: No se ha podido obtener el peso de la bicicleta";
        }
    }
}
