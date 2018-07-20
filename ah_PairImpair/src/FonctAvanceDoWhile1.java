
public class FonctAvanceDoWhile1 {

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
		int nb1, nb2, nb3;

		do {
			nb1 = (int) (Math.random() * 1000 + 1);
			nb2 = (int) (Math.random() * 1000 + 1);
			nb3 = (int) (Math.random() * 1000 + 1);
			essais++;
			
			System.out.println(nb1 + " (" + pairOrImp(nb1) + ") - "
					+ nb2 + " (" + pairOrImp(nb2) + ") - "
					+ nb3 + " (" + pairOrImp(nb3) + ")");
			
		} while (nb1 % 2 != 0 || nb2 % 2 != 0 || nb3 % 2 != 1);
		
		System.out.println("=> " + essais + " essai(s).");

	}
}