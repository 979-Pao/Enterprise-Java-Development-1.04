public class MenoresElementos {

    public static void encontrarDosMenores(int[] numeros) {
        if (numeros.length < 2) {
            System.out.println("El arreglo debe tener al menos dos elementos.");
            return;
        }

        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;

        for (int num : numeros) {
            if (num < menor) {
                segundoMenor = menor;
                menor = num;
            } else if (num < segundoMenor && num != menor) {
                segundoMenor = num;
            }
        }

        if (segundoMenor == Integer.MAX_VALUE) {
            System.out.println("No hay un segundo menor distinto.");
        } else {
            System.out.println("El menor valor es: " + menor);
            System.out.println("El segundo menor valor es: " + segundoMenor);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 3, 1, 1, 5, 8};

        encontrarDosMenores(array);
    }

}
