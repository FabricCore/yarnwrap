package yarnwrap.screen;
public class CartographyTableScreenHandler { public net.minecraft.screen.CartographyTableScreenHandler wrapperContained; public CartographyTableScreenHandler(net.minecraft.screen.CartographyTableScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public yarnwrap.inventory.CraftingResultInventory resultInventory() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.resultInventory); }
// public long lastTakeResultTime() { return wrapperContained.lastTakeResultTime; }
public int MAP_SLOT_INDEX() { return wrapperContained.MAP_SLOT_INDEX; }
public int MATERIAL_SLOT_INDEX() { return wrapperContained.MATERIAL_SLOT_INDEX; }
public int RESULT_SLOT_INDEX() { return wrapperContained.RESULT_SLOT_INDEX; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void updateResult(yarnwrap.item.ItemStack map,yarnwrap.item.ItemStack item,yarnwrap.item.ItemStack oldResult) { wrapperContained.updateResult(map.wrapperContained,item.wrapperContained,oldResult.wrapperContained); }

}