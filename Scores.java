// КЛАС-ДАННИ ЗА ОЦЕНКИ НА УЧЕНИЦИТЕ
package zadacha1;
import java.util.Scanner;
public class Scores {
    // достъпваме променливите
    public float history;
    public float geography;
    public float programing;
    public float avg;
    public int Ots;

    // метод за въвеждане на оценки и средно-аритметично
    public void inputScores() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Отсъствия : ");
        this.Ots = Integer.parseInt(sc.nextLine());

        System.out.println("Оценка по История :");
        this.history = Float.parseFloat(sc.nextLine());

        System.out.println("Оценка по География :");
        this.geography = Float.parseFloat(sc.nextLine());

        System.out.println("Оценка по Програмиране : ");
        this.programing = Float.parseFloat(sc.nextLine());

        avg = (this.history + this.geography + this.programing) / 3;
    }
}
