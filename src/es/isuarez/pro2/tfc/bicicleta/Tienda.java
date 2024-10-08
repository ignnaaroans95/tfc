package es.isuarez.pro2.tfc.bicicleta;

import es.isuarez.pro2.tfc.cliente.Cliente;
import es.isuarez.pro2.tfc.bicicleta.enums.caracteristicas.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tienda {



        ArrayList<Bicicleta> bicicletas = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();


    // 1. Método para añadir bicicletas al inventario
    public void agregarBicicleta(Bicicleta bicicleta) {
        if (bicicleta == null) {
            System.out.println("Error: La bicicleta no puede ser null.");
            return;
        }
        if (bicicletas.contains(bicicleta)) {
            System.out.println("Error: La bicicleta ya está en el inventario.");
            return;
        }
        bicicletas.add(bicicleta);
        System.out.println("Bicicleta añadida al inventario.");
    }

    // 2. Método para buscar bicicletas por fabricante con validaciones
    public List<Bicicleta> buscarBicicletasPorFabricante(Fabricante fabricante) {
        if (fabricante == null) {
            System.out.println("Error: El fabricante no puede ser null.");
            return new ArrayList<>();
        }
        List<Bicicleta> resultado = new ArrayList<>();
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getFabricante() == fabricante) {
                resultado.add(bicicleta);
            }
        }
        if (resultado.isEmpty()) {
            System.out.println("No se encontraron bicicletas de ese fabricante.");
        }
        return resultado;
    }

    // 3. Método para mostrar el inventario completo con validaciones
    public void mostrarInventario() {
        if (bicicletas.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Bicicleta bicicleta : bicicletas) {
                System.out.println(bicicleta);
            }
        }
    }

    // 4. Método para registrar un cliente con validaciones
    public void registrarCliente(Cliente cliente) {
        if (cliente == null) {
            System.out.println("Error: El cliente no puede ser null.");
            return;
        }
        if (clientes.contains(cliente)) {
            System.out.println("Error: El cliente ya está registrado.");
            return;
        }
        clientes.add(cliente);
        System.out.println("Cliente registrado.");
    }


  /*  // 5. Método para asignar una bicicleta a un cliente con validaciones
    public void asignarBicicletaACliente(int idCliente, int idBicicleta) {
        Optional<Cliente> cliente = clientes.stream().filter(c -> c.getId() == idCliente).findFirst();
        Optional<Bicicleta> bicicleta = bicicletas.stream().filter(b -> b.getId() == idBicicleta).findFirst();

        if (!cliente.isPresent()) {
            System.out.println("Error: Cliente no encontrado.");
            return;
        }
        if (!bicicleta.isPresent()) {
            System.out.println("Error: Bicicleta no encontrada.");
            return;
        }
        if (!bicicleta.get().isDisponible()) {
            System.out.println("Error: La bicicleta ya está asignada.");
            return;
        }

        cliente.get().asignarBicicleta(bicicleta.get());
        bicicleta.get().setDisponible(false); // Marcar la bicicleta como no disponible
        System.out.println("Bicicleta asignada al cliente.");
    }
}*/

        

}
