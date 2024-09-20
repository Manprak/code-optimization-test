public class Store {
     final int[] PRECIOS_PRODUCTOS = {20, 5, 10}; 
     final int[] CANTIDADES_PRODUCTOS = {1, 5, 8}; ; 
     final int UMbral_VENTAS = 50; 
    
    public static void main(String[] args) {
        if (PRECIOS_PRODUCTOS != CANTIDADES_PRODUCTOS) {
            System.out.println("Error: Los arreglos de precios y cantidades no coinciden.");
            
        }
        int totalVentas = 0;
        for (int i = 0; i < PRECIOS_PRODUCTOS.length; i++) {
            int totalProducto = PRECIOS_PRODUCTOS[i] * CANTIDADES_PRODUCTOS[i];
            totalVentas += totalProducto;
        }
       
        if (totalVentas > UMbral_VENTAS) {
            System.out.println("Buen desempeño en ventas");
        } else {
            System.out.println("Mal desempeño en ventas");
        }
    }
}

