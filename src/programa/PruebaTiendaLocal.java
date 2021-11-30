package programa;


import java.util.Scanner;

public class PruebaTiendaLocal {
    int codigo;
    String autor;
    String titulo;
    Double precio;
    int cantidad;

    public PruebaTiendaLocal(int codigo, String autor, String titulo, Double precio, int cantidad){
        this.codigo=codigo;
        this.autor=autor;
        this.titulo=titulo;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public void leeDeTeclado(){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el codigo");
        this.codigo=in.nextInt();
        System.out.println("Introduce el autor");
        this.autor= in.nextLine();
        System.out.println("Introduce el titulo");
        this.titulo= in.nextLine();
        System.out.println("Introduce el precio");
        this.precio= in.nextDouble();
        System.out.println("Introduce la cantidad en stock");
        this.cantidad=in.nextInt();
    }
    public String toString(){
            String laString ="Codigo: "+codigo+". Autor: "+autor+". Titulo: "+titulo+". Precio: "+precio+". Cantidad"+cantidad;
        return laString;
    }
    public void escribeEnFichero(){

    }
    public void leeDeFichero(){

    }
}
