import java.util.Stack;

public class PilhaInverterPalavras {

    public static String inverterPalavras(String input) {
        String[] palavras = input.split(" ");
        Stack<String> pilha = new Stack<>();

        for (String palavra : palavras) {
            char[] letras = palavra.toCharArray();
            Stack<Character> letraPilha = new Stack<>();

            for (char letra : letras) {
                letraPilha.push(letra);
            }

            StringBuilder palavraInvertida = new StringBuilder();
            while (!letraPilha.isEmpty()) {
                palavraInvertida.append(letraPilha.pop());
            }

            pilha.push(palavraInvertida.toString());
        }

        StringBuilder resultado = new StringBuilder();
        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop()).append(" ");
        }

        return resultado.toString().trim();
    }

    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String resultado1 = inverterPalavras(exemplo1);
        System.out.println("Exemplo 1:");
        System.out.println("Original: " + exemplo1);
        System.out.println("Invertido: " + resultado1);

        String exemplo2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";
        String resultado2 = inverterPalavras(exemplo2);
        System.out.println("\nExemplo 2:");
        System.out.println("Original: " + exemplo2);
        System.out.println("Invertido: " + resultado2);
    }
}
