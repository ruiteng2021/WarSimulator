import java.util.Scanner;
import java.util.Random;

public class BattleMain {
    private static Scanner input = new Scanner(System.in);
    private static Random randNum = new Random();
    private static Printer printer = new Printer();

    // player objects
    private static Role player = new Role("player");
    
    // computer objects
    private static Role computer = new Role("computer");

    private static boolean gameOver = false;
    private static boolean playerTurn = true; // player gets first turn
    private static boolean errorCatched;

    public static void main(String[] args) {

        //==================>>
        // character setup
        // print armour, warrior, weapon input
        printer.PrintMenuAll();
        System.out.println("What type of armour and weapon would you like or ");
        System.out.println("what warrior you want to be and ");
        System.out.println("what weather you would like have.");
        System.out.println("Select numbers with space between:");
        for(;;)
        {            
            // input string setup
            errorCatched = false; // need it to exit interner for loop
            String inputSetup = input.nextLine();
            String[] inputs = inputSetup.split(" "); 
            
            // check selected input is valid 
            if (inputs.length != 4) // currently we have 3 character choice
            {
                System.out.println("\nSelect 1 2 3 or 4");
                continue;
            }
            // check input strings are valid interger numbers
            int inputsnumber;
            for(int i = 0; i < inputs.length; i++)
            {
                try {
                    inputsnumber = Integer.parseInt(inputs[i]);                    
                } catch (NumberFormatException nfe) {
                    System.out.println("\nNot a right number");
                    System.out.println("Select only 1 2 or 3 or 4");
                    errorCatched = true; 
                    break;
                }

                if(inputsnumber >= 1 && inputsnumber <= printer.MenuSize()) {
                    continue; // valid input
                }
                else {                        
                    System.out.println("\nSelect only 1 2 3 or 4");
                    errorCatched = true;                        
                    break;
                }
            } // for loop

            if (errorCatched)
                continue; // input loop start again

            //idx of inputs: 0 is armour, 1 is warrior, 2 is weapon, 3 is weather
            player.CreateArmour(Integer.parseInt(inputs[0]));
            player.CreateWarrior(Integer.parseInt(inputs[1]));
            player.CreateWeapon(Integer.parseInt(inputs[2]));
            player.CreateWeather(Integer.parseInt(inputs[3]));            
            break;  

        } // for loop input string setup
          
        //==================>>
        // computer setup
        // random generate four selections of computer choice

        // armour
        computer.CreateArmour(randNum.nextInt(3) + 1);
        // warrior
        computer.CreateWarrior(randNum.nextInt(3) + 1);
        // weapon
        computer.CreateWeapon(randNum.nextInt(3) + 1);
        // weather
        computer.CreateWeather(randNum.nextInt(3) + 1);
        
        // game loop
        while(!gameOver) {       
            if(playerTurn) {
                int damage = player.weapon.Strike(
                    player.warrior.GetDexterity(),
                    player.warrior.GetStrength(),
                    player.weather.GetwindLevel());

                player.setTurn(true);
                printer.PrintWarriorStats(player, computer, damage);
                player.setTurn(false);
                
                if(computer.warrior.GetHealth() <= 0) {
                    gameOver = true;
                    break;
                }   
                playerTurn = !playerTurn;
            }
            else {
                int damage = computer.weapon.Strike(
                    computer.warrior.GetDexterity(),
                    computer.warrior.GetStrength(),
                    computer.weather.GetwindLevel());

                computer.setTurn(true);
                printer.PrintWarriorStats(player, computer, damage);
                computer.setTurn(false);

                if(player.warrior.GetHealth() <= 0) {
                    gameOver = true;
                    break;
                }
                playerTurn = !playerTurn;
            }
        } // gameloop
    } // main
} // class