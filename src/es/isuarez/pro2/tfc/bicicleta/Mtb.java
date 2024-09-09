package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.bicicleta.enums.*;


public class Mtb extends Bicicleta{


/***En este caso nos cevolverá la vantidad de platos así como el diámetro de la rueda*/
    private CantidadPlatos platos;
    private float diametroRueda;



    /**
     * Constructor de la clase.
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
    public Mtb(String talla, boolean disponible, String pesoCuadro, double precio, int id, int ultimoId, Fabricante fabricante, Material material, Color color, Sexo sexo,CantidadPlatos platos,float diametroRueda) {
        super(talla, disponible, pesoCuadro, precio, id, ultimoId, fabricante, material, color, sexo);
        this.platos=platos;
        this.diametroRueda=diametroRueda;

    }

    public CantidadPlatos getPlatos() {
        return platos;
    }

    public void setPlatos(CantidadPlatos platos) {
        this.platos = platos;
    }

    public float getDiametroRueda() {
        return diametroRueda;
    }

    public void setDiametroRueda(float diametroRueda) {
        this.diametroRueda = diametroRueda;
    }

    @Override
   public String toString(){

        return super.toString() + "\nPlatos: " + this.getPlatos() + "\nDiámetro de la rueda: " + this.getDiametroRueda();


    }
}
