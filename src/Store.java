public class Store {
    // Definir constantes
    private static final int[] PRECIOS_PRODUCTOS = {20, 5, 10}; // Precios de los productos
    private static final int[] CANTIDADES_PRODUCTOS = {1, 5, 8}; ; // Cantidades vendidas
    private static final int UMbral_VENTAS = 50; // Umbral para el desempeño en ventas
    
    public static void main(String[] args) {
        // Validar que los arreglos de precios y cantidades tengan el mismo tamaño
        if (PRECIOS_PRODUCTOS.length != CANTIDADES_PRODUCTOS.length) {
            System.out.println("Error: Los arreglos de precios y cantidades no coinciden.");
            return;
        }
        // Calcular las ventas totales para cada producto
        int totalVentas = 0;
        for (int i = 0; i < PRECIOS_PRODUCTOS.length; i++) {
            int totalProducto = PRECIOS_PRODUCTOS[i] * CANTIDADES_PRODUCTOS[i];
            totalVentas += totalProducto;
        }
        // Determinar y mostrar el desempeño de ventas
        if (totalVentas > UMbral_VENTAS) {
            System.out.println("Buen desempeño en ventas");
        } else {
            System.out.println("Mal desempeño en ventas");
        }
    }
}

