# Journal 

## Phase 1
I used private for the attributes because it prevents other classes from editing the data directly. For the constructor and the getter, I used a public modifier so other classes can create and view VaultItem objects. This protects the state of the objects because they can only be accessed in a controlled way, reducing the likelihood of accidental changes to the data.

## Phase 2
Set the superclass attribute by using super(itemName, itemValue) in the FragileItem constructor. This calls the VaultItem (Phase 1) constructor and sets the inherited item name and value. Another way would be to use protected attributes or getter methods, but still using the superclass constructor to keep the attributes private and better protected.

## Phase 3
The exception affects the FragileItem subclass because the constructor calls the VaultItem constructor using super(). If an invalid item is entered, the superclass throws the InvalidItemValueException, so if a FragileItem with a value less than 0 cannot be created. I think this is a good way to handle things because it enforces the value rule in one place and automatically applies to subclasses.

