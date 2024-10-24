import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr=new int[100];
        int cnt=0;
        int sum=0;
        for(int i=0;i<=arr.length;i++){
            if(i%2==0){
                System.out.println(i+" even");
                sum+=i;
                cnt++;
               
            }
            else{
                System.out.println(i+" odd");
            }
        }
        int avg=sum/cnt;
        System.out.println(avg);
       
       
       
    


        
    }
}
