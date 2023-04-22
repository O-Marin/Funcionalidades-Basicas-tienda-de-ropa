package archivoServicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import producto.*;

/*
 *importa csv con productos
*/

public class ArchivoServicio {
	
	
	public static void importar(ProductoServicio ps) {
	File archivo = new File("src/importar/ProductosImportados.csv");
	
	try {
	BufferedReader br = new BufferedReader(new FileReader(archivo));
	
	if(archivo.exists()) {
		
		System.out.println("archivo leido con exito");	
		String unaLinea = br.readLine();
		
		String[] separado = unaLinea.split(",");
		
		if(ps.listarProductos()==null) {
			System.out.println(ps.listarProductos());
		}
		
		//bloque  para crear producto
		Producto producto = new Producto(null, null, null, null, null, null, null);
		producto.setArticulo(separado[0]);
		producto.setPrecio(separado[1]);
		producto.setDescripcion(separado[2]);
		producto.setCodigo(separado[3]);
		producto.setTalla(separado[4]);
		producto.setMarca(separado[5]);
		producto.setColor(separado[6]);
		ps.agregarProducto(producto);
		
		
		
		while(unaLinea != null) {
			producto = new Producto(null, null, null, null, null, null, null);
			unaLinea = br.readLine();
			separado = unaLinea.split(",");	
			producto.setArticulo(separado[0]);
			producto.setPrecio(separado[1]);
			producto.setDescripcion(separado[2]);
			producto.setCodigo(separado[3]);
			producto.setTalla(separado[4]);
			producto.setMarca(separado[5]);
			producto.setColor(separado[6]);
			ps.agregarProducto(producto);
			
		}
		
	}
	
	}catch(IOException e) {
		System.out.println("Error en la lectura del archivo.");
		System.out.println("Revisa si esta el path bien escrito");
		System.out.println("Revisa si el nombre del archivo esta bien escrito");
		System.out.println("Revisa la extension del archivo es correcta");
	}catch(NullPointerException t) {
		System.out.println("importacion finalizada");
		System.out.println("La lista tiene " + ps.listarProductos().size() + " productos");
	}
	
	
	
	}
	
	
}