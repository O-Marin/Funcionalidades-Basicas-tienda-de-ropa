package productos;

import java.util.ArrayList;

public class ProductoServicio {
	
	ArrayList<Productos> listaProductos = new ArrayList<>();
	
	public ArrayList<Productos> listarProductos() {
		return listaProductos;
		
	}
	
	public void agregarProductos(Productos p) {
		listaProductos.add(p);
	}

	@Override
	public String toString() {
		return "ProductoServicio [listaProductos=" + listaProductos + "]";
	}
	
}
