package producto;

public class Producto {
	String articulo;
	String precio;
	String descripcion;
	String codigo;
	String talla;
	String marca;
	String color;
	
	
	
	public Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca,
			String color) {
		super();
		this.articulo = articulo;
		this.precio = precio;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.talla = talla;
		this.marca = marca;
		this.color = color;
	}
	
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "\nDatos del producto:\n"
				+ "1.Nombre del articulo:" + articulo 
				+ "\n2.Precio:" + precio 
				+ "\n3.Descripcion:" + descripcion 
				+ "\n4.Codigo:"+ codigo 
				+ "\n5.Talla:" + talla 
				+ "\n6.Marca:" + marca 
				+ "\n7.Color=" + color + "\n";
				
	}
	
	
	
}
