// CONSIGNA:
/* Caso Práctico 1
1. Descripción general
Se debe desarrollar un sistema de stock que permita gestionar productos en una tienda, controlando su disponibilidad, precios 
y categorías. La información se modelará utilizando clases, colecciones dinámicas y enumeraciones en Java.
2. Clases a implementar Clase Producto
Atributos:
● id (String) → Identificador único del producto.
● nombre (String) → Nombre del producto.
● precio (double) → Precio del producto.
● cantidad (int) → Cantidad en stock.
● categoria (CategoriaProducto) → Categoría del producto.
Métodos:
● mostrarInfo() → Muestra en consola la información del producto.
Enum CategoriaProducto Valores:
● ALIMENTOS
● ELECTRONICA
● ROPA
● HOGAR

Clase Inventario
Atributo:
● ArrayList<Producto> productos Métodos requeridos:
● agregarProducto(Producto p)
● listarProductos()
● buscarProductoPorId(String id)
● eliminarProducto(String id)
● actualizarStock(String id, int nuevaCantidad)
● filtrarPorCategoria(CategoriaProducto categoria)
● obtenerTotalStock()
● obtenerProductoConMayorStock()
● filtrarProductosPorPrecio(double min, double max)
● mostrarCategoriasDisponibles()
3. Tareas a realizar
1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
2. Listar todos los productos mostrando su información y categoría.
3. Buscar un producto por ID y mostrar su información.
4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
5. Eliminar un producto por su ID y listar los productos restantes.
6. Actualizar el stock de un producto existente.
7. Mostrar el total de stock disponible.
8. Obtener y mostrar el producto con mayor stock.
9. Filtrar productos con precios entre $1000 y $3000.
10. Mostrar las categorías disponibles con sus descripciones.

*/

package modulo6_ej_uno;

public class Modulo6_Ej_Uno {

    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();

        // 1. Crear al menos 5 productos
        Producto p1 = new Producto("P1", "Leche", 1110, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P2", "Notebook", 8000000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P3", "Remera", 20000, 12, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P4", "Pava electrica", 12000, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P5", "Fideos", 1300, 51, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar productos
        System.out.println("Lista completa de productos:");
        inventario.listarProductos();
        System.out.println("");

        // 3. Buscar un prodcuto por ID
        System.out.println("Buscar producto P$: ");
        Producto encontrado = inventario.buscarProductoPorId("P4");
        if (encontrado != null) encontrado.mostrarInfo();

        // 4. Filtrar por categoría, en este caso alimentos
        System.out.println("Si filtramos solo alimentos: ");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);   

        // 5. Eliminar producto
        inventario.eliminarProducto("P2");  

        // 6. Actualizar stock
        inventario.actualizarStock("P1", 45);

        // 7. Total de stock
        System.out.println("Total de stock: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("Producto con mayor stock:");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        // 9. Filtrar por precio entre 1000 y 3000
        System.out.println("Productos entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Categorías disponibles y descripción
        inventario.mostrarCategoriasDisponibles();
        
        
    }
    
}
