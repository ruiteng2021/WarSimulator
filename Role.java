import armour.*;
import warrior.*;
import weapon.*;
import weather.*;

// create one composition with role, which will be instantiated with palyer or computer

public class Role{

    public Armour armour;
    public Warrior warrior;
    public Weapon weapon;
    public Weather weather;
    private String who;
    private int choice;
    private boolean turn;

    public Role(String who)
    {
        this.who = who;
    } // Role

    // Getters
    public int getChoice()
    {
        return choice;
    } // getChoice

    public String getRole()
    {
        return who;
    } // getRole

    public boolean getTurn()
    {
        return turn;
    } // getTurn

    // Setters
    public void setRole(String who)
    {
        this.who = who;
    } // setRole

    public void setChoice(int choice)
    {
        this.choice = choice;
    } // setChoice

    public void setTurn(boolean turn)
    {
        this.turn = turn;
    } // setTurn

    public void CreateArmour(int choice) {

        this.choice = choice;
        switch(choice) {
            case 1:  // leather
                armour = new Leather();
                break;
            
            case 2:  // chainmail
                armour = new Chainmail();
                break;
            
            case 3:  // platemail                
                armour = new Platemail();     
                break;
            
            case 4:  // Cloak
                armour = new Cloak();
                break;
        
            default: 
                // oops
        }
    } // CreateArmour

    public void CreateWarrior(int choice) {

        this.choice = choice;
        switch(choice) {
            case 1:  // human
                warrior = new Human();
                break;
            
            case 2:  // elf
                warrior = new Elf();
                break;
            
            case 3:  // orc
                warrior = new Orc();
                break;
            
            case 4:  // Cleric
                warrior = new Cleric();
                break;
    
            default: 
                // oops            
        }
    } // CreateWarrior

    public void CreateWeapon(int choice) {

        this.choice = choice;
        switch(choice) {
            case 1:  // Club
                weapon = new Club();
                break;
            
            case 2:  // Sword
                weapon = new Sword();
                break;
            
            case 3: // Axe
                weapon = new Axe();
                break;
            
            case 4:  // Longbows
                weapon = new Longbows();
                break;
            
            default: 
                // oops
        }
    } // CreateWeapon

    public void CreateWeather(int choice) {

        this.choice = choice;
        switch(choice) {
            case 1:  // Windy
                weather = new Windy();
                break;
            
            case 2:  // Sunny
                weather = new Sunny();
                break;
            
            case 3: // Storm
                weather = new Storm();
                break;
            
            case 4:  // Rainy
                weather = new Rainy();
                break;
            
            default: 
                // oops
        }
    } // CreateWeather
    
} // class Role