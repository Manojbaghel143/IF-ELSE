
public class age{
    public static void main(String[] args) {
        int a=15;
        int b=19;
        int c=97;
        if(a<b){
                if(b<c){
                    System.out.println(a);
                }else{
                    System.out.println(c);
                }
        }else if(b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }  
    }
}
