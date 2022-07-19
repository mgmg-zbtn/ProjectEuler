
package P001_010;

/**
 * 
 * ピタゴラス数(ピタゴラスの定理を満たす自然数)とは a < b < c で以下の式を満たす数の組である.
 * a^2 + b^2 = c^2
 * 例えば, 3^2 + 4^2 = 9 + 16 = 25 = 5^2 である.
 * a + b + c = 1000 となるピタゴラスの三つ組が一つだけ存在する.
 * これらの積 abc を計算しなさい.
 * 
 * A.31875000
 * 
 * MAXが分からない所から探し出す方法が思いつかなかった.
 * 
 * 
 */
public class P009 {

	
	public static void main(String[] args) {
		int max = 500;
		
		for (int a = 1; a < max; a++) {
			for (int b = 1; b < max; b++) {
				for (int c = 1; c < max; c++) {
					if (a < b && b < c) {
						if ((a * a + b * b) == c * c) {
							if ((a + b + c) == 1000) {
								System.out.println(a * b * c);
								System.out.println(a + " " + b + " " + c);
							}
						}
					}
				}
			}
		}
	}
}
