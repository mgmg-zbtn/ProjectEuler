
package P001_010;

/**
 * 13195 の素因数は 5, 7, 13, 29 である.
 * 600851475143 の素因数のうち最大のものを求めよ.
 * 
 * A.6857
 * 
 * 
 * @see http://www.geocities.jp/m_hiroi/java/abcjava02.html
 * 
 */
public class P003 {

	public static void main(String[] args) {
		long num = 600851475143L;
		
		while (num % 2 == 0) {
			num /= 2;
		}

		for (int i = 3; (i * i) <= num; i += 2) {
			while (num % i == 0) {
				num /= i;
			}
		}
		if (1 < num) {
			System.out.println(num);
		}
	}
}
