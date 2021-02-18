package logic;

import java.util.Scanner;
package logic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean correctInput=true;
		double result;
		String operation;
		double a;
		double b;
		Scanner input = new Scanner(System.in);
		String s;
		Calculator calc=new Calculator();
		
		System.out.println("Dimmi il primo operando: ");
						
		s = input.nextLine();
		a=Double.parseDouble(s);
			
		
		do {
		System.out.println("Dimmi l'operazione da fare ( scrivi '+','-','*','/','radice' o 'logaritmo' ");
		input = new Scanner(System.in);
		s = input.nextLine();
		correctInput=(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")||s.equals("radice")||s.equals("logaritmo"));
		}while(!correctInput);
		
		operation=s;
		if(operation.equals("logaritmo")){
			result=calc.logarithm(a);
	    }
		
		else if(operation.equals("radice")) {
			result=calc.sqroot(a);
		}
		
		else {
			
			System.out.println("Dimmi il secondo operando: ");
			s = input.nextLine();
			b=Double.parseDouble(s);
			
			if(operation.equals("+")) {
				result=calc.add(a,b);
			}
			else if(operation.equals("-")) {
				result=calc.sub(a,b);				
			}
			else if(operation.equals("*")) {
				result=calc.mult(a,b);
			}
			else {
				result=calc.div(a,b);
			}
		}
		
		System.out.println("Il risultato dell'operazione è: "+ result);
		input.close();
		System.exit(0);
		
	}
}
