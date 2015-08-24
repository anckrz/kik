package kik;
import java.util.Scanner;

import kik.Plansza;

public class KolkoIKrzyzyk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Plansza plansza = new Plansza();
	//System.out.println(plansza.X);
	Scanner in;
	in = new Scanner(System.in);
	plansza.fill();
	plansza.wyswietl();
	in.close();
	}

}
