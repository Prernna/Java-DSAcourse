package dsacourse.functions;
import java.util.*;

public class methods {

//What is the difference between functions and methods.
//Functions can be callled directly while methods are called in class objects. (We will get the clarity once we get to know about oops. )



//1.
public static void printMyName(String name){
    System.out.println("Hii , my name is Prerna and i am learning methods in java. ");
    System.out.println(name);
}
//2.
public static int add(int a,int b){
    int sum=a+b;
    return sum;
}
//3.
public static float product(int a,int b){
    return a*b;
    // float multiply=a*b;
    // return multiply;
}
//4.
// n!=n(n-1)(n-2)(n-3).....1
public static void factorialnumber(int n){
    //loop
    if (n<0) {
        System.out.println("Invalid number");
        return ;
    }
    int factorial=1;
    for(int i=n;i>=1;i--){
factorial = factorial * i;
    }
    System.out.println(factorial);
}

    public static void main(String args[]){

        //1.Print a given number in a function. (every ques written here is provided by its function in the above code.)
        Scanner sc= new Scanner(System.in);
        System.out.println(sc);
        System.out.println("What's your name : ");
        String name=sc.nextLine();
        printMyName(name);

        //2.Make a function to add 2 numbers and return the sum.
         System.out.println("Write two numbers to be added : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum =add(a,b);
        System.out.println("Total sum is" + sum);
        
        //3.Make a function to multiply 2 numbers and return the product.
        
        int c=a+5;
        int d=b+4;
        System.out.println("This is the product of your numbers : "+product(c,d));

        //4. Find the factorial of a number.
        System.out.println("Enter your factorial number : ");
        int n=sc.nextInt();
        factorialnumber(n);



    }
}
