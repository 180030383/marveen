package com.epam.Calculator;

public class Calculator {
static int addition(int p,int q) {
     return p+q;
   }
   static int subtraction(int p,int q) {
     return p-q;
   }
   static int multiplication(int p,int q) {
     return p*q;
   }
   static int division(int m,int n) {
     if(n!=0) return m/n;
     else System.out.println("Undefined\n");
     return 0;
   }
}