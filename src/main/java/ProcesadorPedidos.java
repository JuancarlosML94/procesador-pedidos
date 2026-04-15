import java.util.ArrayList;

public class ProcesadorPedidos {

    private static final double GASTOS_ENVIO = 15.95;
	private static final double DESCUENTO = 0.10;
	private static final double IVA = 0.21;

	public double procesar(ArrayList<String> listaNombres, ArrayList<Double> precios) {
        double total = 0;

        for (int i = 0; i < precios.size(); i++) {
            System.out.println("Añadiendo producto: " + listaNombres.get(i));
            total = total + precios.get(i);
        }

        if (total > 100) {
            System.out.println("Descuento aplicado.");
            total = total - (total * DESCUENTO); 
        }

        double totalFinal = calcularIVA(total);

        totalFinal = aplicarGastosEnvio(totalFinal);

        return totalFinal;
    }

	private double aplicarGastosEnvio(double totalFinal) {
		if (totalFinal < 500) {
            totalFinal = totalFinal + GASTOS_ENVIO;
        }
		return totalFinal;
	}

	private double calcularIVA(double total) {
		return total + (total * IVA);
	}
}