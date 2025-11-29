public class SortedSwap {
	public static boolean Solution(int[] A) {

		int left = -1;
		int right = -1;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > A[i + 1]) {
				left = i;
				break;
			}
		}
		if (left == -1) {
			return true;
		}
			for (int i = A.length - 1; i > left; i--) {
				if (A[i] < A[left]) {
					right = i;
					break;
				}
			}

		swap(A, left, right);

		for (int i = 0; i < A.length - 1; i++)
			if (A[i] > A[i + 1])
				return false;
		return true;

	}

	private static void swap(int[] A, int x, int y) {
		int t = A[x];
		A[x] = A[y];
		A[y] = t;
	}

	public static void main(String[] args) {
		int[] A = { 1, 5, 3, 3, 7 };
		int[] B = { 1, 3, 5, 3, 4 };
		int[] C = { 1, 3, 5 };
		System.out.println(Solution(A)); 
		System.out.println(Solution(B)); 
		System.out.println(Solution(C));
	}
}
