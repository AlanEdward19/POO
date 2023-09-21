public class Pessoa {

    private String Nome, Endereco, Idade, Sexo, RG, Curso;

    public void Dados()
    {
        System.out.println("Dados de " + getNome() + ":\n\t" +
                "Endereco: " + getEndereco() + "\n\t" +
                "Idade: " + getIdade() + "\n\t" +
                "Sexo: " + getSexo() + "\n\t" +
                "RG: " + getRG() + "\n\t" +
                "Curso: " + getCurso());
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getCurso() {
        return Curso;
    }
    public void setCurso(String curso) {
        Curso = curso;
    }
    public String getEndereco() {return Endereco;}
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public String getIdade() {
        return Idade;
    }
    public void setIdade(String idade) {
        Idade = idade;
    }
    public String getRG() {
        return RG;
    }
    public void setRG(String rg) {
        RG = rg;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String sexo) {
        Sexo = sexo;
    }
}
