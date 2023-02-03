import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//public class returnMethod {}
   /* public static void main(String[] args) {
        while (true) {

            System.out.println("Нажмите 1,чтобы включимть");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == 1) {
                channels();
                System.out.println("Нажмите 0,чтобы выключить");
            } else if (a == 0) {
                break;

            }
            int b = scanner.nextInt();


            if (b == 1) {
                kanal();
            }

        }
    }


    static void kanal() {

       Scanner scanner=new Scanner(System.in);
       int b= scanner.nextInt();

        if (b == 1) {
            System.out.println(" КТРК");

        } else if (b == 2) {
            System.out.println("ЭЛТР");
        } else if (b == 3) {
            System.out.println("КТРК СПОРТ ");
        } else if (b == 4) {
            System.out.println("КТРК МУЗЫКА");
        } else if (b == 5) {
            System.out.println("КТРК БАЛАСТАН");
        } else if (b == 6) {
            System.out.println("ПИРАМИДА");
        } else if (b == 7) {
            System.out.println("ОШ ТВ");
        } else if (b == 8) {
            System.out.println("НТС");
        } else if (b == 9) {
            System.out.println("НТВ");
        } else if (b == 10) {
            System.out.println("АЛА-ТОО");

        } else {
            System.out.println();

        }
    }


    static void channels() {

        System.out.print("\n______________" +
                "|\n 1.КТРК             |" +
                " \n|2.ЭЛТР             |" +
                " \n|3.КТРК СПОРТ       |" +
                " \n|4.КТРК МУЗЫКА      |" +
                " \n|5.КТРК БАЛАСТАН    |" +
                " \n|6.ПИРАМИДА         |" +
                " \n|7.ОШ ТВ            |" +
                "\n|8.НТС               |" +
                "\n|9.НТВ               |" +
                " \n|10.АЛА-ТОО 24      |" +
                "\n|___________________ |");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nвыберите канал :");
        int b = scanner.nextInt();
        if (b == 1) {
            kanal();

        }

    }
}









/*
//        Random random = new Random();
//        int[] array = new int[10];
//        int a=0;
//        for (int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(1, 4);
//
//
//
//                System.out.print(array[i]+" ");
//            }
//        int[]array = {1,2,3,3,2,54,5};
//        for (int i = 0; 3 < array.length; i++) {
//            for (int j = i+1; j < array.length ; j++) {
//                for (int k = i+1; k < array.length ; k++) {
//                    if(array[i]==array[j]){
//                        if(array[j]==array[k]){
//                            System.out.println(true);
//                        }
//                    }
//                }
//            }
//        }
//
//
//
//        }
//
//    }


//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println(task(a, 1, 34, 7, 6, 9, 65, 23));
//
//    }
//    static boolean task(int a, int... varargs) {
//        for (int i = 0; i < varargs.length; i++) {
//
//            if (a == varargs[i]) {
//                return true;
//            } else {
//
//            }
//        }
//        return false;
//    }
//}
//

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int q = (a % 1000000 / 100000);
//        int w = (a % 100000 / 10000);
//        int e = (a % 10000 / 1000);
//        int r = (a % 1000 / 100);
//        int t = (a % 100 / 10);
//        int y = (a % 10);
//        System.out.println(q + "" + w + "" + e + "" + r + "" + t + "" + y);
//        int p = q + w + e;
//        System.out.println("birinchi uch sandyn summasy :"+p);
//        int o = y + r + t;
//        System.out.println("ekinchi ych sandyn summsay :" +o);
//        if (p % 2 == 0) {
//            System.out.println("jup sandar");
//        } else
//            System.out.println("tak san");
//            if (o % 2 == 0) {
//                System.out.println("jup san");
//            } else
//            { System.out.println("tak san");}
//            if (p == o) {
//                System.out.println("baktyluu bilet");
//            }else {
//                System.out.println("jonokoi bilet");
//            }
//
//        }
//    }
//        String numbers = q + "" + p;
//        System.out.println(q + "" + p);
//        Integer parsed = Integer.parseInt(numbers);
//        System.out.println("parsed; " + parsed);
//        System.out.println(parsed + 8);
//       System.out.println(q);
//        System.out.println(p);
//        //System.out.print(p + q);







    /*static String weeks() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                return ("Monday");

            case 2:
                return ("Tuesday");

            case 3:
                return ("Wednesday");

            case 4:
                return ("Thursday");

            case 5:
                return ("Friday");

            case 6:

                return ("Saturday");

            case 7:
                return ("Sunday");
            default:
                return ("are you okey,man!!");
        }
    }
}


//        int[] array = {4, 4, 4, 56, 677, 6, 5, 6};
//        System.out.println(contains(array));
//
//    }
//
//
//    static boolean contains(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        if (array[0] == array[5]) ;
//        return true;
//    }
//}


// method(1,2,21,2,21,2,12,2,3,3,3,43,54,65);
        /*  int[] array = {12, 4, 44, 56, 677, 6, 5, 6};
        varargsMethod(array);
        System.out.println(sum(array));
    }


    static void varargsMethod(int... numbers) {
        int d = 0;
        for (int i = 0; i < numbers.length; i++) {
            d = d + numbers[i];

        }
        System.out.println(d);
    }

    static int sum(int... numbers) {
        int s = 0;
        for (int arr : numbers) {
            s += arr;
        }
        return s;
    }
}


//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//    }

//    static String names(String s) {
//        String[] word = {"Cristiano", "lionel", "Kilian", "Zlatan", "Sadio", "Salah", "KBD", "Robert"};
//
//        if (String[]word == s.equals()){
//            System.out.println("siz izdegen soz bar");
//
//        }
//        return s;
//
//        System.out.println("siz izdegen soz jok");
//
//
//    }
//}


//        int[] number ={1, 223, 4, 22, 34, 48, 90, 78, 777};
//        System.out.print("max :");
//        System.out.println(result(number));
//        System.out.println(res(number));
//    }
//
//    static int result(int[] number) {
//        int max = number[number.length-1];
//        for (int i =0; i < number.length; i++) {
//            if (number[i] > max) {
//                max = number[i];
//            }
//        }return max;
//
//    }
//
//    static int res(int[] number) {
//        int min = number[1];
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] < min) {
//                min = number[i];
//            }
//        }return min;
//
//    }
//}

//    static void zadacha() {
//        Scanner scanner = new Scanner(System.in);
//        int c = scanner.nextInt();
//        int q = (c % 10);
//        int p = (c % 100 / 10);
//        String numbers = q + "" + p;
//        System.out.println(q + "" + p);
//        Integer parsed = Integer.parseInt(numbers);
//        System.out.println("parsed; " + parsed);
//        System.out.println(parsed + 8);
//       System.out.println(q);
//        System.out.println(p);
//        //System.out.print(p + q);
//    }
//}


//        int a =1;
//        int b=20;
//
//        int[] number = new int[20];
//        for(int i=0;i<number.length;i++){
//            number[i]=n (a ,b);
//            System.out.println(number[i]);
//        }
//
//
//        }
//
//
//
//static int n(int a int p){
//        Random random = new Random();
//    int c  = random.nextInt(a,b);
//
//    return c;
//
//}


//
//static int returnMethod(){


//        name("Matmusa", 21);
//
//    }
//
//    static void name(String at, int age) {
//        System.out.println("My name is " + at + "   I am  " + age + " years old");
//    }


//        int[] san = {12, 111, 23, 522, 28, 40, 77, 100, 350, 13};
//        max(san);
//        min(san);
//    }
//
//    public static void max(int[] san) {
//        Arrays.sort(san);
//        System.out.println("Max: " + san[9]);
//    }
//
//    public static void min(int[] san) {
//        Arrays.sort(san);
//        System.out.println("Min: " + san[0]);
//    }
//}


        /*   int[] numbers ={1,2,121,21,23,6,76,88};
        System.out.println(Array.toString);
        System.out.println(maxNumbers(numbers));




        static int maxNumber( int [] numbers){Arrays.sort(numbers);
            return numbers[9];


    }
}}

//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//
//        System.out.println(a);
//    }
 2
//
//    static String name(String name) {
//            if (name.length()=<4){
//            return "atunuz kyska";
//            } else  if (name.length()=<7){
//            return "atuuz orto";
//            } else if (name.length()=<9) {
//                        return "atunuz uzun";
//
//
//                    }
//                }
//            }
//
//


//    static String method(int a) {
//        if (a % 2 == 0) {
//            return "jup san";
//        }
//        return "tak san";


//    int a= sc.nextInt();
//    int b= sc.nextInt();
//    int c= sc.nextInt();
//
//        System.out.println(method(12,15,17));
//                }
//static double method(double a,double b,double c)
//        {
//        double sum=(a+b+c)/3;
//        return sum;
//        }
//


//        return "myb first return method";
//
//    static String myFirstReturnMethod() {
//        return "myb first return method";
//
//    }

//    static double myFirstReturnMethod() {
//        return 100.545+66;
//    }

//    static String methods(int a) {
//        if (a < 12) {
//            return "san ondon chon";
//            if (a < 100) {
//                return ("san juzdon chon chon");
//                if (a < 200) {
//                    return ("san eki juzdon  chon");
//                     {
//                        return "tuura emes";
//
//
//                    }
//
//
//                }
//            }
//        }
//    }
//}


//System.out.println(returnMethod("Matmusa", 21));
//        }
//
//static String returnMethod(String a, int b) {
//        return "My name is  " + a + "  I'm " + b + "years old ";
//        }
//        }
//
//**/


