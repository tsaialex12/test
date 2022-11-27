
class CC{
    int length;
    int width;
    int high;
    int radius;

    void ans(int l,int w,int h,int r){
        high=h;width=w;length=l;radius=r;
    }
    void Cal_area(){
        System.out.printf("半徑 = %d\n",radius);
        System.out.printf("面積= %.1f\n",(4*radius*radius*Math.PI/3));
        System.out.println();
        System.out.printf("長 = %d ,寬 = %d ,高 = %d\n",length,width,high);
        System.out.printf("立體體表面積 = %d\n",length*width*2+length*high*2+width*high*2);
    }

}
public class Class01 {
    public static void main(String[] args) {
        CC bb=new CC();
        bb.ans(4,5,6,10);
        bb.Cal_area();
    }
}
