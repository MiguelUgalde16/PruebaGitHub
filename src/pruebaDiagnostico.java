import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class PruebaDiagnostico {
    static Catalogo catalogoTienda = new Catalogo();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
                catalogoTienda.verCatalogo();
        int opcion, indice;
        int clave;
        String Titulo;
        do {
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    pedirDatosProductos();
                    break;
                case 2:
                    catalogoTienda.verCatalogo();
                    break;

                case 3 :
                    System.out.print("Dame la clave del producto que deseas borrar:");
                    clave = entrada.nextInt();
                    indice = catalogoTienda.buscarLibroPorClaveSecuencial(clave);
                    if (indice == -1) {
                        System.out.println("La clave no existe repite la operación ");
                    } else {
                        catalogoTienda.borrarLibro(clave);
                        System.out.println("El libro se ha eliminado ");
                        catalogoTienda.verCatalogo();
                    }
                    break;
                case 4:
                    System.out.println("Adios :3");
                    break;

                default: System.out.println("OPCIÓN NO VALIDA ");
            }
        } while (opcion != 4);
    }
    private static void menu() {
        imprimirLinea();
        System.out.println("MENU");
        System.out.println("1.- Añadir libro ");
        System.out.println("2.- Mostrar lista de libros ");
        System.out.println("3.- Borrar libro");
        System.out.println("4.- Salir");
        System.out.print("Elige una opción: ");
    }
    public static void pedirDatosProductos() {
        int preciox;
        String descripcionx, x, productox;
        System.out.print("Dame el nombre del prodcuto: ");
        productox = entrada.nextLine();
        entrada.nextLine();
        System.out.print("Dame la descripcion del producto: ");
        descripcionx = entrada.nextLine();
        System.out.print("Dame el precio del libro: ");
        preciox = entrada.nextInt();
        Diagnostico diagnosticox = new Diagnostico(productox, descripcionx, preciox);
        catalogoTienda.insertarProducto(productox);
    }
    public static void imprimirLinea() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
}
