
package com.adaptionsoft.games.trivia.runner;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;


public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {
		
		String[] listaDeJugadores = {"Chet","Pat","Sue"};
		
		Game aGame = initialize(listaDeJugadores);
		
		Random rand = new Random();
	
		run(aGame, rand);
		
	}

	static void run(Game aGame, Random rand) {
		do {
			
			aGame.roll(rand.nextInt(5) + 1);
			
			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}
			
			
			
		} while (notAWinner);
	}

	static Game initialize(String[] listaDeJugadores) {
		Game aGame = new Game();
		
		for(String jugador : listaDeJugadores) {
			
			aGame.add(jugador);
		}
		
		return aGame;
	}
}
