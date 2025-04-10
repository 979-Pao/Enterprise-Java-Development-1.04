public class ExpresionMatematica {

    // Método que calcula el resultado de la expresión
    public static double calcularExpresion(double x, double y) {
        // Calculamos paso a paso
        double parte1 = Math.pow(x, 2);                       // x^2
        double parte2 = (4 * y) / 5 - x;                      // (4y/5) - x
        double parte3 = Math.pow(parte2, 2);                  // ((4y/5 - x)^2)

        return parte1 + parte3;                               // x^2 + (...)^2
    }

    // Método principal para probarlo
    public static void main(String[] args) {
        // Variables predefinidas
        double x = 3;
        double y = 10;

        double resultado = calcularExpresion(x, y);
        System.out.println("El resultado de la expresión es: " + resultado);
    }

}
