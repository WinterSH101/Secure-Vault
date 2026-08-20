package com.securevault.core;

public class VaultItem {
    private String itemName;
    private double itemValue;

    public VaultItem(String itemName, double itemValue) {
        throws InvalidItemValueException {
            if (itemValue <= 0) {
                throws new InvalidItemValueException ("item value must be greater than $0")
            };
        }
        this.itemName = itemName;
        this.itemValue = itemValue;
    }
    public String getItemName() {
        return itemName;
    }

    public String toString () {
        return itemValue
    }
    @override
    public String toString() {
        return "Item: " + itemName + ", Value: $ " + itemValue;
    }
}