package machines;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeMachine coffe = new CoffeMachine();
        
		Scanner scanner = new Scanner(System.in);

        System.out.printf("Cafeaua1 costa 10 iar cafeaua2 costa 15, introdu o moneda de 5 sau 10: ");
        int moneda = scanner.nextInt();
   
        
        if(moneda == 5)
        {
        	 coffe.transition(Coffe.FIVECOIN);
        	 System.out.printf("Cafeaua1 costa 10 iar cafeaua2 costa 15, introdu o moneda de 5 sau 10: ");
        	 System.out.printf("\n Indrodu o moneda: ");
        	 moneda = scanner.nextInt();
        	 if(moneda == 5)
             {
             	 coffe.transition(Coffe.FIVECOIN);
             	 System.out.printf(" Introdu o moneda de 5 sau apasa 1 pentru a alege cafeaua1: ");
             	 System.out.printf("\n Indrodu o moneda: ");
             	 moneda = scanner.nextInt();
	             if(moneda == 1)
	            {
	            	coffe.transition(Coffe.COFFE1);
	            }
	            else
	            {
	            	coffe.transition(Coffe.FIVECOIN);
	            	coffe.transition(Coffe.COFFE2);
	            }
             }
             else
             if(moneda == 10)
             {
             	coffe.transition(Coffe.TENCOIN);
             	coffe.transition(Coffe.COFFE2);
             }
        }
        else
        if(moneda == 10)
        {
        	coffe.transition(Coffe.TENCOIN);
        	System.out.printf("Apasa 1 daca vrei cafeaua1 sau introdu inca 5 coin pentru cafeaua2: ");
        	moneda = scanner.nextInt();
        	if(moneda == 1)
        	{
        		coffe.transition(Coffe.COFFE1);
        	}
        	else
        	if(moneda == 5)
        	{
        		coffe.transition(Coffe.FIVECOIN);
        		coffe.transition(Coffe.COFFE2);
        	}
        }
        scanner.close();

    }
}