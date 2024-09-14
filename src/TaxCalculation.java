public class TaxCalculation {
    // Definir constantes
    private static final double[] TASAS_IMPUESTO = {0.15, 0.10}; // Tasas de impuestos para los productos
    private static final double[] PRECIOS_PRODUCTOS = {100, 200}; // Precios de los productos
    private static final double UMbral_IMPUESTO = 50; // Umbral para determinar si el impuesto total es alto

    public static void main(String[] args) {
        // Validar que los arreglos de precios y tasas de impuestos tengan el mismo tamaño
        if (PRECIOS_PRODUCTOS.length != TASAS_IMPUESTO.length) {
            System.out.println("Error: Los arreglos de precios y tasas de impuestos no coinciden.");
            return;
        }

        // Calcular el impuesto total
        double impuestoTotal = 0;
        for (int i = 0; i < PRECIOS_PRODUCTOS.length; i++) {
            double impuestoProducto = PRECIOS_PRODUCTOS[i] * TASAS_IMPUESTO[i];
            impuestoTotal += impuestoProducto;
        }

        // Determinar y mostrar el nivel del impuesto total
        if (impuestoTotal > UMbral_IMPUESTO) {
            System.out.println("Impuesto total alto: " + impuestoTotal);
        } else {
            System.out.println("Impuesto total bajo: "+ impuestoTotal);
        }
    }
}
