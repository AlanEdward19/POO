import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vinho vinho1 = new Vinho("Vinho 1", "Tipo1", 2022, 100);
        Vinho vinho2 = new Vinho("Vinho 2", "Tipo2", 2020, 250);
        Vinho vinho3 = new Vinho("Vinho 3", "Tipo3", 2000, 100);
        Vinho vinho4 = new Vinho("Vinho 4", "Tipo4", 1999, 18);

        Vinho[] vinhos = {vinho1, vinho2, vinho3, vinho4};

        compararVinhos(vinhos);
    }

    public static void compararVinhos(Vinho[] vinhos) {
        Vinho maisVelho = new Vinho();
        Vinho maisCaro = new Vinho();

        for (Vinho vinho : vinhos) {

            if (vinho.getPreco() > maisCaro.getPreco()) {
                maisCaro = vinho;
            }

            if (vinho.getAnoFabricacao() < maisVelho.getAnoFabricacao()) {
                maisVelho = vinho;
            }

            System.out.println("Vinho mais velho:");
            maisVelho.Dados();

            System.out.println("Vinho mais caro:");
            maisCaro.Dados();
        }
    }
}