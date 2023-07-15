import java.util.*;
public class YoungestPeople {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int Ram = sc.nextInt();
        int Shyam = sc.nextInt();
        int Ajay = sc.nextInt();

        if(Ram<Shyam && Ram<Ajay){
            System.out.println("Ram");
        }else if(Shyam<Ram && Shyam<Ajay){
            System.out.println("Shyam");
        }else{
            System.out.println("Ajay");
        }
        
    }
}
