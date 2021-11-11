//КЛАС-МЕТОДИ ЗА РАЗПЕЧАТВАНЕ
package zadacha1;
import java.util.ArrayList;
import java.util.Scanner;
public class Utilities {

    static ArrayList<Students> studentsArrayList = new ArrayList<>();
    //Първи метод за влизане в акаунт
    public static void Processing_01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добър ден!");
        System.out.println("Като ученик или като учител бихте желали да влезете?");
        System.out.println("За ученик въведете [1]");
        System.out.println("За учител въведете [2]");

        String options = sc.next();
        if(options.equals("1")){
            System.out.println("Въведете e-mail и парола :");
            System.out.println("E-mail :");
            System.out.println("Password :");

        } else if(options.equals("2")){
            System.out.println("Въведете e-mail и парола");
            System.out.println("E-mail : ");
            System.out.println("Password :");
        }
    }

    //Втори метод за създаване на масив
    public static void Processing_02() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Име на ученик : ");
            String fName = sc.nextLine();

            System.out.println("Фамилия на ученик : ");
            String sName = sc.nextLine();

            System.out.println("Номер на ученик : ");
            int studentID = Integer.parseInt(sc.nextLine());

            studentsArrayList.add(new Students(fName, sName, studentID));
            new Students(fName, sName, studentID);

        }
    }
    //Трети метод, за обхождане на масива от Processing_01

    public static void Processing_03(){
        for (Students S: studentsArrayList
        ) {
            System.out.println("Ученик : " + S.Name + " " + S.Family + " " + S.Number );

            S.scores.inputScores(); //извикване на метода inputScores от класа SCORES
        }
    }
    //метод за извикване на резултат
    public static void Output() {
        for (Students S: studentsArrayList
        ) {
           S.printInfo(); //извикване на метода printInfo от класа Students
        }
    }
    public static void Presenters(){
        System.out.println("Явор Янков 18228");
        System.out.println("Калоян Златев 18116");
        System.out.println("Иван Николов 18113");
    }

}
