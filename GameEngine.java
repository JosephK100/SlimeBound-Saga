//Main game engine (Will handle all menus)
import java.util.Scanner;

public class GameEngine{
	private Scanner scanner = new Scanner(System.in);
	private Player player;
	
	//Use keepGoing to keep my menu looping 
	public void startGame(){
		boolean keepGoing = true;
		while (keepGoing){
			System.out.println("--- Slimebound Saga ---");
			System.out.println("1. Start Game");
			System.out.println("2. Load Game");
			System.out.println("3. Quit");
			System.out.print("Your choice:" );
			int choice = scanner.nextInt();

			if (choice == 1){
				newGame();
			} else if (choice == 2){
				loadGame();
			} else if (choice == 3){
				System.out.println("Exiting game");
				keepGoing = false;
			} else {
				System.out.println("Invalid choice");
			}
		}
	}

	private void newGame(){
		System.out.print("Enter your name: ");
		scanner.nextLine();
		String name = scanner.nextLine();

		player = new Player(name);
		System.out.println("Welcome, " + name + "!");
		mainMenu();
	}

	private void loadGame(){
		System.out.println("Loading game.");
	}

	private void mainMenu(){
		boolean keepGoing = true;
		while (keepGoing){
			System.out.println("\n---Main Menu---");
			System.out.println("1. Explore");
			System.out.println("2. Inventory");
			System.out.println("3. Rest");
			System.out.println("4. Quit to Start Menu");
			System.out.print("Your choice: ");

			int choice = scanner.nextInt();
			if (choice == 1){
				explore();
			} else if (choice == 2){
				inventoryMenu();
			} else if (choice == 3){
				rest();
			} else if (choice == 4){
				keepGoing = false;
			} else {
				System.out.println("Invalid choice");
			}
		}
	}

	private void explore(){
		System.out.println("You explore the forest");
		Slime slime = new Slime();
		battle(slime);
	}

	//Battle
	private void battle(Creature wild){
    	Creature ally = player.getActiveSlime();
		String allyName = "Your " + ally.getName();
		String enemyName = "Enemy " + wild.getName();
    	System.out.println("A wild " + enemyName + " appears!");
		pressEntertoContinue();

    	while (ally.isAlive() && wild.isAlive()){
        	Move slimeMove = ally.getMoves().getRandomMove();
			System.out.println("\n--- Ally Turn ---");
        	System.out.println(allyName + " used " + slimeMove.getName() + "!");
        	wild.takeDamage(slimeMove.getPower());
			System.out.println(enemyName + " took " + slimeMove.getPower() + " damage!");
			pressEntertoContinue();

        	if (wild.isAlive()){
				System.out.println("\n--- Your Attack ---");
            	int dmg = player.randomAttack();
            	wild.takeDamage(dmg);
				System.out.println(enemyName + " took " + dmg + " damage!");
				pressEntertoContinue();

            	if (wild.isAlive()){
					System.out.println("\n--- Enemy Turn ---");
                	Move enemyMove = wild.getMoves().getRandomMove();
                	System.out.println(enemyName + " used " + enemyMove.getName() + "!");
                	ally.takeDamage(enemyMove.getPower());
					System.out.println(allyName + " took " + enemyMove.getPower() + " damage!");
					pressEntertoContinue();

                	if (ally.isAlive()){
                    	System.out.println("\n--- Next Turn ---");
						pressEntertoContinue();
                	}
            	}
        	}
    	}

    	if (!wild.isAlive()){
        	System.out.println("You defeated the " + enemyName + "!");
			pressEntertoContinue();
    }	 else if (!ally.isAlive()){
        	System.out.println(allyName + " fainted");
			pressEntertoContinue();
    	}
	}

	private void pressEntertoContinue(){
		System.out.println("\n(Press Enter to continue)");
		scanner.nextLine();
	}

	private void inventoryMenu(){
		System.out.println("Inventory button clicked");
	}

	private void rest(){
		System.out.println("Rest button clicked");
		player.heal(10);
		//maybe the player should only be able to rest every 25 seconds or so to prevent spam resting
	}
	
	public static void main(String[] args){
		GameEngine engine = new GameEngine();
		engine.startGame();
	}
}
