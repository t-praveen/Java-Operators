//Bitwise operators//

package operators;

public class BitwiseOperators {

	public static void main(String[] args) {

		 	int a = 5;
	        int b = 7;
	        System.out.println("a&b = " + (a & b));
	        System.out.println("a|b = " + (a | b));
	        System.out.println("a^b = " + (a ^ b));
	        System.out.println("a<<2 = " + (a << 2));
	        System.out.println("a>>2 = " + (a >> 2));
	        System.out.println("~a = " + ~a);
	        a &= b;
	        System.out.println("a= " + a);
		
	}

}
