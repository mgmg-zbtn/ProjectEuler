
package P001_010;


/**
 * 
 * 左右どちらから読んでも同じ値になる数を回文数という. 2桁の数の積で表される回文数のうち, 最大のものは 9009 = 91 × 99 である.
 * では, 3桁の数の積で表される回文数の最大値を求めよ.
 * 
 * 
 * A.906609
 * 回分かどうかの判定の後に値の比較が行われるので,
 * 最大値から試して最初に通る値が最大とは限らない.
 * つまり全て試すのが確実?
 * 
 * 
 */
public class P004 {
	
	public static void main(String[] args) {
		
		int MIN = 100;
		int MAX = 999;
		
		int ans = 0;
		for (int i = MAX; MIN <= i; i--) {
			for (int j = MAX; MIN <= j; j--) {
				int temp = i * j;
				String str = String.valueOf(temp);
				
				String firstHalf = str.substring(0, str.length() / 2);
				StringBuilder secondHalf;
				
				if (str.length() % 2 == 0) {
					secondHalf = new StringBuilder(str.substring(str.length() / 2, str.length()));
				} else {
					secondHalf = new StringBuilder(str.substring(str.length() / 2 + 1, str.length()));
				}
				
				secondHalf.reverse();
				if (firstHalf.equals(secondHalf.toString()) && ans < temp) {
					ans = temp;
				}
			}
		}
		System.out.println(ans);
	}
}
