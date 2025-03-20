package academy.devdojo.maratonajava;

public class EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 até 10000000
        for (int i = 0; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
