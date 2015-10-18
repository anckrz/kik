package kik;

import java.util.Scanner;

public class Player {

	public char playerId;
	static Scanner in = new Scanner(System.in);

	public void setPlayerId(char id) {

		playerId = id;
		// return playerId;
	}

	public void userInput(Plansza plansza) {
		// in = new Scanner(System.in);
		// String response;
		int x;
		int y;
		boolean check = false;
		while (!check) {
			System.out.println("Podaj wsp X: dla gracza " + this.playerId);
			x = in.nextInt();
			System.out.println("Podaj wsp Y: dla gracza " + this.playerId);
			y = in.nextInt();
			check = checkField(plansza, x, y);
			if (check) {
				plansza.writeToTable(x, y, this);
				break;
			}

		}
		// in.close();
		// return response.charAt(0);

	}

	public boolean validate(int x, int y) {
		if (x <= 2 && x >= 0 && y <= 2 && y >= 0) {
			return true;
		}

		return false;
	}

	public boolean checkField(Plansza plansza, int x, int y) {
		if (x <= 2 && x >= 0 && y <= 2 && y >= 0) {
			if (plansza.resultChar[x][y] == 'E') {
				return true;
			} else {
				System.out.println("Podane pole jest zajęte, podaj inne");
				return false;
			}
		}
		System.out.println("POdaj wspolrzedne z przedzialu 0..2");
		return false;

	}

}
