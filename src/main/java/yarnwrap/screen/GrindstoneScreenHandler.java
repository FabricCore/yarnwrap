package yarnwrap.screen;
public class GrindstoneScreenHandler { public net.minecraft.screen.GrindstoneScreenHandler wrapperContained; public GrindstoneScreenHandler(net.minecraft.screen.GrindstoneScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(wrapperContained.input); }
// public void input(yarnwrap.inventory.Inventory value) { wrapperContained.input = value.wrapperContained; }
// public yarnwrap.inventory.Inventory result() { return new yarnwrap.inventory.Inventory(wrapperContained.result); }
// public void result(yarnwrap.inventory.Inventory value) { wrapperContained.result = value.wrapperContained; }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
public int INPUT_1_ID() { return wrapperContained.INPUT_1_ID; }
// public void INPUT_1_ID(int value) { wrapperContained.INPUT_1_ID = value; }
public int INPUT_2_ID() { return wrapperContained.INPUT_2_ID; }
// public void INPUT_2_ID(int value) { wrapperContained.INPUT_2_ID = value; }
public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public void OUTPUT_ID(int value) { wrapperContained.OUTPUT_ID = value; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
// public yarnwrap.item.ItemStack grind(yarnwrap.item.ItemStack item) { return new yarnwrap.item.ItemStack(wrapperContained.grind(item.wrapperContained)); }
// public void updateResult() { wrapperContained.updateResult(); }
// public void transferEnchantments(yarnwrap.item.ItemStack target,yarnwrap.item.ItemStack source) { wrapperContained.transferEnchantments(target.wrapperContained,source.wrapperContained); }
// public yarnwrap.item.ItemStack getOutputStack(yarnwrap.item.ItemStack firstInput,yarnwrap.item.ItemStack secondInput) { return new yarnwrap.item.ItemStack(wrapperContained.getOutputStack(firstInput.wrapperContained,secondInput.wrapperContained)); }
// public yarnwrap.item.ItemStack combineItems(yarnwrap.item.ItemStack firstInput,yarnwrap.item.ItemStack secondInput) { return new yarnwrap.item.ItemStack(wrapperContained.combineItems(firstInput.wrapperContained,secondInput.wrapperContained)); }

}