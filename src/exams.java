import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exams {
    public static void main(String[] args) {}}

//        int l=chtoto();
//        int[] array = new int[11];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.(l));
//        }
//    }
//
//
//    static int chtoto() {
//        Random random = new Random();
//        int a = random.nextInt(3, 7);
//
//
//        return a;
//    }
//}
//
//
//























      /* while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Чтобы включить телевизор нажмите *");
            int a = scanner1.next().charAt(0);
            if (a == '*') {
                channelsList();
            }

        }
    }
    static void onOff() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Чтобы включить телевизор нажмите *");
            int a = scanner1.next().charAt(0);
            if (a == '*') {
                channelsList();
            }
        }

    }

    static void channelsList() {

        System.out.print("\n___________________" +
                " \n |1.ktrk                        |" +
                " \n|2.ktrkSport                   |" +
                " \n|3 ktrkBalastan                |" +
                " \n|4.ktrkMadaniyat               |" +
                " \n|5.ktrkAlaToo24                |" +
                " \n|6.МАДАНИЯТ                    |" +
                " \n|7.eltr                        |" +
                "\n|8.jalbyrak                     |" +
                "\n|9.piramida                     |" +
                " \n|                               |" +
                "\n|____________________          |");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\nВыберите канал  :");
        int a = scanner1.next().charAt(0);
        if (a == '1') {
            ktrk();
        } else if
        (a == '2') {
            ktrkSport();

        } else if (a == '3') {
            ktrkBalastan();

        } else if (a == '4') {
            ktrkMuzyka();

        } else if (a == '5') {
            ktrkMadaniyat();

        } else if (a == '6') {
            ktrkAlaToo24();

        } else if (a == '7') {
            eltr();

        } else if (a == '8') {
            jalbyrak();

        } else if (a == '9') {
            piramida();

        }
    }
    static void ktrk() {

        while (true) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("ktrk" +
                    "\nследуюший канал +" +
                    "\nпредедущий канал-" +
                    "\nна главный меню @" +
                    "\nчтобы отключить телевизор #");


            int a = scanner1.next().charAt(0);
            if (a == '+') {
                ktrkSport();
            } else if (a == '#') {
                onOff();

            } else if (a == '-') {
               piramida();
            } else if (a == '@') {
                channelsList();
            } else if (a == '1') {
                ktrk();
            } else if
            (a == '2') {
                ktrkSport();

            } else if (a == '3') {
                ktrkBalastan();

            } else if (a == '4') {
                ktrkMuzyka();

            } else if (a == '5') {
                ktrkMadaniyat();

            } else if (a == '6') {
                ktrkAlaToo24();

            } else if (a == '7') {
                eltr();

            } else if (a == '8') {
                jalbyrak();

            } else if (a == '9') {
                piramida();

            }

        }
    }
    static void ktrkSport() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("ktrkSport" +
                    "\nследуюший канал +" +
                    "\nпредедущий канал-" +
                    "\nна главный меню @" +
                    "\nчтобы отключить телевизор #");


            int a = scanner1.next().charAt(0);
            if (a == '+') {
                ktrkBalastan();

            } else if (a == '-') {
                ktrk();
            } else if (a == '@') {
                channelsList();
            } else if (a == '#') {
                onOff();
            } else if (a == '1') {
                ktrk();
            } else if
            (a == '2') {
                ktrkSport();

            } else if (a == '3') {
                ktrkBalastan();

            } else if (a == '4') {
                ktrkMuzyka();

            } else if (a == '5') {
                ktrkMadaniyat();

            } else if (a == '6') {
                ktrkAlaToo24();

            } else if (a == '7') {
                eltr();

            } else if (a == '8') {
                jalbyrak();

            } else if (a == '9') {
                piramida();

            }


        }


    }

    static void ktrkBalastan() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("ktrkBalastan" +
                    "\nследуюший канал +" +
                    "\nпредедущий канал-" +
                    "\nна главный меню @" +
                    "\nчтобы отключить телевизор #");


            int a = scanner1.next().charAt(0);
            if (a == '+') {
                ktrkMuzyka();

            } else if (a == '-') {
                ktrkSport();
            } else if (a == '@') {
                channelsList();
            } else if (a == '#') {
                onOff();
            } else if (a == '1') {
                ktrk();
            } else if
            (a == '2') {
                ktrkSport();

            } else if (a == '3') {
                ktrkBalastan();

            } else if (a == '4') {
                ktrkMuzyka();

            } else if (a == '5') {
                ktrkMadaniyat();

            } else if (a == '6') {
                ktrkAlaToo24();

            } else if (a == '7') {
                eltr();

            } else if (a == '8') {
                jalbyrak();

            } else if (a == '9') {
                piramida();

            }
        }
    }


    static void ktrkMuzyka() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("ktrkMyzyka" +
                    "\nследуюший канал +" +
                    "\nпредедущий канал-" +
                    "\nна главный меню @" +
                    "\nчтобы отключить телевизор #");


            int a = scanner1.next().charAt(0);
            if (a == '+') {
                ktrkMadaniyat();

            } else if (a == '-') {
                ktrkBalastan();
            } else if (a == '@') {
                channelsList();
            } else if (a == '#') {
                onOff();

            } else if (a == '1') {
                ktrk();
            } else if
            (a == '2') {
                ktrkSport();

            } else if (a == '3') {
                ktrkBalastan();

            } else if (a == '4') {
                ktrkMuzyka();

            } else if (a == '5') {
                ktrkMadaniyat();

            } else if (a == '6') {
                ktrkAlaToo24();

            } else if (a == '7') {
                eltr();

            } else if (a == '8') {
                jalbyrak();

            } else if (a == '9') {
                piramida();

            }
        }

    }

    static void ktrkMadaniyat() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("ktrkMadaniyat" +
                    "\nследуюший канал +" +
                    "\nпредедущий канал-" +
                    "\nна главный меню @" +
                    "\nчтобы отключить телевизор #");


            int a = scanner1.next().charAt(0);
            if (a == '+') {
                ktrkAlaToo24();

            } else if (a == '-') {
                ktrkMuzyka();
            } else if (a == '@') {
                channelsList();
            } else if (a == '#') {
                onOff();
            } else if (a == '1') {
                ktrk();
            } else if
            (a == '2') {
                ktrkSport();

            } else if (a == '3') {
                ktrkBalastan();

            } else if (a == '4') {
                ktrkMuzyka();

            } else if (a == '5') {
                ktrkMadaniyat();

            } else if (a == '6') {
                ktrkAlaToo24();

            } else if (a == '7') {
                eltr();

            } else if (a == '8') {
                jalbyrak();

            } else if (a == '9') {
                piramida();

            }
        }


    }

    static void ktrkAlaToo24() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("ktrkAlaToo24" +
                    "\nследуюший канал +" +
                    "\nпредедущий канал-" +
                    "\nна главный меню @" +
                    "\nчтобы отключить телевизор #");


            int a = scanner1.next().charAt(0);
            if (a == '+') {
                eltr();

            } else if (a == '-') {
                ktrkMadaniyat();
            } else if (a == '@') {
                channelsList();
            } else if (a == '#') {
                onOff();
            } else if (a == '1') {
                ktrk();
            } else if
            (a == '2') {
                ktrkSport();

            } else if (a == '3') {
                ktrkBalastan();

            } else if (a == '4') {
                ktrkMuzyka();

            } else if (a == '5') {
                ktrkMadaniyat();

            } else if (a == '6') {
                ktrkAlaToo24();

            } else if (a == '7') {
                eltr();

            } else if (a == '8') {
                jalbyrak();

            } else if (a == '9') {
                piramida();

            }
        }

    }

    static void eltr() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("eltr" +
                    "\nследуюший канал +" +
                    "\nпредедущий канал-" +
                    "\nна главный меню @" +
                    "\nчтобы отключить телевизор #");


            int a = scanner1.next().charAt(0);
            if (a == '+') {
                jalbyrak();

            } else if (a == '-') {
                ktrkAlaToo24();
            } else if (a == '@') {
                channelsList();
            } else if (a == '#') {
                onOff();
            } else if (a == '1') {
                ktrk();
            } else if
            (a == '2') {
                ktrkSport();

            } else if (a == '3') {
                ktrkBalastan();

            } else if (a == '4') {
                ktrkMuzyka();

            } else if (a == '5') {
                ktrkMadaniyat();

            } else if (a == '6') {
                ktrkAlaToo24();

            } else if (a == '7') {
                eltr();

            } else if (a == '8') {
                jalbyrak();

            } else if (a == '9') {
                piramida();

            }
        }


    }

    static void jalbyrak() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("jalbyrak" +
                    "\nследуюший канал +" +
                    "\nпредедущий канал-" +
                    "\nна главный меню @" +
                    "\nчтобы отключить телевизор #");


            int a = scanner1.next().charAt(0);
            if (a == '+') {
                piramida();

            } else if (a == '-') {
                eltr();
            } else if (a == '@') {
                channelsList();
            } else if (a == '#') {
                onOff();
            } else if (a == '1') {
                ktrk();
            } else if
            (a == '2') {
                ktrkSport();

            } else if (a == '3') {
                ktrkBalastan();

            } else if (a == '4') {
                ktrkMuzyka();

            } else if (a == '5') {
                ktrkMadaniyat();

            } else if (a == '6') {
                ktrkAlaToo24();

            } else if (a == '7') {
                eltr();

            } else if (a == '8') {
                jalbyrak();

            } else if (a == '9') {
                piramida();

            }
        }


    }


    static void piramida() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("piramida" +
                    "\nследуюший канал +" +
                    "\nпредедущий канал-" +
                    "\nна главный меню @" +
                    "\nчтобы отключить телевизор #");


            int a = scanner1.next().charAt(0);
            if (a == '+') {
                ktrk();

            } else if (a == '-') {
                jalbyrak();
            } else if (a == '@') {
                channelsList();
            } else if (a == '#') {
                onOff();
            } else if (a == '1') {
                ktrk();
            } else if
            (a == '2') {
                ktrkSport();

            } else if (a == '3') {
                ktrkBalastan();

            } else if (a == '4') {
                ktrkMuzyka();

            } else if (a == '5') {
                ktrkMadaniyat();

            } else if (a == '6') {
                ktrkAlaToo24();

            } else if (a == '7') {
                eltr();

            } else if (a == '8') {
                jalbyrak();

            } else if (a == '9') {
                piramida();

            }
        }


    }

}*/


