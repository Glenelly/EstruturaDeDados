package vetores;

public class Teste3 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor.busca("Elemento 3"));

    }
}
