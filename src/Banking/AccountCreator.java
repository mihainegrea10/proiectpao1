package Banking;

public class AccountCreator {

    private static int uniqueId = 0;

    public static void incrementUniqueId(int inc) {
        AccountCreator.uniqueId += inc;
    }

    public Account createAccount(String name, int customerId){
        return new Account(name, customerId, uniqueId++);
    }

    public SavingsAccount createSavingsAccount(String name, int customerId){
        return new SavingsAccount(name, customerId, uniqueId++);
    }
}