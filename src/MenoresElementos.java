public class MenoresElementos {

    public static void encontrarDosMenores(int[] numeros) {
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

        System.out.println("El menor valor es: " + menor);
        System.out.println("El segundo menor valor es: " + segundoMenor);
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 9, 3, 7, 1};

        encontrarDosMenores(array);
    }

}
