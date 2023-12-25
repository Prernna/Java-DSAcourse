package dsacourse;

public class loops {
    
public static void main(String args []){

for(int i =0;i<5;i++){
    System.out.println("hii,you are great!");
}
//print numbers from 0 to 10
for(int i =0;i<11;i++){
    System.out.println(i);
}

//While loop
int j=0;
while(j<11){
    System.out.println(j);
    j++;
}
//DO-WHILE Loop
int k=0;
do{
    System.out.println("Hii, my self a learner!!");
    k++;
}while(k<5);

//Check the small difference between while and do-while loop

int p=4;
while(p<3){
    System.out.println("I am tired");
}

do { //Do-While loop will print th output for once without checking the condition.
    System.out.println("I am going to get tired!!!!");
}while(p<4);



}

}
