package es.isuarez.pro2.tfc;

import es.isuarez.pro2.tfc.bicicleta.Bicicleta;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.*;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.talla.DiametroRuedaBicicleta;
import es.isuarez.pro2.tfc.bicicleta.enums.persona.Genero;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bicicleta> bicicletas = new ArrayList<>();

        // Agregar bicicletas de ejemplo
        agregarBicicletasEjemplo(bicicletas);

        int elecc;
        do {
            menuPrincipal();
            elecc = obtenerEntradaEntera(sc);

            switch (elecc) {
                case 1:
                    filtrarBicicletas(sc, bicicletas);
                    break;
                case 5:
                    mostrarDatosBicicletas(bicicletas);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break; // Salir del menú
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        } while (elecc != 0); // Continuar hasta que el usuario elija salir
    }

    private static void agregarBicicletasEjemplo(ArrayList<Bicicleta> bicicletas) {
        bicicletas.add(new Bicicleta("M", true, "10", 10000, 0, 0,
                Fabricante.AURUM, DiametroRuedaBicicleta.RUEDA_700C, Material.ALUMINIO, Color.NEGRO, Genero.HOMBRE));

        bicicletas.add(new Bicicleta("M", true, "10", 10000, 0, 0,
                Fabricante.CANYON, DiametroRuedaBicicleta.RUEDA_700C, Material.ALUMINIO, Color.NEGRO, Genero.MUJER));

        bicicletas.add(new Bicicleta("M", true, "10", 10000, 0, 0,
                Fabricante.COLNAGO, DiametroRuedaBicicleta.RUEDA_700C, Material.ALUMINIO, Color.NEGRO, Genero.UNISEX));

        bicicletas.add(new Bicicleta("M", true, "10", 10000, 0, 0,
                Fabricante.SPECIALIZED, DiametroRuedaBicicleta.RUEDA_700C, Material.ALUMINIO, Color.NEGRO, Genero.HOMBRE));
    }

    private static void filtrarBicicletas(Scanner sc, ArrayList<Bicicleta> bicicletas) {
        System.out.println("Filtrar por: ");
        filtrar(); // Muestra opciones de filtrado
        int fil = obtenerEntradaEntera(sc);

        switch (fil) {
            case 1:
                System.out.println("Filtrando por Talla...");
                // Lógica para filtrar por talla
                break;
            case 2:
                System.out.println("Filtrando por Peso...");
                // Lógica para filtrar por peso
                break;
            case 3:
                System.out.println("Filtrando por Precio...");
                // Lógica para filtrar por precio
                break;
            case 4:
                System.out.println("Filtrando por Id...");
                // Lógica para filtrar por Id
                break;
            case 5:
                System.out.println("Filtrando por Fabricante...");
                // Lógica para filtrar por fabricante
                break;
            case 6:
                System.out.println("Filtrando por Diámetro...");
                // Lógica para filtrar por diámetro
                break;
            case 7:
                System.out.println("Filtrando por Material...");
                // Lógica para filtrar por material
                break;
            case 8:
                System.out.println("Filtrando por Color...");
                // Lógica para filtrar por color
                break;
            case 9:
                System.out.println("Filtrando por Género...");
                // Lógica para filtrar por género
                break;
            default:
                System.out.println("Opción no válida, por favor intente de nuevo.");
                break; // Maneja la opción no válida
        }
    }

    private static void mostrarDatosBicicletas(ArrayList<Bicicleta> bicicletas) {
        System.out.println("==================Mostrar bicicletas=============");
        // Ordenar ascendente
        bicicletas.sort((a, b) -> a.getFabricante().compareTo(b.getFabricante()));
        System.out.println("==================Ascendente (a-z)=============");
        for (Bicicleta b : bicicletas) {
            System.out.println(">" + b.getFabricante() + "<" + "\n" + b + "\n===================");
        }

        // Ordenar descendente
        System.out.println("==================Descendente (z-a)=============");
        bicicletas.sort((a, b) -> b.getFabricante().compareTo(a.getFabricante()));
        for (Bicicleta b : bicicletas) {
            System.out.println(">" + b.getFabricante() + "<" + "\n" + b + "\n===================");
        }
    }

    public static void menuPrincipal() {
        System.out.println("=== Menú Principal ===");
        System.out.println("1.- Filtrar");
        System.out.println("2.- Crear (Funcionalidad no implementada)");
        System.out.println("3.- Modificar (Funcionalidad no implementada)");
        System.out.println("4.- Eliminar (Funcionalidad no implementada)");
        System.out.println("5.- Mostrar datos ");
        System.out.println("0.- Salir");
    }

    public static void filtrar() {
        System.out.println("=== Opciones de Filtrado ===");
        System.out.println("1.- Talla");
        System.out.println("2.- Peso");
        System.out.println("3.- Precio");
        System.out.println("4.- Id");
        System.out.println("5.- Fabricante");
        System.out.println("6.- Diámetro");
        System.out.println("7.- Material");
        System.out.println("8.- Color");
        System.out.println("9.- Género");
    }

    private static int obtenerEntradaEntera(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }
}
