package com.greatlearning.training;

import java.util.Scanner;
public class Main{

Scanner sc = new Scanner(System.in);
           //function to checkPalindrome
      public void checkPalindrome()  {
	System.out.println("Enter a string of numbers:");
	String str = sc.nextLine();
	int length = str.length();
	for (int i=0; i<= length/2; i++){
	if (str.charAt(i) != str.charAt(length-i-1))
		{System.out.println("The entered string is not a Palindrome!!");
		break;}
	else
		{System.out.println("The entered string is a Palindrome!!");
		break;}

      }
}
             //function to printPattern

       public void printPattern() {
	System.out.println("Enter the input number of rows for the pattern");
	int num = sc.nextInt();
	for (int i = num; i >= 0; i--){
		for (int a = 0; a <= i; a++)		
			{System.out.print("*");
			}
		System.out.println();}
      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
		System.out.println("Enter the number to check if it is prime :");
		int num = sc.nextInt();
		for (int i = 2; i <= num/2; i++){
		if (num% i == 0){
			System.out.println("the number is not a prime number!!");
			break;}
		else {System.out.println("The number is prime!!");
		break;}
		}
        }
        
          // function to print Fibonacci Series

          public void printFibonacciSeries() {
		System.out.println("Enter the number till where to print the fibonacci series :");
		int num = sc.nextInt();
                //initialize the first and second value as 0,1 respectively.
           	int first = 0, second = 1;
		while(first <= num){
		System.out.print(first +",");
		int sum = first+second;
		first = second;
		second = sum;}
		System.out.println();
          }

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();
choice = sc.nextInt();
switch (choice) {
case 0:choice = 0;
break;
case 1: {obj.checkPalindrome();}
break;
case 2: {obj.printPattern();}
break;
case 3: {obj.checkPrimeNumber();}
break;
case 4: {obj.printFibonacciSeries();}
break;
default:
System.out.println("Invalid choice. Enter a valid no.\n");
}
} 
while (choice != 0);
System.out.println("Exited Successfully!!!");
sc.close();
}
}





 