import java.util.*;
public class MonthName {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();

        if(m==1){
            System.out.println("January");
        }else if(m==2){
            System.out.println("February");
        }else if(m==3){
            System.out.println("March");
        }else if(m==4){
            System.out.println("April");
        }else if(m==5){
            System.out.println("May");
        }else if(m==6){
            System.out.println("Jun");
        }else if(m==7){
            System.out.println("July");
        }else if(m==8){
            System.out.println("August");
        }else if(m==9){
            System.out.println("September");
        }else if(m==10){
            System.out.println("October");
        }else if(m==11){
            System.out.println("November");
        }else if(m==12){
            System.out.println("December");
        }else{
            System.out.println("Invalid");
        }
    }
}
