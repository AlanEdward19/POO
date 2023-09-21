import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o Nome da Pessoa");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite o Endereco da Pessoa");
        pessoa.setEndereco(scanner.nextLine());

        System.out.println("Digite a Idade da Pessoa");
        pessoa.setIdade(scanner.nextLine());

        System.out.println("Digite o Sexo da Pessoa");
        pessoa.setSexo(scanner.nextLine());

        System.out.println("Digite o RG da Pessoa");
        pessoa.setRG(scanner.nextLine());

        System.out.println("Digite o Curso da Pessoa");
        pessoa.setCurso(scanner.nextLine());

        pessoa.Dados();
    }
}