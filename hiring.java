import java.util.*;
public class hiring{

    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in);

        System.out.println("Press m for married and u for unmarried");

        char status=sc.next().charAt(0);

        System.out.println("Enter your age");

        int age=sc.nextInt();

        System.out.println("Press M for Male and F for Female");

        char gender = sc.next().charAt(0);

        if((status == 'm' || status == 'M') || (age>25 && (gender == 'f' || gender == 'F')|| (age>30 && (gender=='m' || gender == 'M')))){
            System.out.println("You are Hired");
        }else{
            System.out.println("You are Not Hired");
        }
    }
}
