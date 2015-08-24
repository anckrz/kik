package kik;

public class Player {

	public char userInput() {
		char response;
		do {
			response = in.next().toUpperCase();
		} while (!validate(response));
		return response;
	}

	private static boolean validate(char response) {
		if (response == ('X') || response == ('O') || response == ('E')) {
			return true;
		}
		System.out.println("POdaj wlasciwy input");
		return false;
	}

}
