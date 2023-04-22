package producto;

import java.util.ArrayList;

public class ProductoServicio {
	private ArrayList<Producto> listaProductos;
	

	public ArrayList<Producto> listarProductos(){
		//si no tengo una lista creada al momento de listar produtos, creo una lista vacia.
		if(getListaProductos() == null) {
			setListaProductos(new ArrayList<Producto>());
			return getListaProductos();
		}
		return getListaProductos();
		}

	/* @method
	 * metodo para agregar productos a la lista. en esta version del programa, se utiliza solo en el metodo importar
	 * para poblar la lista que sera utilizada en el menu.
	*/
	public void agregarProducto(Producto producto) {
		getListaProductos().add(producto);
	}
	@Override
	public String toString() {
		return "ProductoServicio [listaProductos=" + getListaProductos();
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
}
