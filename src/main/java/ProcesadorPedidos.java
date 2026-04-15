import java.util.ArrayList;

public class ProcesadorPedidos {

    public double procesar(ArrayList<String> listaNombres, ArrayList<Double> precios) {
        double total = 0;

        for (int i = 0; i < precios.size(); i++) {
            System.out.println("Añadiendo producto: " + listaNombres.get(i));
            total = total + precios.get(i);
        }

        if (total > 100) {
            System.out.println("Descuento aplicado.");
            total = total - (total * 0.10); 
        }

        double totalFinal = total + (total * 0.21);

        if (totalFinal < 500) {
            totalFinal = totalFinal + 15.95;
        }

        return totalFinal;
    }
}