import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String mossaPl;
		int mossaCPU, punteggioPl = 0, punteggioCPU = 0;
		System.out.println();
		Random rand = new Random();
		Scanner scan = new Scanner(System.in); // 0 = sasso,1 = carta,2 = forbice
		do {
			System.out.println("Scegli sasso/carta/forbice");
			mossaPl = scan.next();
			scan.nextLine();
			while (!(mossaPl.equals("sasso") || mossaPl.equals("carta") || mossaPl.equals("forbice"))) {
				System.out.println("inserire sasso/carta/forbice");
				mossaPl = scan.next();
			}

			mossaCPU = rand.nextInt(3);

			if (mossaPl.equals("sasso")) {
				if (mossaCPU == 0) {
					System.out.println("Sasso VS Sasso --- Pareggio!");
				} else if (mossaCPU == 1) {
					System.out.println("Sasso VS Carta --- CPU vince!");
					punteggioCPU++;
				} else {
					System.out.println("Sasso VS Forbice --- Player vince!");
					punteggioPl++;
				}
			}

			else if (mossaPl.equals("carta")) {
				if (mossaCPU == 0) {
					System.out.println("Carta VS Sasso --- Player vince!");
					punteggioPl++;
				} else if (mossaCPU == 1) {
					System.out.println("Carta VS Carta --- Pareggio");
				} else {
					System.out.println("Carta VS Forbice --- CPU vince!");
					punteggioCPU++;
				}
			}

			else if (mossaPl.equals("forbice")) {
				if (mossaCPU == 0) {
					System.out.println("Forbice VS Sasso --- CPU vince!");
					punteggioCPU++;
				} else if (mossaCPU == 1) {
					System.out.println("Forbice VS Carta --- Player vince!");
					punteggioPl++;
				} else {
					System.out.println("Forbice VS Forbice --- Pareggio!");
				}
			}
			System.out.println(punteggioPl + " a " + punteggioCPU);
		} while (punteggioPl < 5 && punteggioCPU < 5);
		System.out.println("Partita finita --- ");
		if (punteggioPl == 5)
			System.out.println("Player vince!");
		else
			System.out.println("CPU vince!");
		scan.close();
	}

}
