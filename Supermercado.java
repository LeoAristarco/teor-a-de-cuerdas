package somospnt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Supermercado {

	private List<Producto> productos;

	public Supermercado() {
		super();
		this.productos = new ArrayList<Producto>();
	}

	public void cargarProducto(Producto unProducto) {
		productos.add(unProducto);
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void mostrarInformacionDeProductosPorPantalla() {
		productos.forEach(unProducto -> System.out.println(unProducto.toString()));
	}

	public void mostrarProductoMasCaroPorPantalla() {
		System.out.println("Producto más caro: " + getProductoMasCaro().getNombre());
	}

	public Producto getProductoMasCaro() {
		ordenarProductosAscendentePorPrecio();
		return productos.get(ultimoProductoDeLaLista());
	}

	public int ultimoProductoDeLaLista() {
		return productos.size() - 1;
	}

	public void mostrarProductoMasBaratoPorPantalla() {
		System.out.println("Producto más barato: " + getProductoMasBarato().getNombre());
	}

	public Producto getProductoMasBarato() {
		ordenarProductosAscendentePorPrecio();
		return productos.get(0);
	}

	public void ordenarProductosAscendentePorPrecio() {
		Collections.sort(productos, (p1, p2) -> p1.getPrecio() - p2.getPrecio());
	}

	public void dibujarUnSeparadorGrafico() {
		System.out.println(("============================="));
	}

}
