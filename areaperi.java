import java.util.*;
public class areaperi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int l=sc.nextInt();
        int b=sc.nextInt();

        int area = l*b;
        int peri = 2*(l+b);

        if(area>peri){
            System.out.println(area);
        }else{
            System.out.println(peri);
        }
    }
}
