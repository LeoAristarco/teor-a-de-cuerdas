package somospnt;

public class App {

	public static void main(String[] args) {

		Supermercado unSupermercadoDeBarrio = new Supermercado();

		cargarProductos(unSupermercadoDeBarrio);

		unSupermercadoDeBarrio.mostrarInformacionDeProductosPorPantalla();

		unSupermercadoDeBarrio.dibujarUnSeparadorGrafico();

		unSupermercadoDeBarrio.mostrarProductoMasCaroPorPantalla();

		unSupermercadoDeBarrio.mostrarProductoMasBaratoPorPantalla();

	}

	public static void cargarProductos(Supermercado unSupermercado) {
		unSupermercado.cargarProducto(new Bebida("manaos", 55, 7.5));
		unSupermercado.cargarProducto(new Bebida("manaos", 33, 7.5));
		unSupermercado.cargarProducto(new Shampoo("head shoulders ", 19, 550));
		unSupermercado.cargarProducto(new Fruta("banana", 22, "kilo"));
	}

}
