import java.sql.SQLOutput;
import java.util.Scanner;

public class Seasons {


    static void seosons() {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextByte();
        if (a == 12 || a == 1 || a == 2) {
            System.out.println(" this seoson is winter");
        } else if (a == 3 || a == 4 || a == 5) {
            System.out.println(" this seoson is spring");
        } else if (a == 6 || a == 7 || a == 8) {
            System.out.println(" this seoson is summer");

        } else if (a == 9 || a == 10 || a == 11) {
            System.out.println(" this seoson is autumn");
        }
    }
}





   /* static void  summer(int a) {

        if (a == 4 || a == 5) {
            System.out.println(" this seoson is summer");
        } else if (a == 6) {
            System.out.println(" this seoson is summer");
        }

    }

    static void autumn(int a) {

        if (a == 7 && a == 8) {
            System.out.println(" this seoson is autumn");
        } else if (a == 9) {
            System.out.println(" this seoson is autumn");
        }

    }

    static void winter(int a) {

        if (a == 10 && a == 11) {
            System.out.println(" this seoson is autumn");
        } else if (a == 12) {
            System.out.println(" this seoson is autumn");
        }
    }
*/