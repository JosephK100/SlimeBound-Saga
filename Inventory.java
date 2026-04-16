//Inventory.java
import java.io.Serializable;
public class Inventory implements Serializable{
    private int potions = 1;
    private int largePotions = 0;

    public void addPotion(){
        largePotions++;
    }

    public void addLargePotion(){
        largePotions++;
    }

    public boolean usePotion(Creature slime){
        if (potion > 0){
            potions--;
            slime.heal(20);
            return true;
        }
        return false;
    }

    public boolean useLargePotion(Creature slime){
        if (largePotions > 0){
            largePotions--;
            slime.heal(50);
            return true;
        }
        return false;
    }

    public void printInventory(){
        System.out.println("Potions: " + potions);
        System.out.print("Large Potions: " + largePotions);
    }
}