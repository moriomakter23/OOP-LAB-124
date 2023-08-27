//write a java program to calculate the area of circle

package mycompany.oop1sttask;
import java.util.Scanner;
public class AreaofCircle {
    
    public static void main(String[]args){
       Scanner input = new Scanner (System.in);
       int radius;
       double area; 
       System.out.print("enter radius=");
       radius = input.nextInt();
       area = (float)3.1416*radius*radius;
       System.out.print("area is = "+area);          
}
}
