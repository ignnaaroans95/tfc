package es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla;

/***Esta clase engloba todos los esándares existentes para las bicicletas de carretera, gravel y MTB. **/

public enum DiametroRuedaBicicleta {

    /**
     *
     * Estándares para bicicletas de carretera y gravel
     *
     * ***/

    RUEDA_700C(622, "700C (Carretera, Gravel)"),
    RUEDA_650B(584, "650B (Carretera, Gravel)"),
    RUEDA_650C(571, "650C (Carretera)"),
    RUEDA_27_PULGADAS(630, "27 pulgadas (Carretera Clásica)"),

  /**
   * Estándares para bicicletas de montaña y gravel
   * **/
    RUEDA_29_PULGADAS(622, "29 pulgadas (MTB, Gravel)"),
    RUEDA_26_PULGADAS(559, "26 pulgadas (MTB, XC)"),
    RUEDA_27_5_PULGADAS(584, "27.5 pulgadas (MTB, Gravel)");

    /**Consantes creadas para el diámetro y la descripción(tipo de bicicleta que monta las ruedas )**/
    private final int diametro;
    private final String descripcion;

    /**
     * Constructor en el cual se asignan los atrubutos de del diámetro así como su descripción
     *
     * **/
    DiametroRuedaBicicleta(int diametro, String descripcion) {
        this.diametro = diametro;
        this.descripcion = descripcion;
    }

    /**
     *
     * @return Devuelve el diámetro de la rueda
     */
    public int getDiametro() {
        return this.diametro;
    }

    /**
     *
     *
     * @return Devuelve la descripción del estándar de la rueda
     */
    public String getDescripcion() {
        return this.descripcion;
    }
}






