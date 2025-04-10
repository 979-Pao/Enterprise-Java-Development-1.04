public class DiferenciaMaxMin {

    public static int diferenciaMayorMenor(int[] numeros) {
        if (numeros.length < 1) {
            throw new IllegalArgumentException("El arreglo debe tener al menos un elemento.");
        }

        int min = numeros[0];
        int max = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 9, 3, 7, 9, 15};

        int resultado = diferenciaMayorMenor(array);
        System.out.println("La diferencia entre el mayor y menor valor es: " + resultado);
    }

}
