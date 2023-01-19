import java.util.*;
public class Yes_yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String str = sc.next();
           /* if(str.equals("Yess") || str.equals("YES") || str.equals("se")){
                System.out.println("NO");
            }
            else
                System.out.println("YES");*/
        if(str.length()>2){
            for(int j=str.length();j>str.length()-3;j--){
                if(str.contains("seY") || str.contains("Yse") || str.contains("eYs") )
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        else if(str.contains("es") || str.contains("Ys"))
            System.out.println("YES");
        else
        System.out.println("NO");
    
}
}
}
