public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        if(goal>(bigCount*5 +smallCount)){
            return false;
        }
        int bigKgs=bigCount*5;
        int smallKgs=smallCount*1;

        if(goal>=bigKgs){
            if(bigKgs>0){
                goal=goal%bigKgs;
            }
        }
        else{
         

        }
        if(goal<=smallKgs){
            return true;
        }
        else{
            return false;
        }
    }
}