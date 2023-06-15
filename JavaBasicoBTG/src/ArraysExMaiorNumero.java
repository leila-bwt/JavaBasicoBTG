public class ArraysExMaiorNumero {

    public static void main(String[] args) {
        int[] numeros = { 15, 25, 43, 3, 10, 55 };
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i]; // mesma coisa que media = media + numeros[i]
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media / numeros.length);

    }
}
