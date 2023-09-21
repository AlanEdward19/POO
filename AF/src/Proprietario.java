public class Proprietario {
    private String Cpf;
    private String Nome;
    private String Telefone;

    public Proprietario(String cpf, String nome, String telefone) {
        Cpf = cpf;
        Nome = nome;
        Telefone = telefone;
    }

    public Proprietario ()
    {
        Cpf = "";
        Nome = "";
        Telefone = "";
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public void Imprimir () {
        System.out.println("Proprietario: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
    }
}
