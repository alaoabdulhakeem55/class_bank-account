import com.alaoabdulhakeem.BankAccount;

public class Main {

    public static void main(String[] args) {

        BankAccount alaoAccount = new BankAccount();
        System.out.println(alaoAccount.getNumber());
        System.out.println(alaoAccount.getBalance());
        System.out.println(alaoAccount.getCustomerName());
        System.out.println(alaoAccount.getCustomerEmailAddress());
        System.out.println(alaoAccount.getCustomerPhoneNumber());

//        alaoAccount.setNumber("3023823125");
//        alaoAccount.setBalance(00.0);
//        alaoAccount.setCustomerName("Alao");
//        alaoAccount.setCustomerEmailAddress("alaoabdulhakeem@yahoo.com");
//        alaoAccount.setCustomerPhoneNumber("(+234) 806 633 4991");

        alaoAccount.withdrawalAmount(100.0);

        alaoAccount.depositAmount(50.0);
        alaoAccount.withdrawalAmount(100.0);

        alaoAccount.depositAmount(51.0);
        alaoAccount.withdrawalAmount(100.0);

        BankAccount jideAccount = new BankAccount("Jide", "jide@yahoo.com", "4567");
        System.out.println(jideAccount.getNumber() + " name " + jideAccount.getCustomerName());
        System.out.println("Current account balance is " + jideAccount.getBalance());
        jideAccount.withdrawalAmount(100.55);
    }
}