package kik;

import java.util.HashMap;
import java.util.Map;

public class Plansza {

	final int X = 1;
	final int O = 0;

	Map<String, Integer> mapA = new HashMap<String, Integer>();
	// int[][] resultInt = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	char[][] resultChar = new char[3][3];

	public Plansza() {

	}

	public void wyswietl() {

		for (int i = 0; i < resultChar.length; i++) {
			for (int j = 0; j < resultChar[0].length; j++) {
				if (j == resultChar[0].length - 1) {
					System.out.print(resultChar[i][j] + "\n");
				} else
					System.out.print(resultChar[i][j] + " | ");
			}
			if (i == resultChar.length - 1) {
				System.out.print("\n");
			} else
				System.out.println("----------");
		}

	}

	public void fill() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				resultChar[i][j] = 'E';
			}

		}

	}

}
