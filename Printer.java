public class Printer {

    private String[][] menus = { 
        { "Leather", "Human", "Club","Windy" },
        { "Chainmail", "Elf", "Sword", "Sunny" },
        { "Platemail", "Orc", "Axe", "Storm" } ,
        { "Cloak","Cleric","Longbows ", "Rainy"}};


    // console color printing
    public String ANSI_GREEN = "\u001B[32m"; 
    public final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";
    public static final String ANSI_BG_PURPLE = "\u001B[45m";
    public static final String ANSI_BRIGHT_BLUE   = "\u001B[94m";

    public Printer() {}

    public int MenuSize(){
        return menus.length;
    }

    public void PrintProgress (int loopCount){

        String chars = "|/-\\";
        int idx = 0;
        System.out.print("fighting: ");
        for (int i=0; i < loopCount; i++) {
            System.out.print("\b \b" + chars.charAt(idx));
            try 
                {
                    Thread.sleep(50);
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            idx = ++idx % chars.length();
        }
        System.out.print("\b \b");
        System.out.print("\nfighting end ");
    } // PrintProgress()

    public void PrintMenu(int menuType) {
        for(int col = 0; col < menus[menuType].length; col++) {
            System.out.println(col + 1 + ") " + menus[menuType][col]);
        }
    } // PrintMenu()

    public void PrintMenuAll() {

        System.out.println();
        System.out.println("            /\\_[]_/\\          |\\           _!_");
        System.out.println("           |] _||_ [|          \\\\         /___\\");
        System.out.println("    ___     \\/ || \\/            \\\\        [+++]");
        System.out.println("   /___\\       ||                \\\\    _ _\\^^^/_ _");
        System.out.println("  (|0 0|)      ||                 \\\\/ (    '-'  ( )");
        System.out.println("__/{\\U/}\\_ ___/vvv                 /( \\/ | {&}   /\\ \\");
        System.out.println("/ \\  {~}   / _|_P|                   \\  / \\     / _> )");
        System.out.println("| /\\  ~   /_/  []                    \"`   >:::;-'`\"\"\'-.");
        System.out.println("|_| (____)                               /:::/         \\");
        System.out.println("\\_]/______\\                             /  /||   {&}   |");
        System.out.println(" _\\_||_/_                              (  / (\\         /");
        System.out.println("(_,_||_,_)                            /_/ /  \\'-.___.-'");
        System.out.println();

        for (int row = 0; row < menus.length; row++ )
        {
            for(int col = 0; col < menus[row].length; col++) {
                System.out.printf("%d) %-20s", (row + 1), menus[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    } // PrintMenuAll()

    /*
    public void PrintArmourStats(Armour armour, String type) {
        System.out.println(ANSI_GREEN + "=======================================" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "====== Armour(" + type + ") =============" + ANSI_RESET);
        System.out.println("Armour points: " + armour.GetArmourPoints());
        System.out.println("Dexterity cost: -" + armour.GetDexCost());
    } // PrintArmourStats()
    */

    public void PrintWarriorStats(Role player, Role computer, int damage) {
        int playerFinalDex = player.warrior.GetDexterity() - player.armour.GetDexCost();        
        int computerFinalDex = computer.warrior.GetDexterity() - computer.armour.GetDexCost();

        System.out.print(String.format("\033[2J")); // send clear screen
        if (player.getTurn() ==  true){
            System.out.println();
            System.out.println("            /\\_[]_/\\          |\\           _!_");
            System.out.println("           |] _||_ [|          \\\\         /___\\");
            System.out.println("    ___     \\/ || \\/            \\\\        [+++]");
            System.out.println("   /___\\       ||                \\\\    _ _\\^^^/_ _");
            System.out.println("  (|0 0|)      ||                 \\\\/ (    '-'  ( )");
            System.out.println("__/{\\U/}\\_ ___/vvv                 /( \\/ | {&}   /\\ \\");
            System.out.println("/ \\  {~}   / _|_P|                   \\  / \\     / _> )");
            System.out.println("| /\\  ~   /_/  []                    \"`   >:::;-'`\"\"\'-.");
            System.out.println("|_| (____)                               /:::/         \\");
            System.out.println("\\_]/______\\                             /  /||   {&}   |");
            System.out.println(" _\\_||_/_                              (  / (\\         /");
            System.out.println("(_,_||_,_)                            /_/ /  \\'-.___.-'");
            System.out.println(); 
        }
        else
        {
            System.out.println();
            System.out.println("               /\\_[]_/\\                      _!_");
            System.out.println("              |] _||_ [|                    /___\\");
            System.out.println("    ___       \\/ // \\/                      [+++]");
            System.out.println("   /___\\        //                       _ _\\^^^/_ _");
            System.out.println("  (|0 0|)      //    ________________/  (    '-'  ( )");
            System.out.println("__/{\\U/}\\_ ___/vvv  \\--------------\\/ |      {&}   /\\ \\");
            System.out.println("/ \\  {~}   / _|_P|                     \\  / \\     / _> )");
            System.out.println("| /\\  ~   /_/                          \"` >:::;-'`\"\"\'-.");
            System.out.println("|_| (____)                               /:::/         \\");
            System.out.println("\\_]/______\\                             /  /||   {&}   |");
            System.out.println(" _\\_||_/_                              (  / (\\         /");
            System.out.println("(_,_||_,_)                            /_/ /  \\'-.___.-'");
            System.out.println(); 
        }

        System.out.println();   
        //System.out.print("echo %ESC%[32mGreen%ESC%[0m");
        System.out.printf("%s%-60s", ANSI_GREEN , "============ Player Stats ============");
        System.out.printf("%-60s%s",  "=========== Computer Stats ===========", ANSI_RESET);
        System.out.println();  

        if (player.getTurn() ==  true){
            System.out.printf("%s%-30s%-30d", ANSI_BRIGHT_BLUE, "Health:", player.warrior.GetHealth());
            System.out.printf("%-30s%-30d%s", "Health:", computer.warrior.TakeDamage(damage), ANSI_RESET);
            System.out.println();    
        }
        else{
            System.out.printf("%s%-30s%-30d", ANSI_BRIGHT_BLUE, "Health:", player.warrior.TakeDamage(damage));
            System.out.printf("%-30s%-30d%s", "Health:", computer.warrior.GetHealth(), ANSI_RESET); 
            System.out.println();
        }
        
        System.out.printf("%-30s%-30s", "Armour:", player.armour.GetArmourType());
        System.out.printf("%-30s%-30s", "Armour:", computer.armour.GetArmourType());
        System.out.println(); 

        System.out.printf("%-30s%-30s", "Worrior:", player.warrior.GetWarriorType());
        System.out.printf("%-30s%-30s", "Worrior:", computer.warrior.GetWarriorType());
        System.out.println(); 

        System.out.printf("%-30s%-30s", "Weapon:", player.weapon.GetWeaponType());
        System.out.printf("%-30s%-30s", "Weapon:", computer.weapon.GetWeaponType());
        System.out.println(); 

        System.out.printf("%-30s%-30s", "Weather:", player.weather.GetWeatherType());
        System.out.printf("%-30s%-30s", "Weather:", computer.weather.GetWeatherType());
        System.out.println(); 

        System.out.printf("%-30s%-30d", "Wind Level:", player.weather.GetwindLevel());
        System.out.printf("%-30s%-30d", "Wind Level:", computer.weather.GetwindLevel());
        System.out.println(); 

        System.out.printf("%-30s%-30d", "Armour Point:", player.armour.GetArmourPoints());
        System.out.printf("%-30s%-30d", "Armour Point:", computer.armour.GetArmourPoints());
        System.out.println(); 

        System.out.printf("%-30s%-30d", "Hit Probability:", player.weapon.GetHitProbability());
        System.out.printf("%-30s%-30d", "Hit Probability:", computer.weapon.GetHitProbability());
        System.out.println(); 

        System.out.printf("%-30s%-30d", "Dexterity:", player.warrior.GetDexterity());
        System.out.printf("%-30s%-30d", "Dexterity:", computer.warrior.GetDexterity());
        System.out.println(); 

        System.out.printf("%-30s%-30d", "Dexterity Cost(Armour):", player.armour.GetDexCost());
        System.out.printf("%-30s%-30d", "Dexterity Cost(Armour):", computer.armour.GetDexCost());
        System.out.println(); 

        System.out.printf("%-30s%-30d", "Final Dexterity:", playerFinalDex);
        System.out.printf("%-30s%-30d", "Final Dexterity:", computerFinalDex);
        System.out.println();     
        PrintProgress(30);
        
    } // PrintWarriorStats()
    
} // class