package dsacourse;

public class patterns2 {
    public static void main(String args []){

//1.Print the pattern -> Butterfly pattern
int n =5;

//upper half
for(int i=1;i<=n;i++){
    //1st part
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }

    //Spaces
    int spaces = 2*(n-i);
    for(int j=1; j<=spaces;j++){
        System.out.print(" ");
    }
    //2nd part
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
System.out.println();
}

//Lower half
for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
        int spaces = 2*(n-i);

    for(int j=spaces;j>=1;j--){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
System.out.println("\n");
//2.Print the pattern ->   Solid Rhombus

for(int i=1;i<=n;i++){
    int spaces=n-i; //OR it can written like 
    for(int j=1;j<=spaces;j++){ //for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    
    for(int j=1;j<=n;j++){
        System.out.print("*");
    }
    System.out.println();
}

    System.out.println("\n");

//3.Print the pattern ->Number Pyramid

for(int i=1;i<=n;i++){
    //For spaces
    for (int j = 1; j<=n-i; j++) {
        System.out.print(" ");
        
    }
    //Numbers -> Print row no. ,row no. of times.
    for (int j = 1; j <=i; j++) {
        System.out.print(i+" ");
    }
    System.out.println();
}
System.out.println("\n");

//4.Print the pattern-> Palindromic pattern
for(int i=1;i<=n;i++){ //rows
    //spaces
    for(int j=1;j<=n-i;j++){ 
        System.out.print("  "); //have given double space
    }
    //1st half numbers
    for(int j=i;j>=1;j--){
        System.out.print(j+" ");
    }
    //2nd half numbers
    for(int j=2;j<=i;j++){
        System.out.print(j+" ");
    }
        System.out.println( );
}
System.out.println("\n");

//5.Print the pattern -> Diamond Pattern
int m=4;
for(int i=1;i<=m;i++){ //Upper half
        //spaces
    for(int j=1;j<=m-i;j++){
            System.out.print(" ");
        }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
        System.out.println();
        } //To print lower half of the diamond we will reverse the code written above
        
for(int i=m;i>=1;i--){ //Upper half
        //spaces
    for(int j=1;j<=m-i;j++){
            System.out.print(" ");
        }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
        System.out.println();
        } 



 
    }
}
