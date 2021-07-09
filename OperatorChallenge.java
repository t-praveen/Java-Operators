
//Operator Program//

package operators;

public class OperatorChallenge {

	public static void main(String[] args) {
		
		double first_var = 20.00d ;
		double second_var = 80.00d ;
		double result1 = (first_var + second_var) * 100.00d ;
		System.out.println("The first operation result is : "+result1);
		double result2 = result1 % 40.00d ;
		System.out.println("The remainder is : "+result2);
		boolean result3 = (result2 == 0) ? true : false ;
		System.out.println("The result is : "+result3);
		if(result3 == false)
		{
			System.out.println("Got Some Remainder .");
		}
	}

}
