public class ExpresionMatematica {

    public static double calcularExpresion(double x, double y) {
        double parte1 = x * x;
        double parte2 = (4 * y) / 5 - x;
        double parte3 = parte2 * parte2;

        return parte1 + parte3;
    }

    public static void main(String[] args) {
        double x = 3;
        double y = 9;

        double resultado = calcularExpresion(x, y);
        System.out.println("El resultado de la expresión es: " + resultado);
    }

}
