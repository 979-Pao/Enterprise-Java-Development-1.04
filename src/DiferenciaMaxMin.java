public class DiferenciaMaxMin {

    public static int diferenciaMayorMenor(int[] numeros) {
        int max = numeros[0];
        int min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 9, 5, 7, 10};

        int resultado = diferenciaMayorMenor(array);
        System.out.println("La diferencia entre el mayor y menor valor es: " + resultado);
    }

}
