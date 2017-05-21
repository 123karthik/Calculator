package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

public class BasicCalc
{
	Scanner s=new Scanner(System.in);
	int a,b,ch;

	public BasicCalc()
        {
		
	}
	
	public int menu()
        {
		
		System.out.println("1,addition");
		System.out.println("2,subtraction");
		System.out.println("3,multiplication");
		System.out.println("4,division");
		System.out.println();
		System.out.println("enter ur choice");
    	ch=s.nextInt();
    	return ch;
	}
	
    public void userInputs()
    {
    	
    	System.out.println("enter a value");
    	a=s.nextInt();
    	System.out.println("enter b value");
    	b=s.nextInt();
    	
    }

    public void performOperation()
{
    	switch(ch){
    	
    	case 1:
    		System.out.println("result: "+add());
    		break;
        
    	case 2:
    		System.out.println("result: "+subtract());
    		break;
    		
    	case 3:
    		System.out.println("result: "+multiply());
    		break;
    		
    	case 4:
    		System.out.println("result: "+divide());
    		break;
    		
    	default:
    		System.out.println("wrong operation");
    		
    	}
    }
    
	int add()
	{
		return a+b;
	}
	
	int subtract()
	{
		return a-b;
	}
	
	int multiply()
	{
		
		return a*b;
	}
	
	int divide()
	{
		
		return a/b;
	}
	
}