package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        if(age>=0 && age<=100) {
            this.age = age;
        }
        else {
            this.age=0;
        }
    }
    public boolean isTeen(){
        return this.age>12 && this.age<20;
    }
    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return  "";
        }
        if(this.lastName.isEmpty()){
            return this.firstName;
        }
        if(this.firstName.isEmpty()){
            return this.lastName;
        }
        return this.firstName+" "+this.lastName;
    }
}
