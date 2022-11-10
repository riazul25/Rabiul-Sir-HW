import java.util.Scanner;
public class Arraysum{
public static void main (String [] args){
Scanner input = new Scanner(System.in);
int [] num = new int [5];
int sum = 0;
System.out.println("Please Enter 5 num : " );
for(int i = 0 ; i < 5 ; i++){
num[i] = input.nextInt();}
for(int i = 0 ; i < 5 ; i++){
sum = sum + num[i] ;}
 System.out.println("The sum : " +sum);
}
}