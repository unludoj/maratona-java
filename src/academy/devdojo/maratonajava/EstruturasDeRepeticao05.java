package academy.devdojo.maratonajava;

public class EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado
        // Condicao valorParcela = 1000
        double valorTotal = 40000;
        for (int parcela =(int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela: " + parcela+ "R$ " + valorParcela);
        }
    }
}