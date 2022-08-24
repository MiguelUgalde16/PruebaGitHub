import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class claseProducto {
    private ArrayList<Diagnostico> listaProductos;
    public claseProducto() {
        //Modificacion pendiente sobre lectura de fichero de texto
        listaProductos = new ArrayList<>();
    }
    public void setListaProductos(ArrayList<Diagnostico> lista) {
        this.listaProductos = lista;
    }
    public ArrayList<Diagnostico> getListaProductos() {
        return listaProductos;
    }
    public void insertarProducto(Producto productox) {
        listaProductos.add(productox);
    }
    public void mostrarProducto(int indice) {
        Diagnostico aux = listaProductos.get(indice);
        System.out.printf("%-8s|%-30s|%-30s|%-30s|%-8s|%-8s\n",
                "Producto", "Descripcion", "precio");
        System.out.println("------------------------------|------------------------------|------------------------------");
        System.out.printf("%-8s|%-30s|%-30s|%-30s|$%7.2f|%-9s\n", aux.getProducto(), aux.getDescripcion(), aux.getPrecio());
    }
    public void borrarProducto(int clave) {
        Iterator<Diagnostico> DiagnosticoIterator = listaProductos.iterator();
        while (DiagnosticoIterator.hasNext()) {
            Diagnostico diagnosticox = DiagnosticoIterator.next();
            if (clave == diagnosticox.getClave()) {
                DiagnosticoIterator.remove();
            }
        }
    }


}
