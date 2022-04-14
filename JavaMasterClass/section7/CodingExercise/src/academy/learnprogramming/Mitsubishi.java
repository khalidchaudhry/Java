package academy.learnprogramming;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinder, String name) {
        super(cylinder,name);
    }
    @Override
    public String startEngine(){
       return getClass().getSimpleName()+" -> startEngine()";
    }
    @Override
    public String accelerate(){
        return getClass().getSimpleName()+" -> accelerate()";
    }
    @Override
    public String brake(){
        return getClass().getSimpleName()+" -> brake()";
    }
}
