package es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla;

/***
 *
 * Respresenta el diámetro de las ruedas  la mtb . Todas ellas estarán correspondidas entre dos valores
 * través de constantes.Me he decantado
 * por estos tipos de datos(constantes) ya que es el estándar de fabricacion de este tipo de ruedas de mountain bike.ls
 *
 *
 * */

    public enum DiametroRueda {
        TAMANO_26(26),
        TAMANO_275(27.5),
        TAMANO_29(29);

        private final double tamanio;

        // Constructor
        DiametroRueda(double tamanio) {
            this.tamanio = tamanio;
        }

        /**
         *
         * @return Método que nos retorna el diametro de las ruedas.
         */
        public double getTamanio() {
            return tamanio;
        }

       /**Implementación de método toString para mostrar los datos de manera personalizada**/
        @Override
        public String toString() {
            return tamanio + " pulgadas";
        }
    }


