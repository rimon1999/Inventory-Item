
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author remon
 */
public class FoodItem extends InventoryItem {

    private int foodLife;

    public FoodItem(String foodName, int foodLife) {
        super(foodName);
        this.foodLife = foodLife;

    }

    public void setFoodLife(int foodLife) {
        this.foodLife = foodLife;
    }

    public int getFoodLife() {
        return foodLife;

    }

    public String expireDate() {
        DateTimeFormatter expireDay = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime expireDate = now.plusDays(foodLife);
        return expireDate.format(expireDay);
    }

    public String toString() {
        return super.toString() + "\nShelf Life: " + foodLife + "\nRemove from shelf on: " + expireDate() + "\n--------------------------------";

    }
}
