package menu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import productos.Productos;
import productos.ProductoServicio;

public class Menu {
	static boolean salir = false;
	static ProductoServicio lista = new ProductoServicio();
	static Scanner sc = new Scanner(System.in);
	static int choice;

	public static void mostrarMenu() {

		while (salir == false) {
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1 Listar Productos\n" + "2 Agregar Producto\n" + "3 Exportar Datos\n" + "4 Salir\n"
					+ "Ingrese una opcion");
			System.out.println("------------------------------------------------------------------------------------");
			while (sc.hasNextInt() == false) {

				System.out.println("HEY, GET YOUR ASS BACK HERE AND GIMME A VALID OPTION YOU LITTLE SHIT");
				sc.next();

			}

			choice = sc.nextInt();
			System.out.println("you chose option " + choice);

			if (choice == 1) {
				System.out.println(lista.listarProductos());
			}
			if (choice == 2) {

				Productos producto = new Productos(null, null, null, null, null, null, null);

				System.out.println("Ingresar nombre del articulo");
				String nombreArticulo = sc.next();
				producto.setArticulo(nombreArticulo);

				System.out.println("Ingresar precio");
				String precioArticulo = sc.next();
				producto.setPrecio(precioArticulo);

				System.out.println("Ingresar descripcion");
				String descripcion = sc.next();
				producto.setDescripcion(descripcion);

				System.out.println("Ingresar codigo");
				String codigo = sc.next();
				producto.setCodigo(codigo);

				System.out.println("Ingresar talla");
				String talla = sc.next();
				producto.setTalla(talla);

				System.out.println("Ingresar marca");
				String marca = sc.next();
				producto.setMarca(marca);

				System.out.println("Ingresar color");
				String color = sc.next();
				producto.setColor(color);

				lista.agregarProductos(producto);
			}
			if (choice == 3) {
				try {
					File archivo = new File("src/almacenDeInformacion/archivo.txt");
					FileWriter fw;
					BufferedWriter bw;

					if (archivo.createNewFile()) {
						System.out.println("Datos de clientes exportados correctamente en formato .txt");
						fw = new FileWriter(archivo);
						bw = new BufferedWriter(fw);
						bw.write(lista.toString());
						bw.close();

					} else {
						System.out.println("File already exists.");

					}

				} catch (IOException e) {
					System.out.println("Error");
					e.printStackTrace();
				}
			}

			if (choice == 4) {
				System.out.println("Abandonando el sistema de productos...");
				salir = true;
			}
		}
		System.out.println("Acaba de salir del sistema");
		sc.close();
	}

}
