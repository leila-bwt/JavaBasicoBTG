import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
       int[] numeros = new int[5]; // definir nome da lista e o tamanho dela
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;


        //para acessar os itens do vetor, usamos a estrutura 'for'
        for(int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        System.out.println();

        String[]letras = new String[5];
            letras[0] = "A";
            letras[1] = "B";
            letras[2] = "C";
            letras[3] = "D";
            letras[4] = "E";

                for(int j=0; j < letras.length; j++){
            System.out.println(letras[j]);

        }
        System.out.println();

        String [] frutas = {"banana", "mamão", "pera", "goiaba", "maça"};
        // quando ja sabemos os valores que vai ser adicionado na array
        // colocamos esse valores dentro de chaves
        for (int k=0; k < frutas.length; k++){
            System.out.println(frutas[k]);
        }

        // Podemos imprimir os dados do Array usando a estrutura toString
        // Atenção pois será necessário importar 'Arrays java.util'
        System.out.println(Arrays.toString(frutas));
    }
}
