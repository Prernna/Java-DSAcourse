package dsacourse;

import java.util.Scanner;
//It is kept as an linear serach : Linear search is an algorithim that keeps the arrays in ascending order
public class arraysintro {
    public static void main(String[] args) {
        
        // int[] marks = new int[4];
        // marks[0]=45;
        // marks[1]=42;
        // marks[2]=49;
        // marks[3]=45;
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // // System.out.println(marks[3]);
        // for(int i=0;i<marks.length;i++){ //for an easy solution of large numbers we will use loops
        //     System.out.println(marks[i]);
        // }

//         //using user input
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        System.out.println(sc);
//         int numbers[]= new int[size];
// //input
//         for (int i = 0; i < size; i++) {
//         numbers[i]=sc.nextInt();
//         }

// //output
//         for(int i=0;i<numbers.length;i++){
//             System.out.println(numbers[i]); //it will print the user input and then print zero which is equal to input size . zero is printed because it is set as an default value of int.
//         }

        //Ques. Take an array as input from the user. Search for a gien number x and print the index at which it occurs.
        System.out.println("Enter your array size");
        int search = sc.nextInt();
        int fornumber[] = new int[search];
        //input
        for (int i = 0; i < search; i++) {
            fornumber[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        
        for (int i = 0; i < fornumber.length; i++) {
            if(fornumber[i]==x){
        System.out.println("x is found at index "+i);
            }
            // System.out.println(fornumber[i]);
        }

    }
}
