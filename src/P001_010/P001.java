package P001_010;

/**
 *
 * 10未満の自然数のうち, 3 もしくは 5 の倍数になっているものは 3, 5, 6, 9 の4つがあり, これらの合計は 23 になる.
 * 同じようにして, 1000 未満の 3 か 5 の倍数になっている数字の合計を求めよ.
 * 
 * A.233168
 * 
 * 
 * @since 2011/10/05 (wed)
 */
class P001 {
	

	public static void main(String[] args) {

		int max = 1000;
		int sum = 0;
		for (int i = 0; i < max; i++) {
			if (i % 3 == 0) {
				sum += i;
//				System.out.println(i);
			} else if (i % 5 == 0) {
				sum += i;
//				System.out.println(i);
			}
		}
		System.out.println(sum);
	}
}
