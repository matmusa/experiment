import java.util.*;


public class Main {
    public static void main(String[] args) {
        while (true) {
            Account men = new Account();
            Account Mom = new Account();
            Account Sister = new Account();
            Account Brother = new Account();
            men.balance = 100000;
            Mom.balance = 10000;
            Sister.balance = 5000;
            Brother.balance = 99;
            Scanner scanner = new Scanner(System.in);
            System.out.println("" +
                    "\n Добро пожалавать в систему перевoдов СБЕР банк! " +
                    "\n На вашем счету есть :  " + men.balance + " сом" +
                    "\n выберите кому перевести деньги " +
                    "\n1.Mom  :" + Mom.balance +
                    "\n2.Sister :" + Sister.balance +
                    "\n3.Brother :" + Brother.balance);


            System.out.println("\n кому перевести деньги(1,2,3): ");
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("\nнапишите сумму для перевода :");
                men.withdrawal(Mom, scanner.nextDouble());
                System.out.println("Mom   :" + Mom.balance + "cом ");
            } else if (a == 2) {
                System.out.println("\nнапишите сумму для перевода :");
                men.withdrawal(Sister, scanner.nextDouble());
                System.out.println("Sister  :" + Sister.balance + "cом ");

            } else if (a == 3) {
                System.out.println("\nнапишите сумму для перевода :");
                men.withdrawal(Brother, scanner.nextDouble());
                System.out.println("brother   :" + Brother.balance + "cом ");
            }
            System.out.println("\n Ваш нынешний счет :" + men.balance + "сом");

        }


    }
}

//
//        Students students = new Students();
//        Students students1 = new Students();
//        Students students2 = new Students();
//        Students students3 = new Students();
//        Students students4 = new Students();
//
//        students.name = "Ruslan";
//        students.age = 20;
//        students.group = "java";
//
//
//        students1.name = "Bahtiyar";
//        students1.age = 19;
//        students1.group = "java";
//
//        students2.name = "Gulzat";
//        students2.age = 18;
//        students2.group = "js";
//
//        students3.name = "erbol";
//        students3.age = 22;
//        students3.group = "js";
//
//        students4.name = "Abdumomun";
//        students4.age = 17;
//        students4.group = "java";
//
//        Students[] array = {students, students1, students2, students3, students4};
//        int a = 0;
//        int s = 0;
//        for (int i = 0; i < array.length; i++) {
//            a = ((a + array[i].age)/ array.length );
//            {
//
//            }
//
//            }
//            System.out.println(a  );
//        }
//    }

//           if (array[i].group.equals("java")) {
//               a++;
//           } else if (array[i].group.equals("js")) {
//               b++;
//           }
//       }
//                System.out.println("javadagy studentterdin sany :" +a);
//           System.out.println("jstegi studenterdin sany :"+b);
//        }
//
//    }


//        while (true) {
//
//
//            Seasons seasons = new Seasons();
//            System.out.println("choose the seoson  :");
//
//            Seasons.seosons();
//
//
//        }
//    }
//}
//

//        Random random = new Random();
//
//        Passport passport = new Passport();
//        passport.id = random.nextInt(1, 6);
//        passport.firstName = "Rayim";
//        passport.lastName = "Million";
//        passport.gender = "man";
//        passport.yearOfBirht = 1971;
//        passport.CountryOfBirth = "Kyrgyzstan";
//
//        System.out.println(" \nAty :" + passport.firstName + "\nkaimana aty :" + passport.lastName + "\ntuulgan jery :" + passport.CountryOfBirth + "\n Tuulgan jyly :" + passport.yearOfBirht + "\nunicalduu Id nomeri" + passport);
//

//Anymals anymals=new Anymals();
//Anymals.paroda();
//anymals.type="Dog";
//anymals.year=2018;
//anymals.color="black";
//anymals.breed="ofcharka";
//anymals.weigh=23;
//
//
//Anymals anymals1= new Anymals();
//
//        anymals1.type="Cow";
//        anymals1.year=2020;
//        anymals1.color="black";
//        anymals1.breed="Ala-too";
//        anymals1.weigh=120;
//
//
//        System.out.println( "\nMy "+anymals.type+" is"+anymals.color+""+anymals.breed +"and was born"+anymals.year+
//                "\nMy "+anymals1.type+" is"+anymals1.color+"  "+anymals1.breed +"and was born"+anymals1.year  );
//
//
//
//


//        Car car=new Car();
//        car.brand="Tesla";
//        car.year=2023;
//        car.color="white";
//
//        Car car1=new Car();
//        car1.brand="Volkswagen";
//        car1.year=1994;
//        car1.color="green";
//
//        System.out.println("\nMy first car is "+car1.brand+"," +"but my favorite car "+car.brand);
//


//        Car car = new Car();
//        car.name = "Tesla";
//        car.price = 50000;
//        car.year = 2021;
//        car.color = "white";
//        System.out.println("\nName : " + car.name +
//                "\nprice  :" + car.price +
//                "\nyear of issue  :" + car.year +
//                "\ncolor of car  :" + car.color);
//










