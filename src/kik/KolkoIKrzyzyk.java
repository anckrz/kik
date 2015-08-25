package kik;
import java.util.Scanner;

import kik.Plansza;

public class KolkoIKrzyzyk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Plansza plansza = new Plansza();
	Player gracz1 = new Player();
	//System.out.println(plansza.X);
	

	plansza.fill();
	plansza.wyswietl();
	gracz1.userInput();
	

	}

}
