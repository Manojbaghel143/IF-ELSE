import java.util.*;
public class UpperLowerCase {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);

       if(ch>='a'){
        if(ch<='z'){
            System.out.println("Lower case");
        }
    }
    if(ch>='A'){
        if(ch<='Z'){
            System.out.println("Upper case");
        }
    }
    }
}
