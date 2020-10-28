import java.util.ArrayList;
import java.util.Collections;

public class Negocio {

    public static void main(String[] args) {

//4. Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo.

        Producto cocaColaZero = new Producto("Coca-Cola Zero", 20, "Litros: 1.5");
        Producto cocaCola = new Producto("Coca-Cola", 18, "Litros 1.5");
        Producto shampooSedal = new Producto("Shampoo Sedal", 19, "Contenido 500ml");
        Producto frutillas = new Producto("Frutillas", 64, "Unidad de venta: kilo");

        ArrayList<Producto> producto = new ArrayList<Producto>();

        producto.add(cocaColaZero);
        producto.add(cocaCola);
        producto.add(shampooSedal);
        producto.add(frutillas);
	
	//El algoritmo usado para la impresion no tiee que depender de la cantidad o tipo de productos. Entonces se usa un loop que muestre lo del listado (el listado puede agrandarse).
	for (Producto prod : producto){
        	System.out.println(prod);
	}

/*
        System.out.println(cocaColaZero);
        System.out.println(cocaCola);
        System.out.println(shampooSedal);
        System.out.println(frutillas);
*/
        System.out.println("=====================");

        Collections.sort(producto);

        System.out.println("Producto mas caro: "+producto.get(3).getNombreProducto());
        System.out.println("Producto mas barato: "+producto.get(0).getNombreProducto());

    }

    }

//implementacion interfaz comparable
class Producto implements Comparable<Producto> {

        private String nombreProducto;
        private int precioProducto;
        private String unidades;

//constructor de producto
        Producto(String nombre, int precio, String unids)
        {
            this.nombreProducto=nombre;
            this.precioProducto=precio;
            this.unidades = unids;
        }
//getters y setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

//Para imprimir en panalla, sobreescribir el metodo toString:
    @Override
        public String toString() {
            return "Nombre: "+this.nombreProducto+ " /// "+this.unidades +" /// Precio: $"+ this.precioProducto;
        }

//Utilizacion de la interfaz Comparable usando el metodo compareTo para mostrar el mayor y menor
    public int compareTo(Producto produ){
        if(precioProducto==produ.precioProducto)
            return 0;
        else if(precioProducto>produ.precioProducto)
            return 1;
        else
            return -1;
    }
}




