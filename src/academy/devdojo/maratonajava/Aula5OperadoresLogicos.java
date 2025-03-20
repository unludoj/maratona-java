package academy.devdojo.maratonajava;

public class Aula5OperadoresLogicos {
    public static void main(String[] args) {
        // && (AND) || (or) !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 4612;

        System.out.println("isDentroDaLei = " + isDentroDaLei);
        System.out.println("isDentroDaLeiMenorQueTrinta = " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel = " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
        }
    }
