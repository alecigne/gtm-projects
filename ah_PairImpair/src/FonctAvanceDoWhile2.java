
public class FonctAvanceDoWhile2 {

	public static String pairOrImp (int i) {
		String what;
		if (i % 2 == 0) {
			what = "pair";
		} else {
			what = "impair";
		}
		return what;
	}
		
	public static void main(String[] args) {
		
		int essais = 0;
		int[] numbers = new int[3];
		
		do {
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = (int) (Math.random() * 1000 + 1);
			}
			
			essais++;
			
			System.out.println(numbers[0] + " (" + pairOrImp(numbers[0]) + ") - "
					+ numbers[1] + " (" + pairOrImp(numbers[1]) + ") - "
					+ numbers[2] + " (" + pairOrImp(numbers[2]) + ")");
			
		} while (numbers[0] % 2 != 0 || numbers[1] % 2 != 0 || numbers[2] % 2 != 1);
		
		System.out.println("=> " + essais + " essai(s).");
		
	}

}