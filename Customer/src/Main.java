public class Main {

    public static void main(String[] args) {
        Customer c1  = new Customer(10,"theo",'f');
	    Account a1  = new Account(10,c1);

        System.out.println(a1.deposit(8).deposit(8).toString()); // fonction de test
    }
}
