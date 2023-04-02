import Banking.*;
import Customer.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class Main {

    static List<String> availableCommands = Arrays.asList("create_customer", "create_customer_card", "get_customer", "get_customer_amount", "get_customer_accounts", "load_customer_account", "create_transaction", "create_customer_account", "create_customer_savings_account", "close_customer_account", "get_customer_transactions", "help", "end");
    static List<String> commandsDescriptions = Arrays.asList("Creează cont client", "Creează card client", "Afișare detalii client", "Preluare sold client", "Preluare conturi client", "Încărcare cont client", "Creeare tranzacție", "Creare cont client", "Creare cont de economii", "Închidere cont client", "Preluare transacții client", "Afișează comenzi", "Finalizare");

    public static Connection getConnection() {
        try{
            String url = "jdbc:mysql://localhost:3306/proiectpao";
            String user = "root";
            String password = "rqbJVALFjsfeaKAp";

            return DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }

    private static void printAllCommands(){
        for(int i=0;i<availableCommands.size();++i)
            System.out.println((i+1) + ". " + commandsDescriptions.get(i) + " (" + availableCommands.get(i) + ")");
    }







    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean end = false;
        MainService mainService = new MainService();




        mainService.linkAccounts();

        while (!end){
            System.out.println("Insert command: (help - see commands)");
            String command = in.nextLine().toLowerCase(Locale.ROOT);
            try{
                switch (command) {
                    case "create_customer" -> mainService.createCustomer(in);
                    case "create_customer_card" -> mainService.createCustomerCard(in);
                    case "get_customer" -> mainService.getCustomer(in);
                    case "get_customer_amount" -> mainService.getCustomerAmount(in);
                    case "get_customer_accounts" -> mainService.getCustomerAccounts(in);
                    case "get_customer_account" -> mainService.getCustomerAccount(in);
                    case "load_customer_account" -> mainService.loadCustomerAccount(in);
                    case "create_transaction" -> mainService.createTransaction(in);
                    case "create_customer_account" -> mainService.createCustomerAccount(in);
                    case "create_customer_savings_account" -> mainService.createCustomerSavingsAccount(in);
                    case "close_customer_account" -> mainService.closeAccount(in);
                    case "get_customer_transactions" -> mainService.getCustomerTransactions(in);
                    case "help" -> Main.printAllCommands();
                    case "end" -> end = true;
                }
            }catch (Exception e){
                System.out.println(e.toString());
            }
        }


        }



}
