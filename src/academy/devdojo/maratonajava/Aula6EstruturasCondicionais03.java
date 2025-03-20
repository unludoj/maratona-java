package academy.devdojo.maratonajava;

public class Aula6EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000D;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
