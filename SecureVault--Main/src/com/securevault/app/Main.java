package com.securevault.app;
import com.securevault.core.VaultItem;
import com.sercurevault.core.InvalidItemValueException;

public class Main {
    public static void main(String[] args) {
        try {
            VaultItem validItem = new VaultItem("Watch", 500.00);
            System.out.println(validItem);

            VaultItem invalidItem = new VaultItem("Broken Item", 0);
            System.out.println(invalidItem);
        } catch (InvalidItemValueException e) {
            System.out.println("Error:" + e.getNessage());
        }
    }
}