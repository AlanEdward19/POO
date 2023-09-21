public class Imovel {
    private String Endereco;
    private int Metragem;
    private float ValorMercado;
    private Proprietario Proprietario;
    private boolean Novo;

    public Imovel ()
    {
     Endereco = "";
     Metragem = 0;
     ValorMercado = 0.0f;
     Proprietario = new Proprietario();
    }
    public Imovel(String endereco, int metragem, float valorMercado, Proprietario proprietario, boolean novo) {
        Endereco = endereco;
        Metragem = metragem;
        ValorMercado = valorMercado;
        Proprietario = proprietario;
        Novo = novo;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getMetragem() {
        return Metragem;
    }

    public void setMetragem(int metragem) {
        Metragem = metragem;
    }

    public float getValorMercado() {
        return ValorMercado;
    }

    public void setValorMercado(float valorMercado) {
        ValorMercado = valorMercado;
    }

    public Proprietario getProprietario() {
        return Proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        Proprietario = proprietario;
    }

    public boolean isNovo() {
        return Novo;
    }

    public void setNovo(boolean novo) {
        Novo = novo;
    }

    public float CalcularValorMetro2 ()
    {
        float valorM2 = getValorMercado()/getMetragem();

        return valorM2;
    }

    public void Imprimir ()
    {
        getProprietario().Imprimir();
        System.out.println("Endereço: " + getEndereco());
        if (isNovo())
            System.out.println("Estado: Novo\n");
        else
            System.out.println("Estado: Usado\n");
    }
}
