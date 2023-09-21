import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var scannerInt = new Scanner(System.in);

        Habitante habitante1 = new Habitante();
        Habitante habitante2 = new Habitante();

        habitante1.CriarHabitante();
        habitante2.CriarHabitante();

        ArrayList <Habitante> habitantes = new ArrayList<>();
        habitantes.add(habitante1);
        habitantes.add(habitante2);

        mediaOlhosAltura(habitantes);
    }

    public static void mediaOlhosAltura (ArrayList<Habitante> habitantes)
    {
        int qtdOlhosCastanhosAltura = 0, maiorIdade = 0, qtdHomens = 0, qtdMulheres = 0;

        for (var habitante : habitantes)
        {
            if (habitante.getCorDosOlhos() == "C" && habitante.getAltura() > 1.60){
                qtdOlhosCastanhosAltura += 1;
            }
            else if (habitante.getSexo() == "F" && (habitante.getIdade() >= 20 || habitante.getIdade() <= 45)
                    && habitante.getCorDosOlhos() == "V" )
            {
                qtdMulheres += 1;
            }

            if (habitante.getSexo() == "M"){
                qtdHomens += 1;
            }

            if (habitante.getIdade() > maiorIdade){
                maiorIdade = habitante.getIdade();
            }

        }
    }
}