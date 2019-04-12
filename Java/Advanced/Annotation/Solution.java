package Advanced.Annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface FamilyBudget{
	String userRole() default "GUEST";
	int budgetLimit() default 0;
}

class FamilyMember{
	@FamilyBudget(userRole="SENIOR", budgetLimit=100)
	public void seniorMember(int budget, int moneySpend) {
		System.out.println("Senior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget left: " + (budget-moneySpend));
	}
	@FamilyBudget(userRole="JUNIOR", budgetLimit=50)
	public void juniorMember(int budget,int moneySpend) {
		System.out.println("Junior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget left: " + (budget-moneySpend));
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		while(N-->0) {
			String role = scanner.next();
			int spend = scanner.nextInt();
			try {
				Method[] methods = FamilyMember.class.getDeclaredMethods();
				for(Method method:methods) {
					if(method.isAnnotationPresent(FamilyBudget.class)) {
						FamilyBudget family = method.getAnnotation(FamilyBudget.class);
						String userRole = family.userRole();
						int budgetLimit = family.budgetLimit();
						if(userRole.equals(role)) {
							if(spend <= budgetLimit) {
								method.invoke(FamilyMember.class.newInstance(), budgetLimit, spend);
							}
							else {
								System.out.println("Budget Limit Over");
							}
						}
					}
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
