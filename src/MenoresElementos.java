public class MenoresElementos {

    // Método que encuentra e imprime el menor y segundo menor elemento
    public static void encontrarDosMenores(int[] numeros) {
        // Verificamos que haya al menos 2 elementos
        if (numeros.length < 2) {
            System.out.println("El arreglo debe tener al menos dos elementos.");
            return;
        }

        // Inicializamos los dos menores con valores grandes
        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;

        // Recorremos el arreglo
        for (int num : numeros) {
            if (num < menor) {
                // El nuevo menor desplaza al anterior menor al segundo menor
                segundoMenor = menor;
                menor = num;
            } else if (num < segundoMenor && num != menor) {
                // Solo actualizamos el segundo menor si es diferente del menor
                segundoMenor = num;
            }
        }

        // Verificamos si encontramos realmente dos valores distintos
        if (segundoMenor == Integer.MAX_VALUE) {
            System.out.println("No hay un segundo menor distinto.");
        } else {
            System.out.println("El menor valor es: " + menor);
            System.out.println("El segundo menor valor es: " + segundoMenor);
        }
    }

    // Método principal para probarlo
    public static void main(String[] args) {
        int[] ejemplo = {4, 1, 2, 1, 5};

        encontrarDosMenores(ejemplo);
    }

}
