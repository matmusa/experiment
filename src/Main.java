import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        Phone phone = new Phone("Apple", "13 pro", "12");
        Phone phone1 = new Phone("Apple", "13 pro", "12");
        Phone phone2 = new Phone("Apple", "13 pro", "12");
        Phone phone3 = new Phone("Apple", "13 pro", "12");
        Phone phone4 = new Phone("Apple", "13 pro", "12");


        person.setPhone(phone);
        person.setFirstName("Matmusa");
        person.setWork("Programist");
        person.setSalary(120000);
        person.setAge(21);
        person.getPhone().setPrice(12999);

        person1.setPhone(phone1);
        person1.setFirstName("Ruslan");
        person1.setWork("Programist");
        person1.setSalary(100000);
        person1.setAge(21);
        person1.getPhone().setPrice(80000);

        person2.setPhone(phone2);
        person2.setFirstName("Abdumomun");
        person2.setWork("Programist");
        person2.setSalary(1110000);
        person2.setAge(20);
        person2.setPhone(phone);
        person2.getPhone().setPrice(12122);


        person3.setPhone(phone3);
        person3.setFirstName("Manas");
        person3.setWork("Programist");
        person3.setSalary(125000);
        person3.setAge(21);
        person3.getPhone().setPrice(19999);


        person4.setPhone(phone4);
        person4.setFirstName("Bakyt");
        person4.setWork("Broker");
        person4.setSalary(90000);
        person4.setAge(26);
        person4.getPhone().setPrice(15999);

        Person[] people = {person, person1, person2, person3, person4,};
        for (Person a : people
        ) {
            System.out.println("\nnames  :" + a.getFirstName() + "\n work  :" + a.getWork() + "\nsalary :" + a.getSalary() + " \n age :" + a.getAge() + "\n price of phone " + a.getPhone().getPrice());

        }
        int[] salaries = {person.getSalary(), person1.getSalary(), person2.getSalary(), person3.getSalary(), person4.getSalary()};

       Arrays.sort(salaries);


        System.out.println("min :"+salaries[0]);
        System.out.println("max :"+salaries[salaries.length-1]);

int []phones={person.getPhone().getPrice(),person1.getPhone().getPrice(),person2.getPhone().getPrice(),person3.getPhone().getPrice(),person4.getPhone().getPrice()};


Arrays.sort(phones);
        System.out.println("\nmax price :"+phones[phones.length-1]);
        }
    }













