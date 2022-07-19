
package P001_010;


/**
 * 
 * 2520 は 1 から 10 の数字の全ての整数で割り切れる数字であり, そのような数字の中では最小の値である.
 * では, 1 から 20 までの整数全てで割り切れる数字の中で最小の正の数はいくらになるか.
 * 
 * 最初の予想1発成功
 * 
 * A.232792560
 * 
 * 
 */
public class P005 {
	
	public static void main(String[] args) {
		int div = 1;
		int max = 20;
		int count = 1;
		
		while (div < max) {
			if (count % div == 0) {
				div++;
			} else {
				count++;
				div = 1;
			}
		}
		System.out.println(count);
	}
}
