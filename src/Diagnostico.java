import java.util.Scanner;
public class Diagnostico {
    private String producto;
    private int precio;
    private String descripcion;
    public Diagnostico (int precio, String producto, String descripcion){
        this.producto= producto;
        this.precio=precio;
        this.descripcion= descripcion;
    }
    public int getPrecio (){
        return this.precio;
    }
    public void setPrecio( int preciox){
        this.precio= preciox;
    }
    public String getProducto (){
        return this.producto;
    }
    public void setProducto( int productox){
        this.precio= productox;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion( String descripcionx){
        this.descripcion= descripcionx;
    }
    public String  FormatoArchivo(){
    return producto + " " + descripcion + " "+ precio + " " ;
    }

    @Override
    public String toString (){
        return "producto{" + "producto=" + producto +"descripcion =" + descripcion + "precio= " + precio;
    }
}
