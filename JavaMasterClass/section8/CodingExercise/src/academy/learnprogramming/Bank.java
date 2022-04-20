package academy.learnprogramming;

import java.util.ArrayList;
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches=new ArrayList<Branch>();
    }
    public boolean addBranch(String name){
        if(findBranch(name)==null){
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName,String customerName,double transaction){
        Branch existingBranch=findBranch(branchName);
        if(existingBranch==null){
            return false;
        }
        ArrayList<Customer> existingCustomers=existingBranch.getCustomers();
       for(int i=0;i<existingCustomers.size();++i){
           if(existingCustomers.get(i).getName().equals(customerName)){
               return false;
           }
       }
        existingBranch.newCustomer(customerName,transaction);
        return true;
    }
    public boolean addCustomerTransaction(String branchName,String customerName,double transaction){
        Branch existingBranch=findBranch(branchName);
        if(existingBranch==null){
            return false;
        }
        ArrayList<Customer> existingCustomers=existingBranch.getCustomers();
        for(int i=0;i<existingCustomers.size();++i){
            if(existingCustomers.get(i).getName().equals(customerName)){
                existingBranch.addCustomerTransaction(customerName,transaction);
                return true;
            }
        }
        return false;
    }
    private Branch findBranch(String name){
      for(int i=0;i<branches.size();++i){
          if(branches.get(i).getName().equals(name)){
              return branches.get(i);
          }
      }
      return null;
    }
    public boolean listCustomers(String branchName,boolean printTransactions){
        Branch existingBranch=findBranch(branchName);
        if(existingBranch==null){
         return false;
        }

            System.out.println("Customer details for branch "+ existingBranch.getName());

            ArrayList<Customer> customers=existingBranch.getCustomers();
            for(int i=0;i<customers.size();++i){
                System.out.println("Customer: " + customers.get(i).getName() + "[" + (i+1) + "]");
                if(printTransactions){
                ArrayList<Double> transactions=customers.get(i).getTransactions();
                System.out.println("Transactions");
                for(int j=0;j<transactions.size();++j){
                    System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                }
            }
        }
        return true;
    }
}
