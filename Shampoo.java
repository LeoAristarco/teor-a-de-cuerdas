package somospnt;

public class Shampoo extends Producto {

	private int litros;

	public Shampoo(String nombre, int precio, int litros) {
		super(nombre, precio);
		this.litros = litros;
	}

	@Override
	public String toString() {
		return super.toString() + "Contenido: " + litros + "ml" + " /// " + "Precio: $" + getPrecio();
	}

}