/*Phone phone=new Phone("Mi","13pro","16");

       phone.setMemory(256);
       phone.setPrice(700);
        System.out.println("\nBrand :"+phone.getBrand()+
        "\nversion  :"+phone.getVersion()+
        "\nscreem :"+phone.getScreem()+
        "\nMemory  :"+phone.getMemory()+
                "\nptice :"+phone.getPrice());
    }
}
   /* Students student6 = new Students();


    Student student1 = new Student("Matmusa ", LocalDate.of(2001, 10, 12), 02333444334, "kyrgyz");
    Student student2 = new Student("Ruslan ", LocalDate.of(2002, 04, 12), 02333444555, "kyrgyz");
    Student student3 = new Student("Abdumomun", LocalDate.of(2005, 07, 15), 0233344443, "kyrgyz");
    Student student4 = new Student("Samat ", LocalDate.of(2001, 11, 12), 02333445454, "kyrgyz");
    Student student5 = new Student("Murat ", LocalDate.of(2000, 9, 11), 02333444464, "kyrgyz");

    Student[] student = {student1, student2, student3, student4, student5};
        for(Student s:student
                ){
                System.out.println("\nnames of studants  :"+s.getFirsName()+
                "\n student ages "+s.getLocalDate()
                +"\nstudent phone number  :"+s.getPhoneNumber()+
                "\nstudents nationality  :"+s.getNationality());

                }


                }
                }


//Triangle triangle=new Triangle(12,12, 12);
//
//        System.out.println(( "S="+(triangle.getA()* triangle.getB())/2));
//





     /*   Country country1 = new Country();
        country1.setContinent("Central Asia ");
        country1.setName("Kyrgyzstan");
        country1.setLanguage("Kyrgyz");
        country1.setPeople(7000000);

        Country[] country = new Country[]{country1};

        City city1 = new City();
        city1.setNameOfCity("Bishkek");
        city1.setRegions(7);
        city1.setArea(40);
        city1.setVillage(453);
        City[] city = new City[]{city1};

        Address address1 = new Address();
        address1.setNameOfRegion("Chyi");
        address1.setNameOfArea("Sokuluk");
        address1.setNameOfStreet("1-may");
        address1.setNumberOfHome(11);

        Address[] addresses = new Address[]{address1};

        Person person1 = new Person();
        person1.setFirstName("Matmusa ");
        person1.setLastName("Abduvokhob uulu");
        person1.setAge(21);
        person1.setGender('M');

        Person[] person = new Person[]{person1};
        for (Country a : country
        ) {
            System.out.println("\n Continent  :" + a.getContinent() + " \nName of country  :" + a.getName() + "\nlanguage of country : " + a.getLanguage() + "\n" + a.getPeople() + "  people lives in Kyrgyzstan");

        }

        for (City a : city
        ) {
            System.out.println("\n name of city :"+a.getNameOfCity()+"\n quantity of  regions :"+a.getRegions()+"\nquantity of district :"+a.getDistrict()+"\n quantity of villages  :"+a.getVillage());

        }

        for (Address a:addresses
             ) {
            System.out.println("\nRegion  :"+a.getNameOfRegion()+"\n district "+a.getNameOfArea()+"\n Street :"+a.getNameOfStreet()+" \nnumber of home "+a.getNumberOfHome());

        }
        for (Person a:person
             ) {
            System.out.println("\n first name :"+a.getFirstName()+"\n last name :"+a.getLastName()+"\n age " +a.getAge()+"\ngender :"+a.getGender());

        }





    }
}


//            Person person = new Person();
//            person.firstName = " Matmusa ";
//            person.lastName = "Tashtanov";
//            person.localDate = LocalDate.of(2001, 10, 12);
//            person.gender = 'M';
//
//            Person person2 = new Person();
//            person2.firstName = " Bahtiyar ";
//            person2.lastName = "Borubai uulu";
//            person2.localDate = LocalDate.of(2003, 11, 24);
//            person2.gender = 'M';
//
//
//            Wallet wallet = new Wallet();
//            wallet.walletMoney = 1000;
//            wallet.card = 1000;
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("\n vyberite operatsy " +
//                              "\n * vyvod deneg iz koshelka" +
//                              "\n @ vyvod deneg iz elektronnogo kashelka" +
//                              "\n #  popolnenie ");
//            char Money = scanner.next().charAt(0);
//        System.out.println("\nnapishite suumu:");
//
//            if (Money == '*') {
//                wallet.payInCash(scanner.nextInt());
//
//        }else if (Money=='@') {
//                wallet.payWithCard(scanner.nextInt());
//            }else {wallet.addMoneyToCard(scanner.nextInt());}
//
//                System.out.println( wallet.walletMoney +" or"+
//                wallet.card );
//        }
//    }
//
//
//












        /*
        Company company =new Company();
        company.companyName="Peaksoft House";
        company.country="Kyrgyzstan";
        company.yearOfFondation=2022;

        Group group = new Group();
        group.groupName = "Java";
        group.startDate = 2022;

        Group group2 = new Group();
        group2.groupName = "Js";
        group2.startDate = 2022;

        Group[] groups = new Group[]{group2, group};
        company.group = groups;

        for (int i = 0; i < company.group.length; i++) {
            System.out.println(company.group[i].groupName);
            System.out.println(company.group[i].startDate);
        }

        company.person.firstName="Stive ";
        company.person.lastName="Djobs";
        company.person.age=21;

        System.out.println("\nName of company :"+company.companyName+
        "\nCountry"+company.country+
        "\nyear of foundation"+company.yearOfFondation+
                "\n name of  group"+company.group
               );























//        Person person=new Person();
//        person.setFirstName("Matmusa");
//        person.setLastName("Tashtanov");
//        person.setAge(21);
//        person.setProfession("Dreamer");
//        person.setGender('M');
//
//        System.out.println(" \nAty:"+person.getFirstName()+
//                            "\nfamialyisy :"+person.getLastName()+
//                            "\nJashy :"+person.getAge()+
//                            "\n jynysy :" +person.getGender()+
//                       b      "\nProfesiasy :"+person.getProfession());

    }
}












        /*while (true) {
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
*/









