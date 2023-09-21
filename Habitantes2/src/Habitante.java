import java.util.Scanner;

public class Habitante
{
    private Scanner scanner;
    private Scanner scannerInt;
    public String Sexo;
    public double Altura;
    public int Idade;
    public String CorDosOlhos;

    public Habitante(String sexo, double altura, int idade, String corDosOlhos)
    {
        Sexo = sexo;
        Altura = altura;
        Idade = idade;
        CorDosOlhos = corDosOlhos;
        scanner = new Scanner(System.in);
        scannerInt = new Scanner(System.in);
    }

    public Habitante()
    {
        Sexo = "";
        Altura = 0;
        Idade = 0;
        CorDosOlhos = "";
        scanner = new Scanner(System.in);
        scannerInt = new Scanner(System.in);
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getCorDosOlhos() {
        return CorDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        CorDosOlhos = corDosOlhos;
    }

    public void CriarHabitante (){
        System.out.println("-- Criador de Habitante --");
        System.out.println("Digite o sexo: ");
        setSexo(scanner.nextLine());
        System.out.println("Digite a Altura");
        setAltura(scannerInt.nextDouble());
        System.out.println("Digite a Idade");
        setAltura(scannerInt.nextInt());
        System.out.println("Digite a cor dos Olhos");
        setCorDosOlhos(scanner.nextLine());
    }

}
