package com.securevault.app;

import com.securevault.core.VaultItem;
import com.securevault.core.VaultManager;
import com.securevault.core.InvalidItemValueException;
import com.securevault.specialty.FragileItem;

public class Main {
  public static void main(String[] args)
          throws InvalidItemValueException, InvalidItemValueException {
    try {
      // Create an array of valid items
      VaultItem[] items = { 
        new VaultItem("Watch", 500.00),
              new FragileItem("Vase", 250.00, true),
        new VaultItem("Laptop", 1500.00),
        new FragileItem("Painting",800.00, false),
        new VaultItem("Ring", 2000.00)
      };

      VaultManager manager = new VaultManager();

      manager.selectionSort(items);

      System.out.println("Sorted Vault Items:");
       for (VaultItem item : items) {
         System.out.println(item);
       }
    } catch (InvalidItemValueException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
      
  
