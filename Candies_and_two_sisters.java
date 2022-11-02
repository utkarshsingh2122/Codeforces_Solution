
import java.util.*;
public class Candies_and_two_sisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int count=0;
            int n1=sc.nextInt();
            int n2=n1/2;
            if(n1==0 || n1==1 || n1==2){
                System.out.println("0");
            }
            else if(n1%2==0){
                System.out.println(n2-1);
                }
            else if(n1%2==1){
                System.out.println(n2);
                }
            }
        }
    }
