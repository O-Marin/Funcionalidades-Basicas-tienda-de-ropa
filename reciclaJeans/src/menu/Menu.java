package menu;


import java.util.Scanner;
import archivoServicio.ArchivoServicio;
import producto.ProductoServicio;

public class Menu {
	ProductoServicio ps = new ProductoServicio();
	Scanner sc = new Scanner(System.in);
	boolean salir = false;
	int choice;

	public void mostarMenu() {
		
		while (salir == false) {
			
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1 Listar Productos\n" + "2 Editar Producto\n" + "3 Importar Datos\n" + "4 Salir\n"
					+ "Ingrese una opcion");
			System.out.println("------------------------------------------------------------------------------------");

			while (sc.hasNextInt() == false) {

				System.out.println("HEY, GET YOUR ASS BACK HERE AND GIMME A VALID OPTION YOU LITTLE SHIT");
				sc.next();

			}

			choice = sc.nextInt();
			System.out.println("you chose option " + choice);

			if (choice == 1) {
				System.out.println(ps.listarProductos());
			} else if (choice == 2) {
				Scanner sc2 = new Scanner(System.in);
				if(ps.listarProductos().isEmpty()) {
					System.out.println("No hay productos para editar");
				}else {
					
					System.out.println("ingresar el codigo del producto que desea editar");
					String buscarCodigo = sc2.nextLine();
					
					for (int i =0;i<ps.listarProductos().size();i++) {
						
						if(ps.getListaProductos().get(i).getCodigo().equals(buscarCodigo)) {
							
							System.out.println(ps.getListaProductos().get(i));
							System.out.println("ingresa el numero de la opcion que quieres editar");
							String opcion = sc2.nextLine();
							switch(opcion) {
								case "1" ://nombre Articulo
									System.out.println("Ingresar un nuevo nombre de Articulo");
									ps.getListaProductos().get(i).setArticulo(sc2.nextLine());
									break;
								case "2" ://precio articulo
									System.out.println("Ingresar un nuevo Precio");
									ps.getListaProductos().get(i).setPrecio(sc2.nextLine());
									break;
								case "3" ://descripcion articulo
									System.out.println("Ingresar una nueva Descripcion");
									ps.getListaProductos().get(i).setDescripcion(sc2.nextLine());
									break;
								case "4" ://codigo articulo
									System.out.println("Ingresar un nuevo Codigo");
									ps.getListaProductos().get(i).setCodigo(sc2.nextLine());
									break;
								case "5" ://talla articulo
									System.out.println("Ingresar una nueva Talla");
									ps.getListaProductos().get(i).setTalla(sc2.nextLine());
									break;
								case "6" ://marca articulo
									System.out.println("Ingresar una nueva Marca");
									ps.getListaProductos().get(i).setMarca(sc2.nextLine());
									break;
								case "7" ://color articulo
									System.out.println("Ingresar un nuevo Color");
									ps.getListaProductos().get(i).setColor(sc2.nextLine());
									break;
								default:
									System.out.println("El codigo ingresado no pertenece a ni un producto en la base de datos.");
									break;							
							}
						}							
					}
				}
				
			} else if (choice == 3) {
				//aca senialo a que lista voy a importar los datos desde el archivo csv.
				ArchivoServicio.importar(ps);
			}
			//Salir del programa
			if (choice == 4) {
				System.out.println("Abandonando el sistema de productos...");
				salir = true;
			}
			
		}
		//bloque de salida
		System.out.println("Acaba de salir del sistema");
		sc.close();
		
	}

}
