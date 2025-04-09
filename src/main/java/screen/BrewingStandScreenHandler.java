package yarnwrap.screen;
public class BrewingStandScreenHandler { public net.minecraft.screen.BrewingStandScreenHandler wrapperContained; public BrewingStandScreenHandler(net.minecraft.screen.BrewingStandScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public int INGREDIENT_SLOT_ID() { return wrapperContained.INGREDIENT_SLOT_ID; }
// public int FUEL_SLOT_ID() { return wrapperContained.FUEL_SLOT_ID; }
// public int BREWING_STAND_INVENTORY_SIZE() { return wrapperContained.BREWING_STAND_INVENTORY_SIZE; }
// public int PROPERTY_COUNT() { return wrapperContained.PROPERTY_COUNT; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public yarnwrap.screen.slot.Slot ingredientSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.ingredientSlot); }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
public int getFuel() { return wrapperContained.getFuel(); }
public int getBrewTime() { return wrapperContained.getBrewTime(); }

}