//        while (true) {
//            Scanner scanner1 = new Scanner(System.in);
//            System.out.println("Чтобы включить телевизор нажмите * ");
//            int s = scanner1.next().charAt(0);
//             System.out.println("Выберите канал");
//            System.out.print("\n___________________" +
//                    "|\n 1.КТРК                   |" +
//                    " \n|2.АЛА-ТОО 24             |" +
//                    " \n|3.МУЗЫКА                 |" +
//                    " \n|4.БАЛАСТАН               |" +
//                    " \n|5.КТРК СПОРТ             |" +
//                    " \n|6.МАДАНИЯТ               |" +
//                    " \n|7.ЭЛТР                   |" +
//                    "\n|8.ПИРАМИДА                |" +
//                    "\n|9.ЖАЛБЫРАК                |" +
//                    " \n10.АПРЕЛЬ                 |" +
//                    "\n|____________________      |");
//            System.out.println("\nвыберите канал  :");
//       //   int a = scanner1.nextInt();
//            if (s == '*') {
//               ChanelList();
//
//
//            }
//        }
//    }
//
//
//     static void ChanelList() {
//        while (true) {
//            Scanner scanner1 = new Scanner(System.in);
//            Scanner scanner = new Scanner(System.in);
//           // char s = scanner.next().charAt(0);
//////
//
//            int a = scanner1.next().charAt(0);
//
//            if (a == '+') {
//               a++;
//            } else if (a == '-') {
//                a--;
//
//            }
//            if (a == 10) {
//                a = 1;
//            }
//
//
//            if (a == '1') {
//                System.out.println("КТРК");
//            } else if
//            (a == '2') {
//                System.out.println("АЛА-ТОО 24");
//            } else if (a == '3') {
//                System.out.println("МУЗЫКА");
//            } else if (a == '4') {
//                System.out.println("БАЛАСТАН");
//            } else if (a == '5') {
//                    System.out.println("КТРК СПОРТ");
//                } else if (a =='6') {
//                    System.out.println("МАДАНИЯТ ");
//                } else if (a == '7') {
//                    System.out.println("ЭЛТР");
//                } else if (a == '8') {
//                    System.out.println("ПИРАМИДА");
//                } else if (a == '9') {
//                    System.out.println("ЖАЛБЫРАК");
//
//
//
//                }
//            }
//        }
//    }

