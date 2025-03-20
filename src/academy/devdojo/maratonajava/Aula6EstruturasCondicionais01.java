package academy.devdojo.maratonajava;

public class Aula6EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 11;
        boolean isAutorizadoComprarBebiba = idade >= 18;
        if (isAutorizadoComprarBebiba) {
            System.out.println("Autorizado");
    } else {
            System.out.println("Não Autorizado");
        }
        if (!isAutorizadoComprarBebiba) {
            System.out.println("Não Autorizado");
        }
        System.out.println("Fora do if");
    }
}