package yarnwrap.screen;
public class StonecutterScreenHandler { public net.minecraft.screen.StonecutterScreenHandler wrapperContained; public StonecutterScreenHandler(net.minecraft.screen.StonecutterScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.slot.Slot inputSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.inputSlot); }
// public yarnwrap.screen.slot.Slot outputSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.outputSlot); }
public yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(wrapperContained.input); }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public yarnwrap.screen.Property selectedRecipe() { return new yarnwrap.screen.Property(wrapperContained.selectedRecipe); }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public java.util.List availableRecipes() { return wrapperContained.availableRecipes; }
// public yarnwrap.item.ItemStack inputStack() { return new yarnwrap.item.ItemStack(wrapperContained.inputStack); }
// public long lastTakeTime() { return wrapperContained.lastTakeTime; }
// public java.lang.Runnable contentsChangedListener() { return wrapperContained.contentsChangedListener; }
// public yarnwrap.inventory.CraftingResultInventory output() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.output); }
public int INPUT_ID() { return wrapperContained.INPUT_ID; }
public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public int OUTPUT_START() { return wrapperContained.OUTPUT_START; }
// public int OUTPUT_END() { return wrapperContained.OUTPUT_END; }
// public void updateInput(yarnwrap.inventory.Inventory input,yarnwrap.item.ItemStack stack) { wrapperContained.updateInput(input.wrapperContained,stack.wrapperContained); }
public void setContentsChangedListener(java.lang.Runnable contentsChangedListener) { wrapperContained.setContentsChangedListener(contentsChangedListener); }
public int getSelectedRecipe() { return wrapperContained.getSelectedRecipe(); }
public java.util.List getAvailableRecipes() { return wrapperContained.getAvailableRecipes(); }
public int getAvailableRecipeCount() { return wrapperContained.getAvailableRecipeCount(); }
public boolean canCraft() { return wrapperContained.canCraft(); }
// public void populateResult() { wrapperContained.populateResult(); }
// public boolean isInBounds(int id) { return wrapperContained.isInBounds(id); }
// public yarnwrap.recipe.input.SingleStackRecipeInput createRecipeInput(yarnwrap.inventory.Inventory inventory) { return new yarnwrap.recipe.input.SingleStackRecipeInput(wrapperContained.createRecipeInput(inventory.wrapperContained)); }

}