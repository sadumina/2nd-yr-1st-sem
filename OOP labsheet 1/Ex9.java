import java.util.Scanner;

public class Ex9{
   
   public static void main(String args[]){

   Scanner sc=new Scanner(System.in);
   
 

   System.out.println("Enter the number 1:");
    int a=sc.nextInt();

   System.out.println("Enter the number 2:");
   int b=sc.nextInt();
   
    int sum=a+b;
   System.out.println("sum of numbers"+sum);


   int avg=sum/2;
   System.out.println("avg of numbers"+avg);

}


}