//    static void channels() {
//
//        System.out.print("\n______________" +
//                "|\n 1.КТРК                   |" +
//                " \n|2.АЛА-ТОО 24             |" +
//                " \n|3.МУЗЫКА                 |" +
//                " \n|4.БАЛАСТАН               |" +
//                " \n|5.КТРК СПОРТ             |" +
//                " \n|6.МАДАНИЯТ               |" +
//                " \n|7.ЭЛТР                   |" +
//                "\n|8.ПИРАМИДА                |" +
//                "\n|9.ЖАЛБЫРАК                |" +
//                " \n10.АПРЕЛЬ                |" +
//                "\n|___________________       |");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\nвыберите канал :");
//        int b = scanner.nextInt();
//        int a= scanner.nextInt();
//        if (b==a ) {ChanelList(a);
//
//        }
//    }
//}
//


//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        String[] names = {"Stive DJobs", "Bill Gates", "Elon Musk", " Sergey Galitsky", "Li Yokoko"};
//        namesOfBussnesMans(names, name);
//    }
//
//    static void namesOfBussnesMans(String[] names, String name) {
//        int sak = 0;
//        for (int i = 0; i < names.length; i++) {
//            if (names[i].equals(name)) {
//                System.out.println(" siz izdegen at bar ");
//                sak++;
//            }
//        }
//        if (sak == 0) {
//            System.out.println("siz izdegen at jok");
//
//        }
//
//    }
//}
//
//






        /* Random random = new Random();
        int[] array = new int[random.nextInt(10,15)];
        System.out.println(array.length+" is leangth");

        System.out.println(Arrays.toString(exams2(array)));
    }

    static int[] exams2(int[] array) {

        int a =9;
        for (int i = 0; i < array.length; i++) {


                array[i] =i * a;

            }




        return array;

    }
}


//        Scanner scanner = new Scanner(System.in);
//        int s = scanner.nextInt();
//        int t = scanner.nextInt();
//        int r = scanner.nextInt();
// String r = scanner.nextLine();

//int[] array = {1, 2, 3, 3, 4445, 5656};


//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Write number1:");
//        int s = scanner.nextInt();
//        System.out.println("Choose operator");
//        String r = scanner1.nextLine();
//        System.out.println("Write number2");
//        int t = scanner.nextInt();
//
//        System.out.println(getNumber(s, r, t));
//    }
//
//    public static int getNumber(int number1, String symbol, int number2) {
//        switch (symbol) {
//
//            case ("+"):
//               return (number1 + number2);
//
//            case ("-"):
//                return (number1 - number2);
//
//            case ("*"):
//                return (number1 * number2);
//
//
//            case ("/"):
//            return     (number1 / number2);
//            default:
//                return 00;
//
//        }
//    }

 public static void MySecond(int []array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }
        }
   }*/
