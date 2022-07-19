
package P001_010;

import java.util.ArrayList;

/**
 * 
 * 素数を小さい方から6つ並べると 2, 3, 5, 7, 11, 13 であり, 6番目の素数は 13 である.
 * 10 001 番目の素数を求めよ.
 * 
 * A.104743
 * 
 * 
 */
public class P007 {
	
	public static void main(String[] args) {
		ArrayList<Integer> stack = new ArrayList<Integer>();
		int max = 10001;
		int count = 2;
		stack.add(2);

		while (stack.size() < max) {

			// countした数を既知の素数リストで割る
			for (int i = 0; i < stack.size(); i++) {
				if (count % stack.get(i) == 0) {
					break;
				} else if (i == stack.size() - 1) {
					// リスト最後の素数で割り切れなければ新しい素数
					stack.add(count);
				}
			}
			count++;
		}
		System.out.println(stack.get(max - 1));
	}
}
