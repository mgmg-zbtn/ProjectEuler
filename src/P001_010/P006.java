
package P001_010;

/**
 * 
 * 最初の10個の自然数について, その二乗の和は,
 * 12 + 22 + ... + 102 = 385
 * 
 * 最初の10個の自然数について, その和の二乗は,
 * (1 + 2 + ... + 10)2 = 3025
 * 
 * これらの数の差は 3025 - 385 = 2640 となる.
 * 同様にして, 最初の100個の自然数について二乗の和と和の二乗の差を求めよ.
 * 
 * 
 * A.25164150
 * 
 * 
 */
public class P006 {

	public static void main(String[] args) {

		int max = 100;
		int sq = 0;
		int sum = 0;
		
		for (int i = 1; i <= max; i++) {
			sq += i * i;
			sum += i;
		}
		sum *= sum;
		System.out.println(sum - sq);
	}
}
