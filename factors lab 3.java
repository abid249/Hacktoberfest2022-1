//factor
import java.util.*;
class tempCodeRunnerFile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Factors: ");
        for (int a=n; a>0; a--){
            if (n%a==0) {
                System.out.print(a+" ");
            }
        }
    }
}