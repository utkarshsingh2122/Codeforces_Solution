import java.util.*;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double b=0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            b+=a;
        }
        b=b/n;
        System.out.println(b);
    }
}
