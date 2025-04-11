package yarnwrap.screen;
public class CartographyTableScreenHandler { public net.minecraft.screen.CartographyTableScreenHandler wrapperContained; public CartographyTableScreenHandler(net.minecraft.screen.CartographyTableScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public yarnwrap.inventory.CraftingResultInventory resultInventory() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.resultInventory); }
// public void resultInventory(yarnwrap.inventory.CraftingResultInventory value) { wrapperContained.resultInventory = value.wrapperContained; }
// public long lastTakeResultTime() { return wrapperContained.lastTakeResultTime; }
// public void lastTakeResultTime(long value) { wrapperContained.lastTakeResultTime = value; }
public int MAP_SLOT_INDEX() { return wrapperContained.MAP_SLOT_INDEX; }
// public void MAP_SLOT_INDEX(int value) { wrapperContained.MAP_SLOT_INDEX = value; }
public int MATERIAL_SLOT_INDEX() { return wrapperContained.MATERIAL_SLOT_INDEX; }
// public void MATERIAL_SLOT_INDEX(int value) { wrapperContained.MATERIAL_SLOT_INDEX = value; }
public int RESULT_SLOT_INDEX() { return wrapperContained.RESULT_SLOT_INDEX; }
// public void RESULT_SLOT_INDEX(int value) { wrapperContained.RESULT_SLOT_INDEX = value; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
// public void updateResult(yarnwrap.item.ItemStack map,yarnwrap.item.ItemStack item,yarnwrap.item.ItemStack oldResult) { wrapperContained.updateResult(map.wrapperContained,item.wrapperContained,oldResult.wrapperContained); }

}