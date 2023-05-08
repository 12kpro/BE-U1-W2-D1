package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import exceptions.NotInRange;

public class Application {

	public static void main(String[] args) {
		// esercizio 1
		Scanner input = new Scanner(System.in);
		int[] randomNum = new int[5];
		int index;
		int value;
		Random random = new Random();
		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = random.nextInt(10) + 1;
		}
		System.out.println(Arrays.toString(randomNum));

		while (true) {
			try {
				System.out.print("Inserisci un numero: ");
				value = Integer.parseInt(input.nextLine());
				if (value == 0)
					break;
				System.out.print("Inserisci una posizione: ");
				index = Integer.parseInt(input.nextLine());
				if (index >= 0 && index < randomNum.length) {
					if (value >= 1 && value < 10) {
						randomNum[index] = value;
					} else {
						throw new NotInRange("Il valore inserito deve essere compreso tra 1 e 10", 1, 10);
					}
				} else {
					throw new NotInRange("Il valore inserito deve essere compreso tra 0 e 4", 0, 4);
				}
			} catch (NotInRange e) {
				System.out.println(e.getMessage());
			}
		}

		// esercizio 2
		int km;
		int litri;
		int kmPerLitro;
		try {
			System.out.print("Inserisci il numero di km percorsi: ");
			km = Integer.parseInt(input.nextLine());
			System.out.print("Inserisci il numero di litri consumati: ");
			litri = Integer.parseInt(input.nextLine());
			if (litri == 0) {
				throw new ArithmeticException("Divisione per zero.");
			}
			kmPerLitro = km / litri;
			System.out.println("Il numero di km/litro percorsi è " + kmPerLitro);
		} catch (Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}

	}

}
