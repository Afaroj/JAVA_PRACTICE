//LOOPS IN JAVA
//FOR: for(initialisation;condition;updation){ do something }

//While:
//initialization;
//while(condition){ do something
    // initialization;}

//Do While:
//initialiation;
//do{ something}while(condition);

import java.util.*;
public class Loops {
    public static void main(String args[]){
        int i;
        //print the numbers from 0 to 10 using for loop
        System.out.println("Using for loop");
        for(i=0; i<=10; i++){
            System.out.print(i+" ");
        }

        //print the nubers from 0 to 10 using while loop
        int counter = 0;
        System.out.println();
        System.out.println("using while loop");
        while(counter<11){
            System.out.println(counter);
            counter= counter+1;
        }

        //print the letters from a to j using do while
        char ch='a';
        System.out.println("do while loop");
        do{
            System.out.println(ch);
            ch++;
        }while(ch<'k');
        System.out.println();


        //print sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int j=1; j<=n; j++){
            sum = sum+j; 
        }
        System.out.println("The sum of first "+n+" natural no.s is:"+sum);

        //print table of given natural number
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int mul = 0;
        for(int j=1; j<=10; j++){
            mul = num*j; 
            System.out.println(mul);
            //or
            // System.out.println(j*num);
        }
        // System.out.println("The sum of first "+n+" natural no.s is:"+sum);

        
    }
}
