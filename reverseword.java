import java.util.*;
public class reverseword {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        String [] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            str[i]=reverse(str[i]);
        }
        for(String x:str){
            System.out.print(x + " ");
        }

    }
    public static String reverse(String st){
        StringBuilder sc=new StringBuilder(st);
        sc.reverse();
        return sc.toString();
     
    }
    
}
