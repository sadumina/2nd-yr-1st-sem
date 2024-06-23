import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*;

public class Ex3{
 
       public static void main(String args[])throws IOException{


       InputStreamReader isr=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(isr);


       //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



      System.out.print("Enter Your Salary:");
      double Salary= Double.parseDouble(br.readLine());

   }




}