package Advanced.FactoryPattern;

import java.util.Scanner;
import java.util.*;
import java.security.*;

interface Food{
	public String getType();
}

class Pizza implements Food{
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}

class Cake implements Food{
	public String getType() {
		return "Someone ordered a Dessert!";
	}
}

class FoodFactory{
	public Food getFood(String order) {
		switch(order.toLowerCase()) {
		case "pizza":
			return new Pizza();
		case "cake":
			return new Cake();
		default:
			return null;
		}	
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Do_Not_Terminate.forbidExit();
		try {
			Scanner scanner = new Scanner(System.in);
			FoodFactory foodfactory = new FoodFactory();
			Food food = foodfactory.getFood(scanner.nextLine());
			
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
		}
		
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}

	}

}

class Do_Not_Terminate {
	 
    public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
