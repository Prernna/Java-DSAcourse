
package dsacourse;

import java.util.*;

public class conditional {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println(sc);
         //If,else
         System.out.println("Enter youor age : ");
         int age=sc.nextInt();
         int age2=sc.nextInt();
         if(age<age2){
            System.out.println("OOPS,You are not an adult !");
         }
         else{
            System.out.println("You are ready to go adult!!");
         }
System.out.println("\n");

 int number=sc.nextInt();
         if(number%2==0){
            System.out.println("even");
         }
         else{
            System.out.println("not even");
         }
System.out.println("\n");
 
System.out.println("Enter two integers");
int a=sc.nextInt();
int b=sc.nextInt();
if(a==b){
    System.out.println("You are both equal.");
}
else if(b>a){
    System.out.println("Perfect match!!");
}
else{
    System.out.println("you need to be equal to each other or b needs to be greater.");
}
System.out.println("\n");

//SWITCH cases are used when there are multiple if-else statements and we want to make our code look more good and easy to read.

int Greeting=sc.nextInt();
System.out.println("Enter your greeting number : ");
switch (Greeting) {
    case 1: System.out.println("hii-hello");
    break;
    case 2: System.out.println("Namaste");
    break;
    case 3: System.out.println("Bonjour");
    break;
    case 4: System.out.println("Vanakkam");
    break;
    default: System.out.println("You have pressed a wrong button");
        
}


    }
}
