//Inventory.java
import class Inventory implements Serializable{
    private int potions = 1;
    private int largePotions = 0;

    public void addPotion(){
        largePotions++;
    }

    public boolean useLargePotion(Creatrue slime){
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