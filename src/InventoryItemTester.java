
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author remon
 */
public class InventoryItemTester {

    Scanner scan = new Scanner(System.in);

    public InventoryItemTester() {
        System.out.println("Enter type of the item (either household or food), it's name, and shelf life or shipping weight(in pounds).\n"
                + "For example Food pizza 4 or Household TV 5, write stop to exit");
        InventoryItem[] in = new InventoryItem[50];
        int counter = 0;
        for (int i = 0; i < in.length; i++) {

            String input = scan.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            String[] splittedInput = input.split(" ");

            String itemType = splittedInput[0];
            String itemName = splittedInput[1];
            int life = Integer.parseInt(splittedInput[2]);
            double weight = Double.parseDouble(splittedInput[2]);

            if (itemType.equalsIgnoreCase("food")) {
                in[i] = new FoodItem(itemName, life);
            } else {
                in[i] = new HouseHold(itemName, weight);
            }

            counter++;
        }

        //if(itemType=)
        for (int i = 0; i < counter; i++) {

            System.out.println(in[i]);

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new InventoryItemTester();
    }

}
