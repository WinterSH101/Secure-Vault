package com.securevault.core;

  public class VaultManager {
  public void selectionSort(VaultItem[] items) {
    for (int i=0; i < items.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < items.length; j++) {
        if (items[j].getItemValue()
            < items[minIndex].getItemValue()) {
          minIndex = j;
        }
      }
      VaultItem temp = items[i];
      items[i] = items[minIndex];
      items[minIndex] = temp;
    }
  }
}
