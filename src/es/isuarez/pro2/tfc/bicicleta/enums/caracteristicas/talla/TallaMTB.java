package es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla;


/**
 * Respresenta el tamaño del cuadro de la bicicleta de montaña en función a la
 * lungitud de la entrepierna del usuario. Todas ellas estarán correspondidas entre dos valores
 * .Mínimo y máximo a través de constantes.Me he decantado
 *  * por estos tipos de datos(constantes) ya que son datos estandárizados
 **/


public enum TallaMTB {
    XS_S(14, 16),
    S_M(16, 17),
    M_L(17, 20),
    L(20, 22),
    XL(22, Integer.MAX_VALUE);

    private final int minTalla;
    private final int maxTalla;

    TallaMTB(int minTalla, int maxTalla) {
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


    public static TallaMTB validarTalla(int talla) {
        for (TallaMTB tallaMTB : TallaMTB.values()) {
            if (talla >= tallaMTB.getMinTalla() && talla <= tallaMTB.getMaxTalla()) {
                return tallaMTB;
            }
        }
        throw new IllegalArgumentException("Talla no válida para bicicleta MTB.");
    }
}


