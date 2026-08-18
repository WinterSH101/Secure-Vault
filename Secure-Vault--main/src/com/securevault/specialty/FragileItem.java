package com.securevault.specialty;
import com.securevault.core.VaultItem;
import com.securevault.core.InvalidItemValueException;

//Represents a fragile item that may need protective wrapping
public class FragileItem extends VaultItem {
  //store whether the item is wrapped
  private boolean isWrapped;
  //Constructor
  public FragileItem(String itemName, double itemValue, boolean isWrapped) 
    throws InvalidItemValueException {
    super(itemName, itemValue);
    this.isWrapped = isWrapped;
  }
  //Getter for wrapping status
  public boolean getIsWrapped() {
    return isWrapped;
  }
  // Override the VaultItem toString method
  @Override
  public String toString() {
    return super.toString() + ", Wrapped:" + isWrapped;
  }
}
