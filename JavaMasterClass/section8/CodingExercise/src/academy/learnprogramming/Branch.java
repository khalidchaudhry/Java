package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private  String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers= new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }
    public boolean newCustomer(String name,double initialTransaction){
        if(findCustomer(name)==null){
            customers.add(new Customer(name,initialTransaction));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String name,double transaction){
        Customer existingCustomer=findCustomer(name);
        if(existingCustomer==null){
            return false;
        }
        existingCustomer.addTransaction(transaction);
        return true;
    }
    public Customer findCustomer(String name){
        for(int i=0;i<customers.size();++i){
            if(customers.get(i).getName().equals(name)){
                return  customers.get(i);
            }
        }
        return null;
    }
}
