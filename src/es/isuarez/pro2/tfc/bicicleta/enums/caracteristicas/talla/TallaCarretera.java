package es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla;

/**
 * Respresenta el tamaño del cuadro de la bicicleta en función a la
 * lungitud de la entrepierna del usuario. Todas ellas estarán correspondidas entre dos valores
 * .Mínimo y máximo a través de constantes.Me he decantado
 * por estos tipos de datos(constantes) ya que son datos estandárizados
 **/

public enum TallaCarretera {
    XS_S(47, 51),
    S_M(51, 53),
    M_L(53, 57),
    L(57, 59),
    L_XL(59, 61),
    XL(61, Integer.MAX_VALUE);

    private final int minTalla;
    private final int maxTalla;

    /**Constructor del enumerador**/

    TallaCarretera(int minTalla, int maxTalla) {
        this.minTalla = minTalla;
        this.maxTalla = maxTalla;
    }

    public int getMinTalla() {
        return minTalla;
    }

    public int getMaxTalla() {
        return maxTalla;
    }

    /**
     *
     *  Método estático que valida los datos introducidos. De esta manera nos aseguramosque los datos introducidos por
     *  el usuario son los adecuados.
     *
     */
    public static TallaCarretera validarTalla(int talla) {
        for (TallaCarretera tallaCarretera : TallaCarretera.values()) {
            if (talla >= tallaCarretera.getMinTalla() && talla <= tallaCarretera.getMaxTalla()) {
                return tallaCarretera;
            }
        }
        throw new IllegalArgumentException("Talla no válida para bicicleta de carretera. Introduzca valores comprendidos" +
                "entre la talla 41 y la talla 61,.");
    }

}
