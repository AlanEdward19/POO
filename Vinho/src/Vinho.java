public class Vinho {
    private String nome, tipo;
    private int anoFabricacao, preco;

    public Vinho(String nome, String tipo, int anoFabricacao, int preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    public Vinho(){
        nome = "";
        tipo = "";
        anoFabricacao = 25000;
        preco = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void Dados(){
        System.out.println(getNome()+":\n\t" +
                "Tipo: " + getTipo() + "\n\t" +
                "Ano: " + getAnoFabricacao() + "\n\t" +
                "Preco: " + getPreco() + "\n\t");
    }
}
