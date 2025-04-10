public class DiferenciaMaxMin {

    // Método que calcula la diferencia entre el mayor y el menor valor del arreglo
    public static int diferenciaMayorMenor(int[] numeros) {
        // Verificamos que el arreglo tenga al menos un elemento
        if (numeros.length < 1) {
            throw new IllegalArgumentException("El arreglo debe tener al menos un elemento.");
        }

        int min = numeros[0];
        int max = numeros[0];

        // Recorremos el arreglo para encontrar el valor mínimo y máximo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        // Retornamos la diferencia
        return max - min;
    }

    // Método principal para probar el código
    public static void main(String[] args) {
        int[] miArreglo = {4, 1, 9, 3, 7};

        int resultado = diferenciaMayorMenor(miArreglo);
        System.out.println("La diferencia entre el mayor y menor valor es: " + resultado);
    }

}
