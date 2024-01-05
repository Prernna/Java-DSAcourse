package dsacourse;

import java.util.Scanner;

public class TwoDarrays {
    public static void main(String[] args) {
        //2D arrays declaration :
        //type[][] arrayName = new int[rows][coloumns];
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        int rows = sc.nextInt();
        int colms = sc.nextInt();

        int[][] matrix = new int[rows][colms];
        //input
        // //rows
        // for(int i=0;i<rows;i++ ){
        //     //coloumns
        //     for(int j=0;j<colms;j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
// //output     
// for(int i=0;i<rows;i++){
//     for(int j=0;j<colms;j++){
//     System.out.print(matrix[i][j] + " ");
// }  
// System.out.println();
// }

//Ques 1.(Practice) Take a matrix as input from the user , Search for a given number x and print the indices(rows,coloumns) at which it occurs.
//rows
 for(int i=0;i<rows;i++ ){
            //coloumns
            for(int j=0;j<colms;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                //compare with x
                if(matrix[i][j]==x){
                    System.out.println("X found at ("+i+","+j+")");
                }
            }
        }


    }
}
