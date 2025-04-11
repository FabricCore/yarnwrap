package yarnwrap.screen;
public class BrewingStandScreenHandler { public net.minecraft.screen.BrewingStandScreenHandler wrapperContained; public BrewingStandScreenHandler(net.minecraft.screen.BrewingStandScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public int INGREDIENT_SLOT_ID() { return wrapperContained.INGREDIENT_SLOT_ID; }
// public void INGREDIENT_SLOT_ID(int value) { wrapperContained.INGREDIENT_SLOT_ID = value; }
// public int FUEL_SLOT_ID() { return wrapperContained.FUEL_SLOT_ID; }
// public void FUEL_SLOT_ID(int value) { wrapperContained.FUEL_SLOT_ID = value; }
// public int BREWING_STAND_INVENTORY_SIZE() { return wrapperContained.BREWING_STAND_INVENTORY_SIZE; }
// public void BREWING_STAND_INVENTORY_SIZE(int value) { wrapperContained.BREWING_STAND_INVENTORY_SIZE = value; }
// public int PROPERTY_COUNT() { return wrapperContained.PROPERTY_COUNT; }
// public void PROPERTY_COUNT(int value) { wrapperContained.PROPERTY_COUNT = value; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
// public yarnwrap.screen.slot.Slot ingredientSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.ingredientSlot); }
// public void ingredientSlot(yarnwrap.screen.slot.Slot value) { wrapperContained.ingredientSlot = value.wrapperContained; }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
public int getFuel() { return wrapperContained.getFuel(); }
public int getBrewTime() { return wrapperContained.getBrewTime(); }

}