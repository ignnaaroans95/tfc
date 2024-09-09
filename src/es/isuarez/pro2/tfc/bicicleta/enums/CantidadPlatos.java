package es.isuarez.pro2.tfc.bicicleta.enums;


/**
 * Puesto que es un atributo que se va a repetir mucho en las MTB,
 * he decidido agruparlas en constantes dentro de un enum. El estándar va de 1 a 3 platos
 **/

public enum CantidadPlatos {

    MONOPLATO(1),
    DOS_PLATOS(2),
    TRES_PLATOS(3);

    private final int numeroPlatos;

    CantidadPlatos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }


    /**
     * En este caso nos devuelve el número de platos
     **/

    public int getNumeroPlatos() {
        return numeroPlatos;
    }
}

