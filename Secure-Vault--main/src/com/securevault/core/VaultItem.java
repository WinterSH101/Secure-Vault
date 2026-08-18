package com.securevault.core;
import com.securevault.core.InvalidItemValueException;

//base class for items stored in the vaults
public class VaultItem {
    //Private attributes protect the object's data
    private final String itemName;
    private final double itemValue;

    //constructor check that the item has a valid value
    public VaultItem(String itemName, double itemValue)
            throws InvalidItemValueException {

        if (itemValue <= 0) {
            throw new InvalidItemValueException(
                    "item value must be greater than $0."
            );
        }
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    //Getter for item name
    public String getItemName() {

        return itemName;
    }

    //Getter for item value
    public double getItemValue() {
        return itemValue;
    }

    //Returns the item information to a formatted string
    @Override
    public String toString() {
        return "Item" + itemName + ", Value: $" + itemValue;

    }
}
