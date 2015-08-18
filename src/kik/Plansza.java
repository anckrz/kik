package kik;

import java.util.HashMap;
import java.util.Map;

public class Plansza {

	final int X = 1;
	final int O = 0;

	Map<String, Integer> mapA = new HashMap<String, Integer>();
	int[][] resultInt = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	String[][] resultStr = {{"","",""},{"","",""},{"","",""}};
	public Plansza() {

	}

	public void wyswietl() {
		System.out.println(resultInt[0][0] + " | " + resultInt[0][1] + " | "
				+ resultInt[0][2] + "\n" + "---------" + "\n" + resultInt[1][0] + " | " + resultInt[1][1] + " | "
				+ resultInt[1][2] + "\n" + "---------" +"\n" + resultInt[2][0] + " | " + resultInt[2][1] + " | "
				+ resultInt[2][2]);

	}

}
