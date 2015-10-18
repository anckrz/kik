package kik;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kik.Player;

public class Plansza {

	// final int X = 1;
	// final int O = 0;

	// Map<String, Integer> mapA = new HashMap<String, Integer>();
	// int[][] resultInt = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	char[][] resultChar = new char[3][3];

	// int counter = 0;

	public Plansza() {

	}

	public void wyswietl() {
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public void writeToTable(int x, int y, Player player) {

		resultChar[x][y] = player.playerId;
		// this.counter++;

	}

	public void checkResult() {
		// poziome wiersze

		for (int i = 0; i < resultChar[0].length; i++) {
			if (!(resultChar[i][0] == 'E')
					&& resultChar[i][0] == resultChar[i][1]
					&& resultChar[i][1] == resultChar[i][2]) {
				System.out.println("Jest wygrana w poziomie!!");
				break;

			}
			if (!(resultChar[0][i] == 'E')
					&& resultChar[0][i] == resultChar[1][i]
					&& resultChar[1][i] == resultChar[2][i]) {
				System.out.println("Jest wygrana w pionie!!");
				break;

			}

			if (!(resultChar[0][0] == 'E')
					&& resultChar[0][0] == resultChar[1][1]
					&& resultChar[1][1] == resultChar[2][2]) {
				System.out.println("Jest wygrana po skosie!!");
				break;

			}
			if (!(resultChar[0][2] == 'E')
					&& resultChar[0][2] == resultChar[1][1]
					&& resultChar[1][1] == resultChar[2][0]) {
				System.out.println("Jest wygrana po skosie!!");
				break;

			}
		}
	}
}
