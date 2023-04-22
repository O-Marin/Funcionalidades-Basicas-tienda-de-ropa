package productos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportarTxt extends ExportadorTxt {
	

	@Override
	public void exportar(ArrayList<Productos> listaProductos) {
		String lista = listaProductos.toString();
		File archivo = new File("ListaProductosDisponibles.txt");
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
			bw.write(lista);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
