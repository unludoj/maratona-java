package academy.devdojo.maratonajava;

public class Aula07ExcercioSalario {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double impostoAnual01 = 9.70 / 100;
        double impostoAnual02 = 37.35 / 100;
        double impostoAnual03 = 49.50 / 100;
        double valorDoImposto;
        if (salarioAnual <= 34712) {
           valorDoImposto  = salarioAnual * impostoAnual01;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorDoImposto = salarioAnual * impostoAnual02;
        }else {
            valorDoImposto = salarioAnual * impostoAnual03;
        }
            System.out.println(valorDoImposto);
        }
    }