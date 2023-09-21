import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var p1 = new Proprietario("111.111.111-11", "Alan", "telefone 1");
        var p2 = new Proprietario("222.222.222-22", "Lucas", "telefone 2");
        var p3 = new Proprietario("333.333.33-33", "Richard", "telefone 3");
        var p4 = new Proprietario("444.444.444-44", "Conrado", "telefone 4");


        var imovel1 = new Imovel("Rua 1", 1000, 100000, p1, false);
        var imovel2 = new Imovel("Rua 2", 2131, 100000, p1, true);

        var imovel3 = new Imovel("Rua 3", 200000, 2000000, p2, true);
        var imovel4 = new Imovel("Rua 4", 100, 150000, p2, false);

        var imovel5 = new Imovel("Rua 5", 200000, 190000, p3, true);
        var imovel6 = new Imovel("Rua 6", 300, 120000, p3, true);

        var imovel7 = new Imovel("Rua 7", 150, 220000, p4, false);
        var imovel8 = new Imovel("Rua 8", 11, 122000, p4,  false);


        var imoveis = new ArrayList<Imovel>();
        imoveis.add(imovel1);
        imoveis.add(imovel2);
        imoveis.add(imovel3);
        imoveis.add(imovel4);
        imoveis.add(imovel5);
        imoveis.add(imovel6);
        imoveis.add(imovel7);
        imoveis.add(imovel8);

        ImovelNovoComMaiorMetragem(imoveis);
        ImovelFaixaPreco(imoveis, 200, 5000);
    }

    public static void ImovelNovoComMaiorMetragem (ArrayList<Imovel> imoveis)
    {
        var imovelMaiorMetragem = new Imovel();
        for (var imovel : imoveis)
        {
            if (imovel.isNovo()){
                if (imovel.getMetragem() > imovelMaiorMetragem.getMetragem())
                    imovelMaiorMetragem = imovel;
            }
        }

        System.out.println("\nImovel com maior metragem, se localiza em: " + imovelMaiorMetragem.getEndereco() + "\n");
    }

    public static void ImovelFaixaPreco (ArrayList<Imovel> imoveis, float min, float max)
    {
        boolean achou = false;
        for (var imovel : imoveis)
        {
            if (!imovel.isNovo())
            {
                if (imovel.CalcularValorMetro2() >= min && imovel.CalcularValorMetro2() <= max)
                {
                    System.out.println("Imovel na faixa de valores foi encontrado:");
                    imovel.Imprimir();
                    achou = true;
                }
            }
        }

        if (!achou)
            System.out.println("Nenhum imovel foi achado nesta faixa de preço");

    }
}