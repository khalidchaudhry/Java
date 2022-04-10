public class BarkingDog {
    public boolean shouldwakeUp(boolean barking,int hourOfDay)
    {
        if(hourOfDay<0 || hourOfDay>23){
            return true;
        }

        if(hourOfDay>22 && hourOfDay<8){
            return true;
        }
        else{
            return false;
        }
    }
}