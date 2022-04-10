public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
    if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0){
        return -1;
    }
    double area=width*height;
    double coveredArea=areaPerBucket*extraBuckets;
    double remainingArea=area-coveredArea;
    return getBucketCount(remainingArea,areaPerBucket);
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
       return getBucketCount(width,height,areaPerBucket,0);
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0 || areaPerBucket<=0){
            return -1;
        }
         int bucketsNeeded=(int)Math.ceil(area/areaPerBucket);
        return bucketsNeeded;
    }
}
