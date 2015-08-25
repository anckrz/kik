package kik;

import java.util.Scanner;

public class Player {
	static Scanner in;

	public char userInput() {
		in = new Scanner(System.in);
		String response;
		do {
			response = in.next();
		} while (!validate(response.toUpperCase().charAt(0)));
		in.close();
		return response.charAt(0);

	}

	private static boolean validate(char response) {
		if (response == ('X') || response == ('O') || response == ('E')) {
			return true;
		}
		System.out.println("POdaj wlasciwy input");
		return false;
	}
	
	public boolean checkField(Plansza plansza, int x, int y){
		return plansza.resultChar[x][y]=='\u0000';
		
		
	}

}
