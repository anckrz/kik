package kik;

import java.util.Scanner;

import kik.Plansza;

public class KolkoIKrzyzyk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       //testy();
	algorytm();

		// System.out.println(gracz1.checkField(plansza, 1, 1));
		Player.in.close();

	}
  public static void testy(){
	  Plansza plansza1 = new Plansza();
	  //plansza1.resultChar = {'X','Y','E','Y','X','Y','E','E','X'};
	  plansza1.resultChar[0][0]='X';
	  plansza1.resultChar[0][1]='Y';
	  plansza1.resultChar[0][2]='E';
	  plansza1.resultChar[1][0]='Y';
	  plansza1.resultChar[1][1]='X';
	  plansza1.resultChar[1][2]='Y';
	  plansza1.resultChar[2][0]='E';
	  plansza1.resultChar[2][1]='E';
	  plansza1.resultChar[2][2]='X';
	  plansza1.checkResult();
	    Plansza plansza2 = new Plansza();
		plansza2.resultChar[0][0] = 'Y';
		plansza2.resultChar[0][1] = 'X';
		plansza2.resultChar[0][2] = 'Y';
		plansza2.resultChar[1][0] = 'Y';
		plansza2.resultChar[1][1] = 'X';
		plansza2.resultChar[1][2] = 'E';
		plansza2.resultChar[2][0] = 'E';
		plansza2.resultChar[2][1] = 'X';
		plansza2.resultChar[2][2] = 'E';
		plansza2.checkResult();
	
 }
  
  public static void algorytm(){
	  /*	while (plansza.counter < 5) {
		if (plansza.counter <= 4) {

			gracz1.userInput(plansza);
			gracz2.userInput(plansza);
			plansza.wyswietl();
			System.out.println("Counter wyosi : "+plansza.counter);
		} else {
			gracz2.userInput(plansza);
			System.out.println("Counter wyosi : "+plansza.counter);
			plansza.wyswietl();
		}

	}
	
	*/
	  
		Plansza plansza = new Plansza();
		Player gracz1 = new Player();
		Player gracz2 = new Player();
		
		// System.out.println(plansza.X);

		plansza.fill();
		plansza.wyswietl();
		gracz1.setPlayerId('X');
		gracz2.setPlayerId('Y');
		
	for (int i=0;i<9;i++){
		if (i%2==0){
			gracz1.userInput(plansza);
		}
		else {gracz2.userInput(plansza);}
		plansza.wyswietl();
		plansza.checkResult();
		
		
	}
	  
  }
}
