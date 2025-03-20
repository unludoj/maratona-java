package academy.devdojo.maratonajava;

public class Aula6EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou fim de semana
        // Considerando 1 como domingo
        String  diaDaSemana = "5";
        switch (diaDaSemana) {
            case "1":
                //Domingo
                System.out.println("Fim de semana");
                break;
            case "2":
                //Segunda
                System.out.println("Dia Útil");
                break;
            case "3":
                //Terca
                System.out.println("Dia Útil");
                break;
            case "4":
                //Quarta
                System.out.println("Dia Útil");
                break;
            case "5":
                //Quinta
                System.out.println("Dia Útil");
                break;
            case "6":
                //Sexta
                System.out.println("Dia Útil");
                break;
            case "7":
                //Sabado
                System.out.println("Fim de semana");
                break;
                default:
                    System.out.println("Opcao invalida");
        }
    }
}
