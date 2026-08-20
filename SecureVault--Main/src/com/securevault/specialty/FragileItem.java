package com.securevault.specialty;
import com.securevault.core.VaultItem;
import com.securevault.core.InvalidItemValueException;

public class FragileItem extends VaultItem {
    public boolean isWrapped;

    public FragileItem (String itemName, double itemValue, boolean isWrapped)
        throws InvalidItemValueException {

        super (itemName, itemValue);
        this.isWrapped = isWrapped;
    }
    public boolean getIsWrapped() {
        return isWrapped;
    }
    @ Override
    public String toString() {
        return super.toString () + ", Wrapped:" + isWrapped;
    }
}