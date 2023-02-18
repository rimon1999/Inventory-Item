/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author remon
 */
public class InventoryItem {

    private String itemName;

    public InventoryItem(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {

        return this.getClass().getSimpleName() + " name: " + itemName;
    }

}
