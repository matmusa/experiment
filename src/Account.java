public class Account {
    String name;


    double balance;


     void deposit(double akcha) {

       balance+=akcha;
    }


     void withdrawal(Account Mom, double akcha) {
          balance-=akcha;
         Mom.balance +=akcha;

    }


    }

