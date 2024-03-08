import java.util.Scanner;
public class Assignment{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enetr your two nym");
        int a=input.nextInt();
        int b=input.nextInt();
        try {
            int result=a/b;
            System.out.println("Result:"+ result);
            
        } catch (Exception e) {
            System.out.println("exception occured");
        }
    }
}