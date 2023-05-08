package conto;

import exceptions.BancaException;

public class Banca {
	public static void main(String args[]) {
		ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

		System.out.println("Saldo conto: " + conto1.restituisciSaldo());

		try {
			conto1.preleva(1750.5);
		} catch (BancaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Saldo conto: " + conto1.restituisciSaldo());

		ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

		conto2.stampaSaldo();

		try {
			conto2.preleva(2000);
		} catch (BancaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		conto2.stampaSaldo();
	}
}
