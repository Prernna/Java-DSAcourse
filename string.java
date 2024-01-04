package dsacourse;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
    //String declaration
    String nam="Prerna kumari";  //we can print a name or a sentence 
    System.out.println(nam);    
    //Taking input from user.
    Scanner sc=new Scanner(System.in);   System.out.println(sc);
    // String name=sc.next();
    // System.out.println("What is your name : "+name);
    System.out.println("What is your name ?");
    String naam = sc.nextLine();
    System.out.println(" Your full name is : "+naam);

    //Concatenation : Adding two or more strings to form a new string 
    String fname="Prerna";
    String lname="Singh";
    String fullname=fname+" "+lname;
    System.out.println(fullname);
    System.out.println(fullname.length());
    // System.out.println(fullname.charAt(1));
//CharAt -> to print all the characters letter wise.
for(int i=0;i<fullname.length();i++){
    // System.out.println(fullname.charAt(i));
    System.out.print(fullname.charAt(i)+" ");
}
System.out.println();

//Comparison of two strings: ITs cases are
//1. s1>s2 : +ve value
//2. s1==s2 :0
//3. s1<s2 : -ve value
//hello cello --> Hello is greater as h letter holds greater value then c

String name1="Kartik";
String name2="Kartik";
if(name1.compareTo(name2)==0){
System.out.println("String is equal");
}else{
    System.out.println("String are not equal.");
}

if(name1.equals(name2)) {
    System.out.println("They are the same string");
} else {
    System.out.println("They are different strings");
}


if(name1==name2){
System.out.println("String is not equal");
}else{
    System.out.println("String are  equal.");
}

if(new String("Prerna")==new String ("Prerna")){
System.out.println("Strings is equal");
}else{
    System.out.println("String are not equal.");
}

//SubString 
String sentence ="His name is kartik";
// String name = sentence.substring(12,sentence.length());
String name=sentence.substring(12); // it will by default take the last index.
System.out.println(name);

//Parsing : To  convert a string to primitive data types.
//ParseInt method of Integer class
String str="1234";
int number=Integer.parseInt(str);
System.out.println(number);

//ToString method of string class
int num=123456;
String convert = Integer.toString(num);
System.out.println(convert);
System.out.println(convert.length());

//Take an array of strings input from the user & find the cumulative(combined) length of all those strings.



    }
}
