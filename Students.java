// КЛАС-ДАННИ ЗА ИНФОРМАЦИЯ ЗА УЧЕНИЦИТЕ
package zadacha1;

public class Students {
    // достъпваме променливите
    public String Name;
    public String Family;
    public int Number;
    public Scores scores = new Scores();


    // Конструктор с параметри
    public Students(String name, String family, int number ) {
        Name = name;
        Family = family;
        Number = number;

    }
    // Метод за принтиране на инфо( Name,Family, Number, Отсъствия,
    // оценка по История, оценка по География, оценка по Програмиране, Средно-аритметично
    public void printInfo(){
        System.out.println("===================================");
        System.out.println("Име : " + this.Name);
        System.out.println("Фамилия : " + this.Family);
        System.out.println("Курсов номер : " + this.Number);
        System.out.println("Отсъствия :" + this.scores.Ots);
        System.out.println("Оценка по История  :" + this.scores.history);
        System.out.println("Оценка по География  :" + this.scores.geography);
        System.out.println("Оценка по Програмиране  : " + this.scores.programing);
        System.out.println("Средно-аритметична оценка :" + this.scores.avg);
        System.out.println("===================================");

    }

}
