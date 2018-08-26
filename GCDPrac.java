/* This program computes GCD of three numbers in Java.
 * This solution is conversion of C code written by Susmita Das at Quora
 * To view C solution of her go to following link: 
 * https://www.quora.com/Write-a-program-in-C-to-compute-the-GCD-of-three-numbers
 * In next update I will try to explain each and every line of code.
 */

public class GCDPrac {
	
	public static void main(String[] args) {
		
		System.out.println(gcd(15, 10, 20));
		System.out.println(gcd(14, 8, 4));
		System.out.println(gcd(9, 6, 12));
	}
	
	static int gcd(int a, int b, int c) {
		
		int least;
		least=a;
		
		while(!((a==b) && (b==c))) {
			
			a=(a==0?least:a);
			b=(b==0?least:b);
			c=(c==0?least:c);
			
			if(a<=b) {
				if(a<=c) {
					least=a;
				}
				else {
					least=c;
				}
			}
			else {
				if(b<=c) {
					least=b;
				}
				else {
					least=c;
				}
			}
			
			a=a%least;
			b=b%least;
			c=c%least;
		}
		
		return least;
		
		
	}

}
