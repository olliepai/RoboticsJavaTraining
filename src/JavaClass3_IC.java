import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class JavaClass3_IC {
	public static void main(String[] args) {
		// int[] fib = new int[10];
		// fib[0] = 0;
		// fib [1] = 1;
		// for (int i = 2; i < 10; i++) {
		// fib[i] = fib[i - 1] + fib [i - 2];
		// }
		// for (int i = fib.length - 1; i > -1; i--) {
		// System.out.println(fib[i]);
		// }

		// String result = "";
		//
		// String[] friends = new String[5];
		// for (int i = 0; i < friends.length; i++) {
		// if (i < friends.length - 1) {
		// friends[i] = "friend " + (i + 1) + ", ";
		// } else {
		// friends[i] = "friend " + (i + 1);
		// }
		// result += friends[i];
		// }
		// System.out.println(result);

		// int [] numbers = {1000, 53, 75, 13, 88, 91, 2485, 1, -7, 16};
		// int zero = 0;
		// for (int i = 0; i < numbers.length-1; i++) {
		// if (numbers[i] > numbers[i + 1]) {
		// zero = numbers[i + 1];
		// numbers[i + 1] = numbers[i];
		// numbers[i] = zero;
		// }
		// }
		// for (int i : numbers) {
		// System.out.println(i);
		// }
		// }

		// int[][] table = { { 2, 7, 3 }, { 8, 1, 9, 44 }, {}, { 2 } };
		// System.out.println(table.length);
		// for (int[] x : table) {
		// System.out.println(x.length);
		// }
		// for (int[] x : table) {
		// for (int y : x) {
		// System.out.print(y + " ");
		// }
		// System.out.println(" ");
		// }

		// ArrayList<Integer> perfectSquares = new ArrayList<Integer>();
		//
		// for (int i = 1000; i > 0; i--) {
		// if (Math.sqrt(i) % 1 == 0) {
		// perfectSquares.add(i);
		// }
		// }
		// for (int x : perfectSquares) {
		// System.out.println(x);
		// }

		// ArrayList<Integer> threes = new ArrayList<Integer>(Arrays.asList(3, 6, 2, 4,
		// 3));
		// removeNumber (3, threes);
		// for (int x : threes) {
		// System.out.println(x);
		// }

		// ArrayList<String> list = new ArrayList<String>(Arrays.asList("blue", "red",
		// "brown", "black", "green"));
		// shuffle(list);
		// for (String s : list) {
		// System.out.println(s);
		// list.remove(2);
		// }

		// System.out.println("After");
		// ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList());
		// int av = average(list);
		// System.out.println(av);

		// Suits s = Suits.CLUBS;

		// System.out.println(Suits.CLUBS.isRed());
		// String[] list = {"a", "b", "c"};
		// reverse(list);

		// int contains = search(new int[] {1, 2, 5, 6}, 0);
		// System.out.println(contains);

		int[][] mat = new int[5][5];
		for (int i = 0; i < 5; i++) {
			mat[0][i] = 1;
			mat[i][0] = 1;
		}

		System.out.println(recursive(mat, 4, 4));

	}

	public static void removeNumber(int remove, ArrayList<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == remove) {
				numbers.remove(i);
			}
		}
	}

	public static void shuffle(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.add(list.remove((int) (Math.random() * list.size())));
		}

	}

	public static int average(ArrayList<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		int average = 0;

		try {
			average = sum / list.size();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return average;
	}

	public enum Suits {
		CLUBS, SPADE, DIAMONDS, HEARTS;

		public boolean isRed() {
			if (this == DIAMONDS) {
				return true;
			} else if (this == HEARTS) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void reverse(String[] list) {
		for (int i = list.length - 1; i >= 0; i--) {
			System.out.println(list[i]);
		}
	}

	public static int lastInt(ArrayList<Integer> list) {
		int last = list.get(list.size() - 1);
		return last;
	}

	public static int search(int[] list, int contains) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == contains) {
				return i;
			}
		}
		return -1;
	}

	public static int recursive(int[][] list, int x, int y) {
		if (list[x][y] == 1) {
			return 1;
		} else {
			return recursive(list, x - 1, y) + recursive(list, x, y - 1);
		}
	}
}
