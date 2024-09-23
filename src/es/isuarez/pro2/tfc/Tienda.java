package es.isuarez.pro2.tfc;

import es.isuarez.pro2.tfc.bicicleta.Bicicleta;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.Color;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.Fabricante;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.Material;

import java.util.LinkedList;

public class Tienda {
    public static void main(String[] args) {


        LinkedList<Bicicleta> bicicletas = new LinkedList<>();

        bicicletas.add(new Bicicleta("S", true, "15", 3000, 1, 2, Fabricante.AURUM, Material.ALUMINIO, Color.NEGRO));
        bicicletas.add(new Bicicleta("S", true, "10", 1500, 2, 2, Fabricante.TREK, Material.CARBONO, Color.ROJO));
        bicicletas.add(new Bicicleta("S", true, "9", 900, 3, 2, Fabricante.SPECIALIZED, Material.ACERO, Color.AMARILLO));
        bicicletas.add(new Bicicleta("S", true, "5", 300, 4, 2, Fabricante.ORBEA, Material.TITANIO, Color.AZUL));
        bicicletas.add(new Bicicleta("S", true, "2", 9000, 5, 2, Fabricante.CANYON, Material.ALUMINIO, Color.NARANJA));


        //Ordenado Por el peso del cuadro.
        bicicletas.sort((a, b) -> b.getPesoCuadro().compareTo(a.getPesoCuadro()));


    }
}
