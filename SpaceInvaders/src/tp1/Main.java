package tp1;

import java.util.Locale;
import java.util.Scanner;

import tp1.control.Controller;
import tp1.view.Messages;
import static tp1.view.Messages.error;
import tp1.view.*;
import tp1.logic.*;

import tp1.logic.gameobjects.*;

/*
 * Nivel easy, 4 naves comunes (1 fila), 2 naves destructoras, frec. disparo = 0,1, velocidad = 3, Ovni = 0,5
 * Nivel hard, 8 naves comunes (2 filas), 2 naves destructoras, frec. disparo = 0,3, velocidad = 3, Ovni = 0,2
 * Nivel insane, 8 naves comunes (2 filas), 4 naves destructoras, frec. disparo = 0,5, velocidad = 3, Ovni = 0,1
 */


public class Main {

	/**
	 * Show application help message
	 */
	private static void usage() {
		System.out.println(Messages.USAGE);
		System.out.println(Messages.USAGE_LEVEL_PARAM);
		System.out.println(Messages.USAGE_SEED_PARAM);
	}

	/**
	 * SpaceInvaders entry point
	 * 
	 * @param args Arguments for the game.
	 */
	public static void main(String[] args) {
		// Required to avoid issues with tests
		Locale.setDefault(new Locale("es", "ES"));

		if (args.length < 1 || args.length > 2) {
			usage();
		} else {
			Level level = Level.valueOfIgnoreCase(args[0]);
			if (level == null) {
				System.out.println(Messages.ALLOWED_LEVELS);
				usage();
			} else {
				long seed = System.currentTimeMillis() % 1000;
				String seedParam = "";
				try {
					if (args.length == 2) {
						seedParam = args[1];
						seed = Long.parseLong(seedParam);
					}
		
					System.out.println(Messages.WELCOME);
		
					System.out.println(String.format(Messages.CONFIGURED_LEVEL, level.name()));
					System.out.println(String.format(Messages.CONFIGURED_SEED, seed));
					
					Game game = new Game(level, seed);
					Scanner scanner = new Scanner(System.in);
					Controller controller = new Controller(game, scanner);
					controller.run();
					
					UCMShip player = new UCMShip();	
					game.setUCMShip(player);
					GamePrinter printer = new GamePrinter(game);
					AlienManager alienManager = new AlienManager(game, level);
					game.setAlienManager(alienManager);
					
					/* esto funciona
					printer.printShip();
					System.out.println(player.getInfo());
					player.move(Move.LEFT);
					player.move(Move.LEFT);
					player.performMovement(Move.LEFT);
					System.out.println(player.getInfo());
					player.performMovement(Move.RRIGHT);
					System.out.println(player.getInfo());
					*/
					
					game.reset();
					System.out.println(game.getRegularAlienList().toString());
					System.out.println(game.getDestroyerAlienList().toString());
					
					System.out.println(printer.toString());
					
					
					/*
					
					GamePrinter printer = new GamePrinter(game2);
					printer.printShip();
					System.out.println(printer.getGame().getUCMShip().toString());
					System.out.println(game2.getAlienManager().getRemainingAliens());
					System.out.println(printer.toString());
					*/
					
		
				} catch (NumberFormatException nfe) {
					System.out.println(String.format(Messages.SEED_NOT_A_NUMBER_ERROR, seedParam));
					usage();
				} catch (Exception e) {
					System.out.println(error(e.getMessage()));
				}
			}
		}
	}

}
