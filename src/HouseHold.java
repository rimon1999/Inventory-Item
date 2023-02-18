/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author remon
 */
public class HouseHold extends InventoryItem {

    private double itemWeight;
    final Double SHIPPINGFEE = 5.0;

    public HouseHold(String itemName, Double itemWeight) {
        super(itemName);
        this.itemWeight = itemWeight;

    }

    public Double shippingCost() {
        double shippingCost = itemWeight * SHIPPINGFEE;
        return shippingCost;
    }

    public String toString() {
        return super.toString() + "\nWeight in pounds: " + itemWeight + "\nShipping cost: $" + shippingCost() + "\n--------------------------------";
    }
}
