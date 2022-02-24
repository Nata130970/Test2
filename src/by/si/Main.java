package by.si;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	int currentYear = 2022;
        int age;
        String nameUser;
        String dateBirth;
        String profession = "Программист";
        String organization = "ОАО СвязьИнвест";
        String  address = "г. Минск ул.Некрасова ";
        long phoneUser = 375173631260L;
        byte house = 114;
        byte room = 60;
        short addPhone = 1074;
        char delimiter = 45;
        double salaryExpected = 2345689.78;
        float salaryResult = 2345.99f;

        System.out.print("\nВведите Фамилию и Имя: ");
        Scanner scanner = new Scanner(System.in);
        nameUser = scanner.nextLine();
        System.out.print("Ваш год рождения: ");
        dateBirth = scanner.nextLine();
        for(int i = 0; i < 10; i++ )  System.out.print(delimiter);

        System.out.print(" Результат выполнения программы ");
        for(int i = 0; i < 10; i++ )  System.out.print(delimiter);
        System.out.println("\nВас зовут: " + nameUser);
        age = currentYear - Integer.parseInt (dateBirth.trim ());
        String ageString = Integer.toString(age);
        System.out.print("Ваш возраст: " + age + " ");
        String[] mas= new String[]{"лет","года","год" };
        if (ageString.endsWith("2") || ageString.endsWith("3") || ageString.endsWith("4")){
            System.out.println(mas[1]);
        }else{
             if (ageString.endsWith("1")) {
                 System.out.println(mas[2]);
             }else{
                 System.out.println(mas[0]);
             }
        }
        System.out.println( "Вы работаете :  " + organization + "\n" + "Адрес : " + address  + " " + house + "-"+ room + "\n"
                           + "Должность :  " + profession + " \n" + "Ожидаемая зарплата : " + salaryExpected + " \n"
                           + "Фактическая зарплата : " + salaryResult );
        System.out.println( String.format("Ваш рабочий телефон : + %d  доб.%d" , phoneUser, addPhone));
    }
}
