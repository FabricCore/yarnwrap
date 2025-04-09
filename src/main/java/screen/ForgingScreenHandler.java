package yarnwrap.screen;
public class ForgingScreenHandler { public net.minecraft.screen.ForgingScreenHandler wrapperContained; public ForgingScreenHandler(net.minecraft.screen.ForgingScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.CraftingResultInventory output() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.output); }
// public yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(wrapperContained.input); }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public java.util.List inputSlotIndices() { return wrapperContained.inputSlotIndices; }
// public int resultSlotIndex() { return wrapperContained.resultSlotIndex; }
// public void onTakeOutput(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.onTakeOutput(player.wrapperContained,stack.wrapperContained); }
// public boolean canUse(yarnwrap.block.BlockState state) { return wrapperContained.canUse(state.wrapperContained); }
// public boolean canTakeOutput(yarnwrap.entity.player.PlayerEntity player,boolean present) { return wrapperContained.canTakeOutput(player.wrapperContained,present); }
public void updateResult() { wrapperContained.updateResult(); }
// public yarnwrap.screen.slot.ForgingSlotsManager getForgingSlotsManager() { return new yarnwrap.screen.slot.ForgingSlotsManager(wrapperContained.getForgingSlotsManager()); }
// public void addPlayerInventorySlots(yarnwrap.entity.player.PlayerInventory playerInventory) { wrapperContained.addPlayerInventorySlots(playerInventory.wrapperContained); }
// public void addInputSlots(yarnwrap.screen.slot.ForgingSlotsManager forgingSlotsManager) { wrapperContained.addInputSlots(forgingSlotsManager.wrapperContained); }
// public void addResultSlot(yarnwrap.screen.slot.ForgingSlotsManager forgingSlotsManager) { wrapperContained.addResultSlot(forgingSlotsManager.wrapperContained); }
// public boolean isValidIngredient(yarnwrap.item.ItemStack stack) { return wrapperContained.isValidIngredient(stack.wrapperContained); }
public int getSlotFor(yarnwrap.item.ItemStack stack) { return wrapperContained.getSlotFor(stack.wrapperContained); }
// public yarnwrap.inventory.SimpleInventory createInputInventory(int size) { return new yarnwrap.inventory.SimpleInventory(wrapperContained.createInputInventory(size)); }
// public int getPlayerInventoryStartIndex() { return wrapperContained.getPlayerInventoryStartIndex(); }
public int getResultSlotIndex() { return wrapperContained.getResultSlotIndex(); }
// public int getPlayerInventoryEndIndex() { return wrapperContained.getPlayerInventoryEndIndex(); }
// public int getPlayerHotbarStartIndex() { return wrapperContained.getPlayerHotbarStartIndex(); }
// public int getPlayerHotbarEndIndex() { return wrapperContained.getPlayerHotbarEndIndex(); }

}