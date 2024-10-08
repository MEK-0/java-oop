//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
  import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.println("ad soyad ve yaşınız ?");

         String input = scanner.nextLine();


        String[] parts = input.split(" ");
        String name1 = parts[0];
        String name2 = parts[1];
        String surname = parts[2];
        int number = Integer.parseInt(parts[3]);

        int year=2024;

        number=year -number;

        System.out.println(name1.toUpperCase()+" "+name2.toUpperCase()+" "+surname.toUpperCase()+" "+number+" yılında doğmuştur");

        // input -> mustafa kemal zorti 36
        // output ->MUSTAFA KEMAL ZORTİ 1988  yılında doğmuştur



    }
}