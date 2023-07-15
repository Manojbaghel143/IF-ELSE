import java.util.*;
public class Persentage {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        int Ch=sc.nextInt();
        int Ph=sc.nextInt();
        int Bi=sc.nextInt();
        int Ma=sc.nextInt();
        int Co=sc.nextInt();

        int sum=Ch+Ph+Bi+Ma+Co;
        int Per=(sum/5);

        if(Per>=90){
            System.out.println("Grade A");
        }else if(Per>=80){
            System.out.println("Grade B");
        }else if(Per>=70){
            System.out.println("Grade C");
        }else if(Per>=60){
            System.out.println("Grade D");
        }else if(Per>=50){
            System.out.println("Grade E");
        }else{
            System.out.println("Fail");
        }
        
    }
}
